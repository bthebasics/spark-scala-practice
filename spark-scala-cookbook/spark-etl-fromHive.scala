import org.apache.spark.SparkSession
import org.apache.spark.sql._

import java.util.Properties
import org.apache.hadoop.fs.FSDataInputStream
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.fs.Path
import org.apache.spark.SparkFiles
import java.io.InputStream
import java.io.FileInputStream

object spark-etl-fromHive extends App{

    def main(args: Array[String]){
        
        print(" -- initiating the spark application ")

        // reading the command line parameter to get the Table name
(
        val sourceTable = args(0)

        // step 2 : read the parameters from the console or config file - for given source
        // Ref : https://stackoverflow.com/questions/31115881/how-to-load-java-properties-file-and-use-in-spark

        val  propfile = new FileInputStream("etl.properties");
        val etlProperties = new Properti(es()
        etlProperties.load(propfile)

        print(" --- ETL properties for this table : ${sourceTable}")

        print("Source table")
        print("table or SQL indicator")
        print("target table name")
        print("target jdbc string")
        print("target table")
        print("target username")
        print("target passwordFile")
        print("incrementalInd")


        // step 3 : connect to SQL Server table for reading the ETL details
        // Ref : https://alvinalexander.com/scala/scala-jdbc-connection-mysql-sql-select-example
        // connect to the database named "mysql" on the localhost
            val driver = "com.mysql.jdbc.Driver"
            val url = "jdbc:mysql://localhost/mysql"
            val username = "root"
            val password = "root"

            // there's probably a better way to do this
            var connection:Connection = null        

        try {
            // make the connection
            Class.forName(driver)
            connection = DriverManager.getConnection(url, username, password)

            // create the statement, and run the select query
            val statement = connection.createStatement()
            val resultSet = statement.executeQuery("SELECT host, user FROM user")
            while ( resultSet.next() ) {
                val host = resultSet.getString("host")
                val user = resultSet.getString("user")
                println("host, user = " + host + ", " + user)
            }
            } catch {
            case e => e.printStackTrace
            }
            connection.close()

        // step 1 : initiate sparkSession 
            val saprk = new SparkSession().builder()
                            .setMaster()
                            .setAppname()
                            .set

        // step 4 : initiate the read from hive table
         if ( incremental_flag = "N")
            val tableDf = spark.sql("select * from ${source table}")
         else 
            val tableDf = spark.sql("select * from ${source table} where ${condition1}")
            

        // step 5 : create connection to target JDBC database

        val properties = new properties()

        properties.add("username","${}")


        // step 6 : Write to target table
        spark.Write.jdbc().option().option.load();

        


    }


}
