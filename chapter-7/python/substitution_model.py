from hunter import trace, Q

from quicksort import quicksort

trace(Q(module="quicksort", kind="call") | Q(module="quicksort", kind="return"))

array = [8, 2, 1, 5, -2, -5, -9, -1]
quicksort(array)
