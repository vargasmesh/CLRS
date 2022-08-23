(ns merge-sort)

(defn mrg
  [p q]
  (let [pf (first p)
        ps (rest p)
        qf (first q)
        qs (rest q)]
    (lazy-seq
     (cond
       (nil? qf)  p
       (nil? pf)  q
       (< pf qf) (cons pf (mrg ps q))
       :else     (cons qf (mrg p  qs))))))

(defn merge-sort [array]
  (let [size (count array)]
    (if (> size 1)
      (let [sides (split-at (/ size 2) array)]
        (mrg (merge-sort (get sides 0)) (merge-sort (get sides 1))))
      array)))

