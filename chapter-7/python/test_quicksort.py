import random

from quicksort import quicksort


def test_random_array():
    array = list(random.sample(range(-50, 50), 10))
    quicksort(array)
    assert all(array[i] <= array[i + 1] for i in range(len(array) - 1))
