;; 1) Multipliers of 3 and 5

(defn is-mod-three [n]
  (= (mod n 3) 0))

(defn is-mod-five [n]
  (= (mod n 5) 0))

(defn is-good-num [n]
  (or (is-mod-three n) (is-mod-five n)))

(defn sum-good-nums [n]
  (reduce + (filter is-good-num (range 1 n))))

(sum-good-nums 1000)