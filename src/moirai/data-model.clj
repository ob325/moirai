(ns moirai.data-model
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as test]
            [clojure.spec.gen.alpha :as gen]))

;; concept 
(s/def ::concept-id int?)
(s/def ::concept-name string?)
(s/def ::standard-concept #{"N" "S" "C" " "})
(s/def ::invalid-reason string?)
(s/def ::concept-code string?)
(s/def ::domain-id string?)
(s/def ::vocabulary-id string?)
(s/def ::concept-class-id string?)
(s/def ::hash-code string?)

(s/def ::concept 
  (s/keys :req-un [::concept-id
                   ::concept-name
                   ::standard-concept
                   ::invalid-reason
                   ::concept-code
                   ::domain-id
                   ::vocabulary-id
                   ::concept-class-id
                   ::hash-code]))

;; concept set item
(s/def ::is-excluded? boolean?)
(s/def ::include-descendants? boolean?)
(s/def ::is-mapped? boolean?)
(s/def ::concept-set-item 
  (s/keys :req-un [::concept
                   ::is-excluded?
                   ::include-descendants?
                   ::is-mapped?]))


;; concept set
(s/def ::concept-set-id int?)
(s/def ::concept-set-name string?)
(s/def ::concept-set-items (s/coll-of ::concept-set-item :min-count 1))
(s/def ::concept-set
  (s/keys :req-un [::concept-set-id
                   ::concept-set-name
                   ::concept-set-items]))

;; numeric range
(s/def ::numeric-value float?)
(s/def ::numeric-operation #{"<" "<=" "=" ">=" ">"}) 
(s/def ::numeric-range
  (s/keys :req-un [::numeric-value 
                   ::numeric-operation]))



;; condition occurrence
(s/def ::codeset-id int?)
(s/def ::first? boolean?)
(s/def ::occurrence-start-date inst?)
(s/def ::occurrence-end-date inst?)
(s/def ::condition-type (s/coll-of ::concept :count 1))
(s/def ::condition-type-exclude? boolean?)
(s/def ::stop-reason string?)
(s/def ::condition-source-concept int?)
(s/def ::age ::numeric-range)
(s/def ::gender ::concept)
(s/def ::provider-specialty ::concept)
(s/def ::visit-type ::concept)
(s/def ::condition-status ::concept)
(s/def ::condition-occurrence
  (s/keys :req-un [::codeset-id ::first? ::occurrence-start-date
                   ::occurrence-end-date ::condition-type
                   ::condition-type-exclude? ::stop-reason
                   ::condition-source-concept ::age
                   ::gender ::provider-specialty ::visit-type
                   ::condition-status]))
                   
  



;; the cohort expression
(s/def ::cdm-version-range string?)
(s/def ::title string?)



;; database connections
