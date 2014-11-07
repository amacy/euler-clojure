(defn multiple-of-3? [i]
  (= (mod i 3) 0))

(defn multiple-of-5? [i]
  (= (mod i 5) 0))

(defn multiple-of-3-or-5? [i]
  (or (multiple-of-3? i) (multiple-of-5? i)))

(defn multiples-of-3-and-5 [is]
  (keep #(if(multiple-of-3-or-5? %) %) is))

(reduce + (multiples-of-3-and-5 (range 1000)))
