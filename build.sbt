enablePlugins(JavaServerAppPackaging)


name := "goticks"

version := "0.1"

scalaVersion := "2.13.5"

idePackagePrefix := Some("com.goticks")

libraryDependencies ++= {
  val AkkaVersion = "2.6.13"
  val AkkaHttpVersion = "10.2.4"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  //  "com.typesafe.akka" % "akka-http-core" % AkkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
    "com.typesafe.akka" %% "akka-http" % AkkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % AkkaHttpVersion,
    "com.typesafe.akka" %% "akka-slf4j"      % AkkaVersion,
    "ch.qos.logback" % "logback-classic" % "1.1.3",
    "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % Test,
  //  "org.scalatest"     %% "scalatest"       % "2.2.0" % Test
    "org.scalactic" %% "scalactic" % "3.2.5",
    "org.scalatest" %% "scalatest" % "3.2.5" % "test"
  )
}

mainClass in assembly := Some("com.goticks.Main")

assemblyJarName in assembly := "goticks.jar"