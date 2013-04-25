# lein-dbmaintain

DbMaintain integration for Leiningen

## Configuration

Put your SQL files under sql/incremental

Project configuration like this

```clojure
:plugins [[lein-jelastic "0.1.0"]]

:dbmaintain {:driver "com.mysql.jdbc.Driver"
             :url "jdbc:mysql://localhost:3306/mydb"
             :user-name "myuser"
             :password "mypass"
             :schemas "mydb"
             :scripts "sql"
             :dialect "mysql"}
```
               
Make sure that the needed JDBC drivers are also on the classpath.         

For more details see the DbMaintain project page http://dbmaintain.sourceforge.net/overview.html        

## Usage

    lein check-script-updates
    
Performs a dry run of the database update. May be used to verify if there are any updates or in a test that fails if it appears that an irregular script update was performed.    

    lein clean-db
    
Task that removes the data of all database tables, except for the DBMAINTAIN_SCRIPTS table.

    lein clear-db
    
Task that removes all database items like tables, views etc from the database and empties the DBMAINTAIN_SCRIPTS table.    

    lein disable-constraints
    
Task that disables or drops all foreign key and not null constraints.    

    lein mark-up-to-date
    
This operation updates the state of the database to indicate that all scripts have been executed, without actually executing them. This can be useful when you want to start using DbMaintain on an existing database, or after having fixed a problem directly on the database.

    lein update-db
    
Task that updates the database to the latest version.

    lein update-sequences

## License

Copyright © 2012 Mysema

Distributed under the Eclipse Public License, the same as Clojure.
