import java.io.File

import org.apache.spark.sql.SparkSession

object Spark2HiveDemo {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("Spark Hive Demo")
      .enableHiveSupport()
      .getOrCreate()
    spark.sql("show databases").show()
  }
}
