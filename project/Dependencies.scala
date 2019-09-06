import sbt._

object Dependencies {
  // Versions
  val akkaStreamVersion = "2.0-M2"
  val akkaVersion       = "2.3.12"
  val scalaTestVersion  = "2.2.4"
  // val scalaTestVersion  = "3.0.8"
  val scalaMockVersion  = "3.2.2"
  val slickVersion      = "3.1.0"
  val mySqlVersion      = "5.1.34"
  val flywayVersion     = "3.2.1"

  // Libraries
  lazy val akkaActor                     = "com.typesafe.akka"  %% "akka-actor"                           % akkaVersion
  lazy val akkaStreamExperimental        = "com.typesafe.akka"  %% "akka-stream-experimental"             % akkaStreamVersion
  lazy val akkaHttpExperimental          = "com.typesafe.akka"  %% "akka-http-experimental"               % akkaStreamVersion
  lazy val akkaHttpCoreExperimental      = "com.typesafe.akka"  %% "akka-http-core-experimental"          % akkaStreamVersion
  lazy val akkaHttpSprayJsonExperimental = "com.typesafe.akka"  %% "akka-http-spray-json-experimental"    % akkaStreamVersion
  lazy val akkaHttpTestkitExperimental   = "com.typesafe.akka"  %% "akka-http-testkit-experimental"       % akkaStreamVersion
  lazy val slick                         = "com.typesafe.slick" %% "slick"                                % slickVersion
  lazy val slickHikaricp                 = "com.typesafe.slick" %% "slick-hikaricp"                       % slickVersion
  lazy val mysql                         = "mysql"              %  "mysql-connector-java"                 % mySqlVersion
  lazy val flywayCore                    = "org.flywaydb"       %  "flyway-core"                          % flywayVersion
  lazy val akkaTestkit                   = "com.typesafe.akka"  %% "akka-testkit"                         % akkaVersion
  lazy val scalaTest                     = "org.scalatest"      %% "scalatest"                            % scalaTestVersion
  lazy val scalaMock                     = "org.scalamock"      %% "scalamock-scalatest-support"          % scalaMockVersion
  lazy val logBack                       = "ch.qos.logback"     % "logback-classic"                       % "1.1.7"
  lazy val akkaSlf4j                     = "com.typesafe.akka"  %% "akka-slf4j"                           % akkaVersion
  lazy val scalaLogging                  = "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0"

  // Projects
  val rootDeps = Seq(
    akkaActor,
    akkaStreamExperimental,
    akkaHttpExperimental,
    akkaHttpCoreExperimental,
    akkaHttpSprayJsonExperimental,
    akkaHttpTestkitExperimental,
    slick,
    slickHikaricp,
    mysql,
    flywayCore,
    akkaTestkit % Test,
    scalaTest % Test,
    scalaMock,
    logBack,
    akkaSlf4j,
    scalaLogging
  )
}
