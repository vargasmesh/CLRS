import random

from merge_sort import merge_sort


def test_empty():
    empty = []
    merge_sort(empty, 0, 0)
    assert empty == []


def test_already_sorted():
    array_sorted = [1, 2, 3]
    merge_sort(array_sorted, 0, len(array_sorted) - 1)
    assert array_sorted == [1, 2, 3]


def test_unsorted():
    array = [3, 2, 1]
    merge_sort(array, 0, len(array) - 1)
    assert array == [1, 2, 3]


def test_random_array():
    array = list(random.sample(range(0, 100000), 100))
    merge_sort(array, 0, len(array) - 1)
    assert all(array[i] <= array[i + 1] for i in range(len(array) - 1))
