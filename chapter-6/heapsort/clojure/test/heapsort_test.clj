(ns heapsort-test
  (:require [clojure.test :refer [deftest is]])
  (:require [heapsort :refer [heapify max-heap heapsort]]))

(deftest test-max-heap
  (is (= (heapify [1 5 3 4 10] max-heap) [10 5 3 4 1])))

(deftest test-heapsort
  (is (= (heapsort (shuffle (range 10))) [0 1 2 3 4 5 6 7 8 9])))
