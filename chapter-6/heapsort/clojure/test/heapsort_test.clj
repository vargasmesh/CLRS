(ns heapsort-test
  (:require [clojure.test :refer [deftest is]])
  (:require [heapsort :refer [max-heap]]))

(deftest test-max-heap
  (is (= (max-heap [1 5 3 4 10]) [10 5 3 4 1])))
