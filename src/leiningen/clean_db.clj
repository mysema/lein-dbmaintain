(ns leiningen.clean-db
  (:use leiningen.dbmaintain))

(defn clean-db 
  [project & args] 
  (let [factory (get-mainfactory project)]
    (.. factory createDBCleaner cleanDatabase)))