(ns project)
(use 'clojure.java.io)
(with-open [rdr (reader "resources/json2.txt")]
  (doseq [line (line-seq rdr)]
    (println line)))
(def yorman (slurp "resources/json2.txt"))
(def archivo1 (slurp "resources/Lista Consolidada del Consejo de Seguridad de las Naciones Unidas.txt"))
(def archivo2 (slurp "resources/LISTA_OFAC.txt"))
yorman
