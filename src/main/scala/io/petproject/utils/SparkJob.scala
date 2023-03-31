package io.petproject.utils

import org.apache.spark.sql.SparkSession

trait SparkJob {

  lazy val sparkSession: SparkSession = {
    SparkSession
      .builder()
      .appName("sparkApp")
      .master("local[*]")
      .getOrCreate()
  }

}
