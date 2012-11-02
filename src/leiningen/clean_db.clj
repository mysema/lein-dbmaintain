(ns leiningen.clean-db
  (:use leiningen.dbmaintain)
  (:import [org.dbmaintain.launch DbMaintain]))

(defn clean-db
  [project & args] 
  (let [props (get-properties project)
        dbmaintain (DbMaintain. props)]
    (.cleanDatabase dbmaintain)))
    