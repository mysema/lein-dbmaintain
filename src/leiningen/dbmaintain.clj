(ns leiningen.dbmaintain
  (:import [java.io File FileInputStream]
           [java.util Map Properties]
           [org.dbmaintain.launch DbMaintain]))

(defn get-properties 
  [{:keys [dbmaintain]}]
  (let [{:keys [driver url user-name password schemas dialect]} dbmaintain]
    (doto (Properties.)
      (.load (FileInputStream. (File. "sql/dbmaintain.properties")))
      (.put "database.driverClassName" driver)
      (.put "database.url" url)
      (.put "database.userName" user-name)
      (.put "database.password" password)
      (.put "database.schemaNames" schemas)
      (.put "database.dialect" dialect))))