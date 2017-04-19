name := """bbs"""
organization := "com.exercise.bbs"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

libraryDependencies += filters
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % Test

libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "1.4.194",
   "com.typesafe.play" % "play-slick_2.11" % "2.1.0"
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.exercise.bbs.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.exercise.bbs.binders._"
