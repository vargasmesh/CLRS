(ns insertion-sort)

(defn- sort-item [array idx]
  (let [current-value (get array idx)]
    (loop [i idx array array]
      (let [left-value (get array (dec i))]
        (if (and (pos? i)
                 (> left-value current-value))
          (recur (dec i) (assoc array i left-value))
          (assoc array i current-value))))))

(defn insertion-sort [array]
  (let [size (count array)]
    (loop [i 1 sorted-array array]
      (if (< i size)
        (recur (inc i) (sort-item sorted-array i))
        sorted-array))))
