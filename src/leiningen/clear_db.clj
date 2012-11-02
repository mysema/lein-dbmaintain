(ns leiningen.clear-db
  (:use leiningen.dbmaintain)
  (:import [org.dbmaintain.launch DbMaintain]))

(defn clear-db
  [project & args] 
  (let [props (get-properties project)
        dbmaintain (DbMaintain. props)]
    (.clearDatabase dbmaintain)))
    