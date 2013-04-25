(ns leiningen.disable-constraints
  (:use leiningen.dbmaintain))

(defn disable-constraints 
  [project & args] 
  (let [factory (get-mainfactory project)]
    (.. factory createConstraintsDisabler disableConstraints)))