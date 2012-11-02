(ns leiningen.check-script-updates
  (:use leiningen.dbmaintain)
  (:import [org.dbmaintain.launch DbMaintain]))

(defn check-script-updates 
  [project & args] 
  (let [props (get-properties project)
        dbmaintain (DbMaintain. props)]
    (.checkScriptUpdates dbmaintain)))
    