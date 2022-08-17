(ns insertion-sort-test
  (:require [clojure.test :refer :all])
  (:require [insertion-sort :refer [insertion-sort]]))

(deftest empty-array
  (is (= (insertion-sort []) [])))

(deftest single-item
  (is (= (insertion-sort [1]) [1])))

(deftest already-sorted
  (is (= (insertion-sort [1 2 3]) [1 2 3])))

(deftest unsorted-1
  (is (= (insertion-sort [3 2 1]) [1 2 3])))
