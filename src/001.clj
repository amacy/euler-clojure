(defn multiple-of-3? [i]
  (= (mod i 3) 0))

(defn multiple-of-5? [i]
  (= (mod i 5) 0))

(defn multiple-of-3-or-5? [i]
  (or (multiple-of-3? i) (multiple-of-5? i)))

(defn multiples-of-3-and-5 [is]
  (loop [payload '()
         tail_is (seq is)]
    (if tail_is
      (if (multiple-of-3-or-5? (first tail_is))
        (recur (cons (first tail_is) payload)
               (next tail_is))
        (recur (cons 0 payload)
               (next tail_is)))
      payload)))


(reduce + (multiples-of-3-and-5 (range 1000)))
