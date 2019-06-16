(ns recursion)

(defn product [coll]
  (if (empty? coll)
    1
    (* (first coll)
       (product (rest coll)))))

(defn singleton? [coll]
  (if (and
        (seq coll)
        (empty? (rest coll)))
          true
          false))

(defn my-last [coll]
  (if (empty? coll)
    nil
    (last coll)))

(defn max-element [a-seq]
  (if (empty? a-seq)
    nil
   (apply max a-seq)))

(defn seq-max [seq-1 seq-2]
  (if (> (count seq-1)(count seq-2))
    seq-1
    seq-2))

(defn longest-sequence [a-seq]
  (if (empty? a-seq)
    nil
    (seq-max (first a-seq)
           (longest-sequence (rest a-seq)))))

(defn my-filter [pred? a-seq]
    (if (empty? a-seq)
      a-seq
      (if (pred? (first a-seq))
            (cons (first a-seq)
                  (my-filter pred? (rest a-seq)))
            (my-filter pred? (rest a-seq)))))

(defn sequence-contains? [elem a-seq]
  (cond
    (empty? a-seq)
      false
    (= (first a-seq) elem)
      true
      (sequence-contains? elem (rest a-seq))
      true
    :else
      false))

(defn my-take-while [pred? a-seq]
  (let [f (first a-seq)]
  (cond
    (empty? a-seq)
    '()
    (pred? f)
      (cons f
      (my-take-while pred? (rest a-seq)))
      :else
        '())))

(defn my-drop-while [pred? a-seq]
  (let [f (first a-seq)]
    (cond
      (empty? a-seq)
      '()
      (pred? f)
        (my-drop-while pred? (rest a-seq))
      :else
        a-seq)))

(defn seq= [a-seq b-seq]
  (= a-seq b-seq))

(defn my-map [f seq-1 seq-2]
  (cond
    (and (empty? seq-1) (empty? seq-2))
      []
    (or (empty? seq-1) (empty? seq-2))
      '()
    :else
    (cons
      (f (first seq-1) (first seq-2))
        (my-map f (rest seq-1) (rest seq-2)))))

(defn power [n k]
  (if (zero? k)
    1
    (* n (power n (dec k)))))


(defn fib [n]
  (cond
    (= 0 n)
      0
    (= 1 n)
      1
    :else
    (+ (fib (dec n)) (fib (dec (dec n))))))

(defn my-repeat [how-many-times what-to-repeat]
  (if (>= 0 how-many-times)
      '()
      (cons what-to-repeat (my-repeat (dec how-many-times) what-to-repeat))))



(defn my-range [up-to]
  (if (= 0 up-to)
    '()
    (cons (dec up-to) (my-range (dec up-to)))
    )
  )

(defn tails [a-seq]
  (if (empty? a-seq)
    '(())
    (cons (seq a-seq) (tails (rest a-seq)))))

(defn inits [a-seq]
  (map reverse (tails (reverse a-seq))))

(defn rotations [a-seq]
  (if (empty? a-seq)
    '(())
    (cons (seq a-seq) [8])))




(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies [a-seq]
  [:-])

(defn un-frequencies [a-map]
  [:-])

(defn my-take [n coll]
  [:-])

(defn my-drop [n coll]
  [:-])

(defn halve [a-seq]
  [:-])

(defn seq-merge [a-seq b-seq]
  [:-])

(defn merge-sort [a-seq]
  [:-])

(defn split-into-monotonics [a-seq]
  [:-])

(defn permutations [a-set]
  [:-])

(defn powerset [a-set]
  [:-])

