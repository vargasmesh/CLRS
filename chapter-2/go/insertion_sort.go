package insertion_sort

import "golang.org/x/exp/constraints"

type Less[T any] func(t1, t2 T) bool

func InsertionSort[T any](array []T, less Less[T]) {
	for i := 1; i < len(array); i++ {
		key := array[i]
		j := i - 1

		for j >= 0 && less(key, array[j]) {
			array[j+1] = array[j]
			j--
		}

		array[j+1] = key
	}
}

func Min[T constraints.Integer](t1, t2 T) bool {
	return t1 < t2
}
