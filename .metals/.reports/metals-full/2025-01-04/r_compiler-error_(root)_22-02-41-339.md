file://<WORKSPACE>/src/main/scala/EntryPointMongo.scala
### java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.15
Classpath:
<WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-qz5FnHg5T6WsqVjIQteIcA== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.15/scala-library-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-driver_2.13/4.6.0/mongo-scala-driver_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.15/scala-reflect-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-bson_2.13/4.6.0/mongo-scala-bson_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-reactivestreams/4.6.0/mongodb-driver-reactivestreams-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson/4.6.0/bson-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-core/4.6.0/mongodb-driver-core-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/projectreactor/reactor-core/3.2.22.RELEASE/reactor-core-3.2.22.RELEASE.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson-record-codec/4.6.0/bson-record-codec-4.6.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file://<WORKSPACE>/src/main/scala/EntryPointMongo.scala
text:
```scala
import org.mongodb.scala._
import org.mongodb.scala.model.Aggregates._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Projections._
import org.mongodb.scala.model.Sorts._
import org.mongodb.scala.model.Updates._
import org.mongodb.scala.model._

import scala.collection.JavaConverters._
import scala.util.{Success , Failure}
import scala.concurrent.Future
import org.mongodb.scala.result.InsertOneResult
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import com.mongodb.client

object EntryPointMongo extends App {
    val mongoClient: MongoClient = MongoClient()
    val database: MongoDatabase = mongoClient.getDatabase("my-database")
    val collection: MongoCollection[Document] = database.getCollection("my-collection")

    val doc: Document = Document(
        "_id" -> 0 , 
        "name" -> "MongoDB",
        "type" -> "Database", 
        "count" -> 1,
        "info" -> Document("x" -> 203, "y" -> 102)
    )
    // we use the future to implement this 
    // val maybeDoc: Future[InsertOneResult] = collection.insertOne(doc).toFuture()
    // maybeDoc.onComplete{
    //     case Success(value) => println(value)
    //     case Failure(exception) => println("Failed to insert")
    // }

    val maybe: Future[client.result.UpdateResult] = collection.updateOne(
        equal("_id" , 0),
        combine(
            Updates.set("info.x" , 888),
            Updates.set("info.y" , 777)
        )
    ).toFuture()

    maybe.onComplete{ 
        case Success(value) => println(s"Update ${value.getModifiedCount()}")
        case Failu
    }

    val maybeTarget: Future[Document] = collection.find(equal("_id" , 0)).first().toFuture()
    maybeTarget.onComplete{ 
        case Success(value) => println(s"Value ${value.toJson()}")
        case Failure(exception) => println("Couldn't find the document")
    }
}

```



#### Error stacktrace:

```
scala.collection.mutable.ArrayBuffer.apply(ArrayBuffer.scala:102)
	scala.reflect.internal.Types$Type.findMemberInternal$1(Types.scala:1030)
	scala.reflect.internal.Types$Type.findMember(Types.scala:1035)
	scala.reflect.internal.Types$Type.memberBasedOnName(Types.scala:661)
	scala.reflect.internal.Types$Type.nonLocalMember(Types.scala:652)
	scala.tools.nsc.typechecker.Contexts$ImportInfo.importedSelectedSymbol(Contexts.scala:1949)
	scala.tools.nsc.typechecker.Contexts$SymbolLookup.apply(Contexts.scala:1535)
	scala.tools.nsc.typechecker.Contexts$Context.lookupSymbol(Contexts.scala:1287)
	scala.tools.nsc.typechecker.Typers$Typer.typedIdent$2(Typers.scala:5695)
	scala.tools.nsc.typechecker.Typers$Typer.typedIdentOrWildcard$1(Typers.scala:5789)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6262)
	scala.tools.nsc.typechecker.Typers$Typer.typedAppliedTypeTree$1(Typers.scala:5815)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6214)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedType(Typers.scala:6504)
	scala.tools.nsc.typechecker.Typers$Typer.typedType(Typers.scala:6507)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedDefDef$11(Typers.scala:2447)
	scala.tools.nsc.typechecker.Typers$Typer.typedDefDef(Typers.scala:6577)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6226)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6398)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$5(Typers.scala:3493)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$5$adapted(Typers.scala:3488)
	scala.reflect.internal.Scopes$Scope.foreach(Scopes.scala:455)
	scala.tools.nsc.typechecker.Typers$Typer.addSynthetics$1(Typers.scala:3488)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3556)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2140)
	scala.tools.nsc.typechecker.Typers$Typer.typedModuleDef(Typers.scala:2016)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6228)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6398)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$10(Typers.scala:3544)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3544)
	scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5901)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6230)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6320)
	scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:125)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:483)
	scala.tools.nsc.interactive.Global$TyperRun.applyPhase(Global.scala:1369)
	scala.tools.nsc.interactive.Global$TyperRun.typeCheck(Global.scala:1362)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:680)
	scala.meta.internal.pc.Compat.$anonfun$runOutline$1(Compat.scala:57)
	scala.collection.IterableOnceOps.foreach(IterableOnce.scala:619)
	scala.collection.IterableOnceOps.foreach$(IterableOnce.scala:617)
	scala.collection.AbstractIterable.foreach(Iterable.scala:935)
	scala.meta.internal.pc.Compat.runOutline(Compat.scala:49)
	scala.meta.internal.pc.Compat.runOutline(Compat.scala:35)
	scala.meta.internal.pc.Compat.runOutline$(Compat.scala:33)
	scala.meta.internal.pc.MetalsGlobal.runOutline(MetalsGlobal.scala:36)
	scala.meta.internal.pc.ScalaCompilerWrapper.compiler(ScalaCompilerAccess.scala:19)
	scala.meta.internal.pc.ScalaCompilerWrapper.compiler(ScalaCompilerAccess.scala:14)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticTokens$1(ScalaPresentationCompiler.scala:195)
```
#### Short summary: 

java.lang.IndexOutOfBoundsException: -1 is out of bounds (min 0, max 2)