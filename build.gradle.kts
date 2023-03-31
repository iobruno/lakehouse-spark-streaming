import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    scala
    id("com.github.johnrengelman.shadow") version "8.1.0"
}

repositories {
    mavenCentral()
}

val artifactName = "spark-kafka-stream-processing"
val artifactVersion = "1.0-SNAPSHOT"

dependencies {
    val scalaVersion = "2.13"
    val scalaLogging = "3.9.5"
    val logbackVersion = "1.4.6"

    implementation("org.scala-lang:scala-library:$scalaVersion.10")

    /** Logging **/
    implementation("ch.qos.logback:logback-classic:$logbackVersion")
    implementation("com.typesafe.scala-logging:scala-logging_$scalaVersion:$scalaLogging")

    /** Utils **/
    implementation("com.typesafe:config:1.4.2")

}

tasks.withType<ShadowJar> {
    archiveBaseName.set("${artifactName}-${artifactVersion}")
    mergeServiceFiles()
    manifest {
        attributes(mapOf("Main-Class" to "io.petproject.Application"))
    }
    isZip64 = true
}