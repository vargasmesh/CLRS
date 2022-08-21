package insertion_sort_test

import (
	"insertion_sort"
	"math/rand"
	"sort"
	"testing"
	"time"
)

func TestInsertionSort(t *testing.T) {
	rand.Seed(time.Now().UnixNano())

	n := rand.Intn(10000)

	for i := 0; i < 5; i++ {
		t.Run("", func(t *testing.T) {

			slice := make([]int, n)
			for i := 0; i < n; i++ {
				slice[i] = -1000000 + rand.Intn(2000000)
			}

			insertion_sort.InsertionSort(slice, insertion_sort.Min[int])

			if !sort.IntsAreSorted(slice) {
				t.Fatal("insertion sort did not work")
			}
		})
	}
}
