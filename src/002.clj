(defn fibonacci [max-number]
    (loop [payload '(2 1)
           i 3]
      (let [last-i (first payload)]
        (if (>= i max-number)
          payload
          (recur (cons i payload)
                 (+ i last-i))))))

(reduce + (filter even? (fibonacci 4000000)))
