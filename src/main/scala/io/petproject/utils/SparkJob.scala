package io.petproject.utils

import org.apache.spark.sql.SparkSession

trait SparkJob {

  lazy val sparkSession: SparkSession = {
    SparkSession
      .builder()
      .appName(Config.getEnvOrFail("SPARK_APP_NAME"))
      .master(Config.getEnv("SPARK_MASTER", default = "local[*]"))
      .getOrCreate()
  }

}
