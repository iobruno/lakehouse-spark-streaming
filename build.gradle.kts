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

    implementation("org.scala-lang:scala-library:$scalaVersion.10")
}

tasks.withType<ShadowJar> {
    archiveBaseName.set("${artifactName}-${artifactVersion}")
    mergeServiceFiles()
    manifest {
        attributes(mapOf("Main-Class" to "io.petproject.Application"))
    }
    isZip64 = true
}