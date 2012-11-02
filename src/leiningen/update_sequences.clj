(ns leiningen.update-sequences
  (:use leiningen.dbmaintain)
  (:import [org.dbmaintain.launch DbMaintain]))

(defn update-sequences 
  [project & args] 
  (let [props (get-properties project)
        dbmaintain (DbMaintain. props)]
    (.updateSequences dbmaintain)))
    