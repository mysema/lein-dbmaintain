(ns leiningen.update-sequences
  (:use leiningen.dbmaintain))

(defn update-sequences 
  [project & args] 
  (let [factory (get-mainfactory project)]
    (.. factory createSequenceUpdater updateSequences)))