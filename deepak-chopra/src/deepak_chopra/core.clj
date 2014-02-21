(ns deepak-chopra.core
  (:gen-class))

(defn -main
  "Deepak Chopra nonsense generator"
  [& args]

  (def starts     ["Experiential truth ", "The physical world ", "Non-judgment ",       "Quantum physics "])
  (def middles    ["nurtures ",           "projects onto ",      "imparts reality to ", "constructs with "])
  (def qualifiers ["abundance of ",       "the barrier of ",     "self-righteous ",     "potential "])
  (def finishes   ["marvel.",             "choices.",            "creativity.",         "actions."])

  (println (str (rand-nth starts) (rand-nth middles) (rand-nth qualifiers) (rand-nth finishes) )))
