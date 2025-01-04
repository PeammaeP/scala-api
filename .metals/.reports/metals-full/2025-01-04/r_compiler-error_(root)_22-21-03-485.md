file://<WORKSPACE>/src/main/scala/AkkaHttpSimple.scala
### scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.15
Classpath:
<WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-X8OujT8oQiSzVNGbAomo2Q== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.15/scala-library-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-driver_2.13/4.6.0/mongo-scala-driver_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor-typed_2.13/2.6.8/akka-actor-typed_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-stream_2.13/2.6.8/akka-stream_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http_2.13/10.2.10/akka-http_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.15/scala-reflect-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-bson_2.13/4.6.0/mongo-scala-bson_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-reactivestreams/4.6.0/mongodb-driver-reactivestreams-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-actor_2.13/2.6.8/akka-actor_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-slf4j_2.13/2.6.8/akka-slf4j_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-protobuf-v3_2.13/2.6.8/akka-protobuf-v3_2.13-2.6.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_2.13/0.4.1/ssl-config-core_2.13-0.4.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-http-core_2.13/10.2.10/akka-http-core_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson/4.6.0/bson-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-core/4.6.0/mongodb-driver-core-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/projectreactor/reactor-core/3.2.22.RELEASE/reactor-core-3.2.22.RELEASE.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.0/config-1.4.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-java8-compat_2.13/0.9.0/scala-java8-compat_2.13-0.9.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_2.13/1.1.2/scala-parser-combinators_2.13-1.1.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/akka/akka-parsing_2.13/10.2.10/akka-parsing_2.13-10.2.10.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson-record-codec/4.6.0/bson-record-codec-4.6.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file://<WORKSPACE>/src/main/scala/AkkaHttpSimple.scala
text:
```scala
object AkkaHttpSimple extends App {
  implicit system
}

```



#### Error stacktrace:

```
scala.tools.nsc.typechecker.Unapplies.constrParamss(Unapplies.scala:90)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth(Unapplies.scala:155)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth$(Unapplies.scala:152)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.factoryMeth(MetalsGlobal.scala:78)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper(MethodSynthesis.scala:238)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper$(MethodSynthesis.scala:237)
	scala.tools.nsc.typechecker.Namers$Namer.enterImplicitWrapper(Namers.scala:58)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym(Global.scala:95)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym$(Global.scala:81)
	scala.tools.nsc.interactive.InteractiveAnalyzer$$anon$2.enterExistingSym(Global.scala:51)
	scala.tools.nsc.typechecker.Namers$Namer.standardEnterSym(Namers.scala:292)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym(AnalyzerPlugins.scala:500)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym$(AnalyzerPlugins.scala:499)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.pluginsEnterSym(MetalsGlobal.scala:78)
	scala.tools.nsc.typechecker.Namers$Namer.enterSym(Namers.scala:266)
	scala.tools.nsc.typechecker.Typers$Typer.enterSym(Typers.scala:2061)
	scala.tools.nsc.typechecker.Typers$Typer.enterSyms(Typers.scala:2056)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2116)
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

scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)