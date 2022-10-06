def partition(A, p, r):
    pivot = A[r]
    i = p

    for j in range(p, r):
        if A[j] <= pivot:
            A[i], A[j] = A[j], A[i]
            i += 1

    A[i], A[r] = A[r], A[i]
    return i


def qsort(array, p, r):
    if p < r:
        q = partition(array, p, r)
        qsort(array, p, q - 1)
        qsort(array, q + 1, r)


def quicksort(array):
    p = 0
    r = len(array) - 1

    qsort(array, p, r)
