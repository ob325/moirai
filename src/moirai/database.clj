(ns moirai.database
  (:require [next.jdbc :as jdbc]
            [next.jdbc.sql :as sql]))




(def db-spec {:dbtype "duckdb"
              :dbname (.getFile (clojure.java.io/resource "gi_bleed_cdm.duckdb"))})

(def ds (jdbc/get-datasource db-spec))

(jdbc/execute! ds ["select * from concept limit 10"])


(jdbc/execute! ds ["select * from concept where concept_name like ?" "%heart%"])





