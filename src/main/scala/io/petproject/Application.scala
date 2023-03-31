package io.petproject

import com.typesafe.scalalogging.LazyLogging

object Application extends LazyLogging {

  def main(args: Array[String]): Unit = {
    logger.info("Starting Spark Structured Streaming App...")
  }

}
