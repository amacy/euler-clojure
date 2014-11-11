; also, make sure we have an even number
(defn largest-possible-factor [i]
  (let [val (if (even? i) i (- i 1))]
    (/ val 2)))

; shouldn't iterate here
(defn prime? [i]
  (let [half (largest-possible-factor i)]
    (loop [candidate 2]
      (if (= (mod i candidate) 0)
        false
        (if (> candidate half)
          true
          (recur (+ 1 candidate)))))))

; shouldn't iterate here
(defn next-prime-factor [i last-prime-factor]
  (let [half (largest-possible-factor i)]
    (loop [candidate (+ 1 last-prime-factor)]
      (if (= candidate half)
        last-prime-factor
        (if (and (= (mod i candidate) 0) (prime? candidate))
          candidate
          (recur (+ 1 candidate)))))))

; shouldn't iterate here
(defn prime-factors [i]
  (loop [factors '(1)
         candidate 2]
    (let [last-factor (first factors)]
      (if (= (reduce * factors) i)
        factors
        (recur (cons (next-prime-factor i last-factor) factors)
               (+ 1 candidate))))))

(def number 600851475143)
(first (prime-factors number))
