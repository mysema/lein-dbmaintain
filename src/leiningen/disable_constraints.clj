(ns leiningen.disable-constraints
  (:use leiningen.dbmaintain)
  (:import [org.dbmaintain.launch DbMaintain]))

(defn disable-constraints 
  [project & args] 
  (let [props (get-properties)
        dbmaintain (DbMaintain. props)]
    (.disableConstraints dbmaintain)))
    