(import (javax.swing JLabel JButton JPanel JFrame JOptionPane))
(import java.awt.event.ActionListener)

(defmacro on-action [component event & body]
  `(. ~component addActionListener
      (proxy [java.awt.event.ActionListener] []
        (actionPerformed [~event] ~@body))))

(defn klefkiApp []
	(let [	label (JLabel. "Generate Password")
			button (doto (JButton. "Generate")
				(on-action event
					(JOptionPane/showMessageDialog nil "Hello, World")))
			panel (doto (JPanel.)
					(.setOpaque true)
					(.add label)
					(.add button))]		
		(doto (JFrame. "Klefki v0.1")
			(.setContentPane panel)
			(.setSize 640 480)
			(.setVisible true))))

(klefkiApp)