(ns kiri.macros)
(defmacro on-action [component event & body] `(. ~component addActionListener (proxy [java.awt.event.ActionListener] [] (actionPerformed [~event] ~@body))))