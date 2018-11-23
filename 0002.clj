;; 2) Even Fibonacci numbers

(defn next-fib [[prev cur]]
  [cur (+ prev cur)])

(defn add-if-even [m, n]
  (if (even? n)
    (+ m n)
    m))

(defn conditioned-addition [m n]
  (if (> n 4000000)
    (reduced m)
    (add-if-even m n)))

(defn remove-if-odd [x m]
  (if (even? m)
    x
    (- x m)))

(def start-pair [1,2])
(def fib-seq (map first (iterate next-fib start-pair)))
(def sum-assume-first-is-even (reduce conditioned-addition fib-seq))
(def first-elem (get start-pair 0))
(remove-if-odd sum-assume-first-is-even first-elem)
