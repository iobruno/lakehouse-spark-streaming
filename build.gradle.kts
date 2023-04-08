import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    scala
    application
    id("com.github.johnrengelman.shadow") version "8.1.0"
}

repositories {
    mavenCentral()
}

val artifactName = "lakehouse-spark-streaming"
val artifactVersion = "1.0-SNAPSHOT"

dependencies {
    val scalaVersion = "2.13"
    val sparkVersion = "3.3.2"
    val scalaLogging = "3.9.5"
    val logbackVersion = "1.4.6"

    implementation("org.scala-lang:scala-library:$scalaVersion.10")

    /** Spark **/
    /** Change implementation to compileOnly for Production **/
    implementation("org.apache.spark:spark-sql_$scalaVersion:$sparkVersion")
    implementation("org.apache.spark:spark-sql-kafka-0-10_$scalaVersion:$sparkVersion")

    /** Logging **/
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("com.typesafe.scala-logging:scala-logging_$scalaVersion:$scalaLogging")

    /** Utils **/
    implementation("com.typesafe:config:1.4.2")
}

application {
    mainClass.set("io.petproject.Application")
}

tasks.withType<ShadowJar> {
    archiveBaseName.set(artifactName)
    version = "1.0"
    archiveClassifier.set("")
    isZip64 = true
    mergeServiceFiles()
}
