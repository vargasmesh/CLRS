(ns heapsort-test
  (:require [clojure.test :refer [deftest is]])
  (:require [heapsort :refer [heapify max-heap]]))

(deftest test-max-heap
  (is (= (heapify [1 5 3 4 10] max-heap) [10 5 3 4 1])))
