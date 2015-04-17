(defn remove-last-char [string]
  (clojure.string/replace string #".$" ""))

(defn last-char [string]
  (re-find #".$" string))

(defn number-to-a [i]
  (let [num-str (str i)]
  (loop [num-to-convert num-str
         num-array '()]
    (let [last-digit (last-char num-to-convert)
          remaining-num (remove-last-char num-to-convert)]
      (if (= (count remaining-num) 0)
        (cons last-digit num-array)
        (recur remaining-num
               (cons last-digit num-array)))))))

(defn palindrome? [i]
  (let [num-array (number-to-a i)]
    (= num-array (reverse num-array))))

; need a new approach here
;
;(defn find-palindromes
;  (let [range1 (range 100 1000)
;        range2 (range 100 1000)]
;    (loop [outer-range range1
;           inner-range range2
;           palindromes '()]
;      (let [candidate (palindrome? (* (take 1 range1) (take 1 range2)))]
;      (if (palindrome? candidate)
;        (recur range1
;               (rest range2)
;               (cons candatidate palindromes))
;        (recur range1
;               (rest range2)
;               palindromes))))))
;        
; (apply max palindromes)
