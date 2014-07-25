organization := "org.company"

name := "scala-sbt-github-dependency-usage"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.1"

scalacOptions ++= Seq("-deprecation", "-unchecked")

val root = Project("scala-sbt-github-dependency-usage", file(".")) dependsOn {
  ProjectRef(uri("https://github.com/lanceon/scala-github-dependency-target-project.git"), "scala-github-dependency-target-project")
}

libraryDependencies ++= {
  Seq(
    "ch.qos.logback" % "logback-classic" % "1.1.2"
  )
}
