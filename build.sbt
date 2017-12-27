name := """play-graphql"""
organization := "io.spronq"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += guice

libraryDependencies ++= Seq(
  "com.graphql-java" % "graphql-java-tools" % "4.3.0",
  "org.projectlombok" % "lombok" % "1.16.18"
)
