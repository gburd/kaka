logLevel := Level.Warn

resolvers ++= Seq(
  Classpaths.sbtPluginReleases,
  "Local Maven Repository" at Path.userHome.asFile.toURI.toURL + ".m2/repository",
  "Local Ivy2 Cache Repository" at Path.userHome.asFile.toURI.toURL + ".ivy2/cache",
  Resolver.sonatypeRepo("snapshots"),
  Resolver.typesafeRepo("releases"),
  Resolver.sonatypeRepo("releases"),
  Resolver.bintrayIvyRepo("jetbrains", "sbt-plugins")
)

// Use the Dotty compiler for Scala code.
addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.4.0")

// Makes our code tidy
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.1")

// Native Packager allows us to create standalone jar
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.6.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-multi-jvm" % "0.4.0")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.0.0")
addSbtPlugin("org.jmotor.sbt" % "sbt-dependency-updates" % "1.2.1")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
