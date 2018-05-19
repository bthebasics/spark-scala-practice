package org.test.spark
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object wordCount2 {
      val conf = new SparkConf().setAppName("sparkTest").setMaster("local")
    val sc = new SparkContext(conf)
    
    val rdd1 = sc.textFile("food.txt", 2)
    print(rdd1.count())
  
  
  
}