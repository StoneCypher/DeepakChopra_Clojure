(defproject deepak-chopra "0.1.0"
  :description "Deepak Chopra nonsense phrase generator implementation in Clojure"
  :url "https://github.com/StoneCypher/DeepakChopra_Clojure"
  :license {:name "MIT License"
            :url "https://github.com/StoneCypher/DeepakChopra_Clojure/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :main ^:skip-aot deepak-chopra.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
