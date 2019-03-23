(ns script-clj.core)

; 初期メソッド
(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main []
  (foo "main"))

;; p.54-

(def a '(1 2 3 4))
(first a)
(rest a)

(def b [1 2 3 4])
(first b)
(rest b)

(cons 123 a)
(seq a)
(next a)


;; list
(def a '(1 2 3))

;; vector
(def b [1 2 3])

;; map
(def c {:a 1 :b 2 :c 3})

;; set
(def d #{1 2 3 4})

;; sorted map
(sorted-map :b 1 :a 3 :c 4)

;; sorted set
(sorted-set :b :a :c)


;; conj
(conj '(a b c) '(1 2 3))

;; into
(into '(a b c) '(1 2 3))


