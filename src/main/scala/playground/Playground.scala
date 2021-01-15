package playground

import org.apache.spark.sql.SparkSession

object Playground1  {

  val spark = SparkSession.builder()
    .appName("Spark Optimization Playground")
    .master("local")
    .getOrCreate()

  val sc = spark.sparkContext

  def main(args: Array[String]): Unit = {
    val rdd = sc.parallelize(1 to 1000)
    println(s"I have my first RDD, it has ${rdd.count} rows. Now let me go optimize massive jobs.")
  }

}
