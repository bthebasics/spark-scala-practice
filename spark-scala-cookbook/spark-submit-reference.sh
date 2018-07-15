######################## Examples of spark-submit :
###########

spark-submit --num-executors 10 --executor-cores 5 --executor-memory 2G --master yarn-cluster --conf spark.driver.userClassPathFirst=true --conf spark.executor.userClassPathFirst=true --class com.example.SparkJob target/scala-2.10/spark-poc-assembly-0.1.jar 10.0.201.6 hdfs:///user/aahmed/example.csv

--conf "spark.executor.extraJavaOptions=-Dlog4j.configuration=log4j-spark.properties" 