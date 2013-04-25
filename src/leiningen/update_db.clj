(ns leiningen.update-db
  (:use leiningen.dbmaintain))

(defn update-db 
  [project & args] 
  (let [factory (get-mainfactory project)]
    (.updateDatabase (.createDbMaintainer factory) false)))
    