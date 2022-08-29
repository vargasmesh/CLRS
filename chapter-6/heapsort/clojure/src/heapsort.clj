(ns heapsort)

(defn- parent [index]
  (quot index 2))

(defn- left [index]
  (* index 2))

(defn- right [index]
  (inc (* index 2)))

(defn- max-heapify [array idx]
  (let [l (left idx)
        r (right idx)
        size (count array)
        largest (-> idx
                    (#(if (and (< l size)
                               (> (get array l) (get array %)))
                        l %))
                    (#(if (and (< r size)
                               (> (get array r) (get array %)))
                        r %)))]
    (if (not= idx largest)
      (recur (assoc array largest (array idx) idx (array largest)) largest)
      array)))

(defn max-heap [array]
  (let [size (count array)
        middle (quot size 2)]
    (loop [i middle array array]
      (if (>= i 0)
        (recur (dec i) (max-heapify array i))
        array))))

