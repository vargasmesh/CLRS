import random

from insertion_sort import insertion_sort


def test_insertion_sort():
    array = list(random.sample(range(0, 100000), 100))
    insertion_sort(array)
    assert all(array[i] <= array[i + 1] for i in range(len(array) - 1))
