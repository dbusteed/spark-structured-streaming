name := "Stream Handler"

version := "1.0"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
	"org.apache.spark" %% "spark-core" % "2.4.5" % "provided",
	"org.apache.spark" %% "spark-sql" % "2.4.5" % "provided",
	"com.datastax.spark" %% "spark-cassandra-connector" % "2.4.3",
	"com.datastax.cassandra" % "cassandra-driver-core" % "4.0.0"
)