(ns leiningen.mark-up-to-date
  (:use leiningen.dbmaintain))

(defn mark-up-to-date 
  [project & args] 
  (let [factory (get-mainfactory project)]
    (.. factory createDbMaintainer markDatabaseAsUpToDate)))