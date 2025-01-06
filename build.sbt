import Dependencies._

val AkkaVersion = "2.6.8"
val AkkaHttpVersion = "10.2.10"

ThisBuild / scalaVersion     := "2.13.15"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "essential-scala-api",
    libraryDependencies += munit % Test,
    // MongoDB 
    libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "4.6.0", 
    libraryDependencies ++= Seq(
    // AkkaHttp
    "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
    "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
    "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion,
    // Slick
    "com.typesafe.slick" %% "slick" % "3.4.1",
    "ch.qos.logback" % "logback-classic" % "1.4.5",
    "org.postgresql" % "postgresql" % "42.5.1",
    "com.typesafe.slick" %% "slick-hikaricp" % "3.4.1"   
    ) , 
  )

  // set the main class for 'sbt run'
mainClass in (Compile, run) := Some("AkkaHttpSimple")

// set the main class for 'sbt initData'
TaskKey[Unit]("initialDatabase") := (runMain in Compile)
.toTask(" InitialDatabase")
.value

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
