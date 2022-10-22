from hunter import trace, Q

from merge_sort import merge_sort

trace(Q(module="merge_sort", kind="call") | Q(module="merge_sort", kind="return"))

array = [8, 2, 1, 5, -2, -5, -9, -1]
merge_sort(array, 0, len(array) - 1)
