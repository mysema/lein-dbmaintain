# lein-dbmaintain

DbMaintain integration for Leiningen

## Configuration

Put your SQL files under sql/incremental

Project configuration like this

    :dbmaintain {:driver "com.mysql.jdbc.Driver"
                 :url "jdbc:mysql://localhost:3306/mydb"
                 :user-name "myuser"
                 :password "mypass"
                 :schemas "mydb"
                 :dialect "mysql"}
               
Make sure that the needed JDBC drivers are also on the classpath.         

For more details see the DbMaintain project page http://dbmaintain.sourceforge.net/overview.html        

## Usage

    lein check-script-updates

    lein clean-db

    lein clear-db

    lein disable-constraints

    lein mark-up-to-date

    lein update-db

    lein update-sequences

## License

Copyright © 2012 Mysema

Distributed under the Eclipse Public License, the same as Clojure.
