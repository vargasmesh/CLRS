(ns heapsort)

(defn- parent [index]
  (quot index 2))

(defn- left [index]
  (* index 2))

(defn- right [index]
  (inc (* index 2)))

(defn- max-heapify [current-idx end-idx heap]
  (let [l (left current-idx)
        r (right current-idx)
        largest (-> current-idx
                    (#(if (and (<= l end-idx)
                               (> (get heap l) (get heap %)))
                        l %))
                    (#(if (and (<= r end-idx)
                               (> (get heap r) (get heap %)))
                        r %)))]
    (if (not= current-idx largest)
      (recur largest end-idx (assoc heap largest (heap current-idx) current-idx (heap largest)))
      heap)))

(defn max-heap [array]
  (let [size (count array)
        last-index (dec size)
        middle (quot size 2)]
    (loop [i middle array array]
      (if (>= i 0)
        (recur (dec i) (max-heapify i last-index array))
        array))))

