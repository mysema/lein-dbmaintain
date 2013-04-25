(ns leiningen.clear-db
  (:use leiningen.dbmaintain))

(defn clear-db 
  [project & args] 
  (let [factory (get-mainfactory project)]
    (.. factory createDBClearer clearDatabase)))
    