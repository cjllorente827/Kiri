(ns kiri.utils)

(defn rand-between [lo hi] (+ lo (rand-int (- hi lo))))
(defn rand-char [] 
    ( let [ INT_CC 0
            CAP_CC 1
            LOW_CC 2 ]
        ( condp = (rand-int 3)
            INT_CC "1"
            CAP_CC "A"
            LOW_CC "z" )))

(defn generate-password []
	(apply str
		(for [x (range 0 8)] (rand-char) )))