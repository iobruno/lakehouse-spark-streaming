package io.petproject.utils

import com.typesafe.config.ConfigFactory

import scala.collection._
import scala.jdk.CollectionConverters.ListHasAsScala
import scala.xml.Properties

object Config {

  private val config = ConfigFactory.load()

  def getAsString(propertyName: String): String = config.getString(propertyName)

  def getAsSeq(propertyName: String): Seq[String] = config.getStringList(propertyName).asScala

  def getEnv(envVar: String, default: String): String = Properties.envOrElse(envVar, default)

  def getEnvOrFail(envVar: String): String = Properties.envOrNone(envVar).getOrElse {
      throw new RuntimeException(s"ENV Variable $envVar is not configured")
    }

}
