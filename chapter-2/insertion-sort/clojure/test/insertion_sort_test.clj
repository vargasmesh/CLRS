(ns insertion-sort-test
  (:require [clojure.test :refer :all])
  (:require [insertion-sort :refer [insertion-sort]]))

(deftest insertion-sort-test
  (is (= (insertion-sort []) []))
  (is (= (insertion-sort [1 2 3]) [1 2 3]))
  (is (= (insertion-sort [3 2 1]) [1 2 3]))
  (is (= (insertion-sort (shuffle (range 10))) [0 1 2 3 4 5 6 7 8 9])))
