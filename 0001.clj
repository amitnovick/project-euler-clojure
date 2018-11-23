;; 1) Multipliers of 3 and 5

(defn is-mod-three [n]
  (= (mod n 3) 0))

(defn is-mod-five [n]
  (= (mod n 5) 0))

(defn remove-bad-nums [numbers]
  (defn is-good-num [n]
    (or (is-mod-three n) (is-mod-five n)))
  (filter is-good-num numbers))

(defn sum-good-nums [n]
  (reduce + (remove-bad-nums (range 1 n))))

(sum-good-nums 1000)