(ns moirai.query
  (:require [honey.sql :as sql]
            [next.jdbc :as jdbc]))


(defn find-concept
  "Find concept by concept name match"
  [data-source string]
  (let [query (sql/format
               {:select [:CONCEPT_CLASS_ID :CONCEPT_ID
                         :CONCEPT_NAME :STANDARD_CONCEPT]
                :from [:concept]
                :where [:like :concept_name string]})]
  (jdbc/execute! data-source query)))
