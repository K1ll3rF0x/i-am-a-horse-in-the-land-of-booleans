(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

; (not nil) will return 'false for nil which simplifies things.
(defn boolean [x]
  (not (not x)))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (condp divides? n
    15 "gotcha!"
    3 "fizz"
    5 "buzz"
    ""))

(defn teen? [age]
  (< 12 age 20))

(def not-teen? (complement teen?))

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (sequential? x) (* (count x) 2)
    :else true))

(defn leap-year? [year]
  (if (divides? 100 year)
    (divides? 400 year)
    (divides? 4 year)))

; '_______'
