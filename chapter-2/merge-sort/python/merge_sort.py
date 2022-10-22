def _merge(array, p, q, r):
    nl = q - p + 1
    nr = r - q

    L = array[p : p + nl].copy()
    R = array[q + 1 : q + 1 + nr].copy()

    i = 0
    j = 0
    k = p

    while i < nl and j < nr:
        if L[i] <= R[j]:
            array[k] = L[i]
            i += 1
        else:
            array[k] = R[j]
            j += 1
        k += 1

    while i < nl:
        array[k] = L[i]
        i += 1
        k += 1

    while j < nr:
        array[k] = R[j]
        j += 1
        k += 1

    return array  # to track on hunter


def merge_sort(array: list[int], p: int, r: int):
    if p >= r:
        return

    q = (p + r) // 2
    merge_sort(array, p, q)
    merge_sort(array, q + 1, r)
    _merge(array, p, q, r)
