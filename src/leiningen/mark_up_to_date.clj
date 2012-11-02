(ns leiningen.mark-up-to-date
  (:use leiningen.dbmaintain)
  (:import [org.dbmaintain.launch DbMaintain]))

(defn mark-up-to-date
  [project & args] 
  (let [props (get-properties project)
        dbmaintain (DbMaintain. props)]
    (.markDatabaseAsUpToDate dbmaintain)))
    