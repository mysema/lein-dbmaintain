(ns leiningen.dbmaintain
  (:import [java.io File FileInputStream]
           [java.util Map Properties]
           [org.dbmaintain MainFactory]))

(defn get-properties 
  [{:keys [dbmaintain]}]
  (let [{:keys [driver url user-name password schemas scripts dialect]} dbmaintain]
    (doto (Properties.)
      (.load (.getResourceAsStream (.getClass dbmaintain) "/dbmaintain-default.properties"))
      (.put "dbMaintainer.script.locations" scripts)
      (.put "dbMaintainer.autoCreateDbMaintainScriptsTable" "true")
      (.put "database.driverClassName" driver)
      (.put "database.url" url)
      (.put "database.userName" user-name)
      (.put "database.password" password)
      (.put "database.schemaNames" schemas)
      (.put "database.dialect" dialect))))

(defn get-mainfactory
  [project]
  (MainFactory. (get-properties project)))