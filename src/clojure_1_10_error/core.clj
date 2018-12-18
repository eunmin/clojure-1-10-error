(ns clojure-1-10-error.core)

(add-tap #(println "1:" %))

(add-tap #(println "2:" %))

(add-tap #(println "3:" %))

(defn -main [& args]
  (tap> "Hello"))
