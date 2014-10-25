(ns kiri.core )
;(:require kiri.macros)
(println *ns*)


; (import '(javax.swing JLabel JButton JPanel JFrame JOptionPane))
; (import java.awt.event.ActionListener)

; (defn rand-between [lo hi] (+ lo (rand-int (- hi lo))))
; (defn rand-char [] 
;     ( let [ INT_CC 0
;             CAP_CC 1
;             LOW_CC 2 ]
;         ( condp = (rand-int 3)
;             INT_CC "digit"
;             CAP_CC "capital letter"
;             LOW_CC "lowercase letter" )))
    

; ;(defmacro on-action [component event & body] `(. ~component addActionListener (proxy [java.awt.event.ActionListener] [] (actionPerformed [~event] ~@body))))

; (defn core []
;     (let [  label (JLabel. "Generate Password")
;             button (doto (JButton. "Generate")
;                 (on-action event (JOptionPane/showMessageDialog nil "Hello, World")))
;             panel (doto (JPanel.)
;                     (.setOpaque true)
;                     (.add label)
;                     (.add button))]     
;         (doto (JFrame. "Kiri v0.1")
;             (.setContentPane panel)
;             (.setSize 640 480)
;             (.setVisible true))))


;(core)