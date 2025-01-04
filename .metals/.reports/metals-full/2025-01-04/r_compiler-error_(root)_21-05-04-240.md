file://<WORKSPACE>/src/main/scala/EntryPointMongo.scala
### scala.reflect.internal.FatalError: 
  bad constant pool index: 0 at pos: 48461
     while compiling: <no file>
        during phase: globalPhase=<no phase>, enteringPhase=<some phase>
     library version: version 2.13.9
    compiler version: version 2.13.9
  reconstructed args: -classpath <WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-wvrJSwcESX6OTQ3t3bGH8w==:<HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.9/scala-library-2.13.9.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-driver_2.13/4.6.0/mongo-scala-driver_2.13-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.9/scala-reflect-2.13.9.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-bson_2.13/4.6.0/mongo-scala-bson_2.13-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-reactivestreams/4.6.0/mongodb-driver-reactivestreams-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson/4.6.0/bson-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-core/4.6.0/mongodb-driver-core-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/projectreactor/reactor-core/3.2.22.RELEASE/reactor-core-3.2.22.RELEASE.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson-record-codec/4.6.0/bson-record-codec-4.6.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: EmptyTree
       tree position: <unknown>
            tree tpe: <notype>
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==



occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.9
Classpath:
<WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-wvrJSwcESX6OTQ3t3bGH8w== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.9/scala-library-2.13.9.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-driver_2.13/4.6.0/mongo-scala-driver_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.9/scala-reflect-2.13.9.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-bson_2.13/4.6.0/mongo-scala-bson_2.13-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-reactivestreams/4.6.0/mongodb-driver-reactivestreams-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson/4.6.0/bson-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-core/4.6.0/mongodb-driver-core-4.6.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/projectreactor/reactor-core/3.2.22.RELEASE/reactor-core-3.2.22.RELEASE.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson-record-codec/4.6.0/bson-record-codec-4.6.0.jar [exists ]
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

object EntryPointMongo extends App {
    val mongoClient :
}

```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:69)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:65)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.tools.nsc.symtab.classfile.ClassfileParser$ConstantPool.errorBadIndex(ClassfileParser.scala:408)
	scala.tools.nsc.symtab.classfile.ClassfileParser$ConstantPool.getExternalName(ClassfileParser.scala:263)
	scala.tools.nsc.symtab.classfile.ClassfileParser.readParamNames$1(ClassfileParser.scala:842)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseAttribute$1(ClassfileParser.scala:848)
	scala.tools.nsc.symtab.classfile.ClassfileParser.$anonfun$parseAttributes$6(ClassfileParser.scala:925)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseAttributes(ClassfileParser.scala:1497)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseMethod(ClassfileParser.scala:625)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parseClass(ClassfileParser.scala:548)
	scala.tools.nsc.symtab.classfile.ClassfileParser.$anonfun$parse$2(ClassfileParser.scala:175)
	scala.tools.nsc.symtab.classfile.ClassfileParser.$anonfun$parse$1(ClassfileParser.scala:160)
	scala.tools.nsc.symtab.classfile.ClassfileParser.parse(ClassfileParser.scala:143)
	scala.tools.nsc.symtab.SymbolLoaders$ClassfileLoader.doComplete(SymbolLoaders.scala:342)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.$anonfun$complete$2(SymbolLoaders.scala:249)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.complete(SymbolLoaders.scala:247)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1563)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1535)
	scala.reflect.internal.Definitions.scala$reflect$internal$Definitions$$enterNewMethod(Definitions.scala:48)
	scala.reflect.internal.Definitions$DefinitionsClass.String_$plus$lzycompute(Definitions.scala:1261)
	scala.reflect.internal.Definitions$DefinitionsClass.String_$plus(Definitions.scala:1261)
	scala.reflect.internal.Definitions$DefinitionsClass.syntheticCoreMethods$lzycompute(Definitions.scala:1583)
	scala.reflect.internal.Definitions$DefinitionsClass.syntheticCoreMethods(Definitions.scala:1565)
	scala.reflect.internal.Definitions$DefinitionsClass.symbolsNotPresentInBytecode$lzycompute(Definitions.scala:1596)
	scala.reflect.internal.Definitions$DefinitionsClass.symbolsNotPresentInBytecode(Definitions.scala:1596)
	scala.reflect.internal.Definitions$DefinitionsClass.init(Definitions.scala:1652)
	scala.tools.nsc.Global$Run.<init>(Global.scala:1236)
	scala.tools.nsc.interactive.Global$TyperRun.<init>(Global.scala:1351)
	scala.tools.nsc.interactive.Global.newTyperRun(Global.scala:1374)
	scala.tools.nsc.interactive.Global.<init>(Global.scala:294)
	scala.meta.internal.pc.MetalsGlobal.<init>(MetalsGlobal.scala:42)
	scala.meta.internal.pc.ScalaPresentationCompiler.newCompiler(ScalaPresentationCompiler.scala:514)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  bad constant pool index: 0 at pos: 48461
     while compiling: <no file>
        during phase: globalPhase=<no phase>, enteringPhase=<some phase>
     library version: version 2.13.9
    compiler version: version 2.13.9
  reconstructed args: -classpath <WORKSPACE>/.bloop/root/bloop-bsp-clients-classes/classes-Metals-wvrJSwcESX6OTQ3t3bGH8w==:<HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.3/semanticdb-javac-0.10.3.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.9/scala-library-2.13.9.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-driver_2.13/4.6.0/mongo-scala-driver_2.13-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.9/scala-reflect-2.13.9.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/scala/mongo-scala-bson_2.13/4.6.0/mongo-scala-bson_2.13-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-reactivestreams/4.6.0/mongodb-driver-reactivestreams-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson/4.6.0/bson-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/mongodb-driver-core/4.6.0/mongodb-driver-core-4.6.0.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.2/reactive-streams-1.0.2.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/projectreactor/reactor-core/3.2.22.RELEASE/reactor-core-3.2.22.RELEASE.jar:<HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/mongodb/bson-record-codec/4.6.0/bson-record-codec-4.6.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: EmptyTree
       tree position: <unknown>
            tree tpe: <notype>
              symbol: null
           call site: <none> in <none>

== Source file context for tree position ==

