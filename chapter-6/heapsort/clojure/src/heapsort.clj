(ns heapsort)

(defn- parent [index]
  (quot index 2))

(defn- left [index]
  (* index 2))

(defn- right [index]
  (inc (* index 2)))

(defn- swap
  "Swap the elements of the i and j indexes"
  [array i j]
  (assoc array i (array j) j (array i)))

(defn- down [current-idx end-idx heap less]
  (let [l (left current-idx)
        r (right current-idx)
        largest (-> current-idx
                    (#(if (and (<= l end-idx)
                               (less (get heap l) (get heap %)))
                        l %))
                    (#(if (and (<= r end-idx)
                               (less (get heap r) (get heap %)))
                        r %)))]
    (if (not= current-idx largest)
      (recur largest end-idx (swap heap current-idx largest) less)
      heap)))

(defn max-heap [t1 t2]
  (> t1 t2))

(defn heapify [array less]
  (let [size (count array)
        last-index (dec size)
        middle (quot size 2)]
    (loop [i middle array array]
      (if (>= i 0)
        (recur (dec i) (down i last-index array less))
        array))))

