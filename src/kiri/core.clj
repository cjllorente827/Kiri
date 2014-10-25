(ns kiri.core 
    (:require [kiri.macros :refer :all])
    (:require [kiri.utils :as utils]))

(import '(javax.swing JLabel JButton JPanel JFrame JOptionPane))
(import java.awt.event.ActionListener)

(defn -main []
    (let [  label (JLabel. "Generate Password")
            output (JLabel. "Test did not work")
            button (doto (JButton. "Generate")
                (on-action event (.setText output (utils/generate-password) )))
            panel (doto (JPanel.)
                    (.setOpaque true)
                    (.add label)
                    (.add output)
                    (.add button))]     
        (doto (JFrame. "Kiri v0.1")
            (.setContentPane panel)
            (.setSize 640 480)
            (.setVisible true))))


