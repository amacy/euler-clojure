(defn fibonacci [a b]
  (if (< a 4000000)
    (cons a (lazy-seq (fibonacci b (+ b a))))))

(reduce + (filter even? (fibonacci 1 1)))
