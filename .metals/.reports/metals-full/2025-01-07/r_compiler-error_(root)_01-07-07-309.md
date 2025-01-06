file://<WORKSPACE>/src/main/scala/Repository.scala
### java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Types$Type.typeSymbol()" because "tp" is null

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.15
Classpath:
<WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-0aeK_5ZrQWGzWnFC2rYANA== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.15/scala-library-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-driver_2.13/4.6.0/mongo-scala-driver_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor-typed_2.13/2.6.8/akka-actor-typed_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.8/akka-stream_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http_2.13/10.2.10/akka-http_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-spray-json_2.13/10.2.10/akka-http-spray-json_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick_2.13/3.4.1/slick_2.13-3.4.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.4.5/logback-classic-1.4.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/postgresql/postgresql/42.5.1/postgresql-42.5.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick-hikaricp_2.13/3.4.1/slick-hikaricp_2.13-3.4.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.15/scala-reflect-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-bson_2.13/4.6.0/mongo-scala-bson_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-reactivestreams/4.6.0/mongodb-driver-reactivestreams-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.8/akka-actor_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-slf4j_2.13/2.6.8/akka-slf4j_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.4/slf4j-api-2.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.8/akka-protobuf-v3_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-streams-1.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.4.1/ssl-config-core_2.13-0.4.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.2.10/akka-http-core_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/spray/spray-json_2.13/1.3.6/spray-json_2.13-1.3.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.2/config-1.4.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-collection-compat_2.13/2.8.1/scala-collection-compat_2.13-2.8.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.4.5/logback-core-1.4.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.5.0/checker-qual-3.5.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/zaxxer/HikariCP/4.0.3/HikariCP-4.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson/4.6.0/bson-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-core/4.6.0/mongodb-driver-core-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/projectreactor/reactor-core/3.2.22.RELEASE/reactor-core-3.2.22.RELEASE.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/0.9.0/scala-java8-compat_2.13-0.9.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.2.10/akka-parsing_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson-record-codec/4.6.0/bson-record-codec-4.6.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 138
uri: file://<WORKSPACE>/src/main/scala/Repository.scala
text:
```scala
import scala.concurrent.Future
import slick.jdbc.PostgresProfile.api._

trait Repository extends SlickComponent { 
    def getAllMessage()@@
}


```



#### Error stacktrace:

```
scala.reflect.internal.Definitions$DefinitionsClass.isByNameParamType(Definitions.scala:428)
	scala.reflect.internal.TreeInfo.isStableIdent(TreeInfo.scala:140)
	scala.reflect.internal.TreeInfo.isStableIdentifier(TreeInfo.scala:113)
	scala.reflect.internal.TreeInfo.isPath(TreeInfo.scala:102)
	scala.tools.nsc.interactive.Global.stabilizedType(Global.scala:974)
	scala.tools.nsc.interactive.Global.typedTreeAt(Global.scala:822)
	scala.meta.internal.pc.SignatureHelpProvider.signatureHelp(SignatureHelpProvider.scala:23)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$signatureHelp$1(ScalaPresentationCompiler.scala:417)
```
#### Short summary: 

java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Types$Type.typeSymbol()" because "tp" is null