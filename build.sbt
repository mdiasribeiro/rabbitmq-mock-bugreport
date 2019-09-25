name := "rmq-mtest"

version := "0.1"

scalaVersion := "2.12.8"

lazy val akkaVersion = "2.5.23"
lazy val akkaHttpVersion = "10.1.8"

resolvers += "Sonatype snapshot" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,  // Not explicitly used, see https://doc.akka.io/docs/akka-http/current/release-notes/10.1.x.html#10-1-0-rc1

  "com.lightbend.akka" %% "akka-stream-alpakka-amqp" % "1.1.0",

  "org.scalatest" %% "scalatest" % "3.0.5" % "test",   // Last release in v2
  "com.github.fridujo" % "rabbitmq-mock" % "1.0.12-SNAPSHOT" % "test"
  // "com.github.fridujo" % "rabbitmq-mock" % "1.0.11" % "test"
)
