(ns leiningen.update-db
  (:use leiningen.dbmaintain)
  (:import [org.dbmaintain.launch DbMaintain]))

(defn update-db
  [project & args] 
  (let [props (get-properties project)
        dbmaintain (DbMaintain. props)]
    (.updateDatabase dbmaintain)))
    