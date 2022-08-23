(ns merge-sort-test
  (:require [clojure.test :refer :all])
  (:require [merge-sort :refer [merge-sort]]))

(deftest sort-with-merge-sort
  (testing "Merge Sort")
  (is (= (merge-sort []) []))
  (is (= (merge-sort [1 2 3]) [1 2 3]))
  (is (= (merge-sort [3 2 1]) [1 2 3]))
  (is (= (merge-sort (shuffle (range 10))) [0 1 2 3 4 5 6 7 8 9])))
