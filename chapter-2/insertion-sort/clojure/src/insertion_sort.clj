(ns insertion-sort)

(defn- swap
  "Swap the elements of the i and j indexes"
  [array i j]
  (assoc array i (array j) j (array i)))

(defn- sort-item [array idx]
  (loop [j idx array array]
    (if (and (pos? j)
             (< (get array j) (get array (dec j))))
      (recur (dec j) (swap array j (dec j)))
      array)))

(defn insertion-sort [array]
  (let [size (count array)]
    (loop [i 1 sorted-array array]
      (if (< i size)
        (recur (inc i) (sort-item sorted-array i))
        sorted-array))))
