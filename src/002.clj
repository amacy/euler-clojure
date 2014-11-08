(defn fibonacci [max-number]
    (loop [payload '(2 1)
           i 3]
      (let [last-i (first payload)
            next-i (+ i last-i)]
        (if (>= i max-number)
          payload
          (recur (cons i payload)
                 next-i)
            ))))

(reduce + (filter even? (fibonacci 4000000)))
