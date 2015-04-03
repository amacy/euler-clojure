;(defn palindrome? [i]
;  (def i-count (count (str i)))
;  (loop [i-to-a '() 
;        remaining-num i]
;    (let [n (mod remaining-num 10)]
;      (if (= i-count (count i-to-a))
;        i-to-a 
;        ;(= (reverse i-to-a) i-to-a)
;        (recur (cons n i-to-a) 
;               n)))))

; broke
(defn number-to-a [i]
  (loop [num-to-convert i
         num-array '()]
    (let [last-digit (mod num-to-convert 10)
          remaining-num (/ num-to-convert 10)]
      (cons last-digit num-array)
      (if (= (count (str remaining-num)) 0)
        num-array
        (recur remaining-num 
               num-array)))))
  

; (defn palindromes
;   ;(let [range1 (range 100 1000)])
;   ;(let [range2 (range 100 1000)])
;   )
; 
; 
; (apply max palindromes)
