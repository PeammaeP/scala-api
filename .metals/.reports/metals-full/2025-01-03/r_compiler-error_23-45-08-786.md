file://<WORKSPACE>/implicit.worksheet.sc
### scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
/modules [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.15/scala-library-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/mdoc-runtime_2.13/2.6.2/mdoc-runtime_2.13-2.6.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/fansi_2.13/0.5.0/fansi_2.13-0.5.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/lihaoyi/pprint_2.13/0.9.0/pprint_2.13-0.9.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-reflect/2.13.15/scala-reflect-2.13.15.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/mdoc-interfaces/2.6.2/mdoc-interfaces-2.6.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scalameta/metaconfig-pprint_2.13/0.14.0/metaconfig-pprint_2.13-0.14.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ]
Options:



action parameters:
uri: file://<WORKSPACE>/implicit.worksheet.sc
text:
```scala
val message: String = "Hello"
implicit 
```



#### Error stacktrace:

```
scala.tools.nsc.typechecker.Unapplies.constrParamss(Unapplies.scala:90)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth(Unapplies.scala:141)
	scala.tools.nsc.typechecker.Unapplies.factoryMeth$(Unapplies.scala:138)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.factoryMeth(MetalsGlobal.scala:78)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper(MethodSynthesis.scala:238)
	scala.tools.nsc.typechecker.MethodSynthesis$MethodSynth.enterImplicitWrapper$(MethodSynthesis.scala:237)
	scala.tools.nsc.typechecker.Namers$Namer.enterImplicitWrapper(Namers.scala:58)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym(Global.scala:95)
	scala.tools.nsc.interactive.InteractiveAnalyzer$InteractiveNamer.enterExistingSym$(Global.scala:81)
	scala.tools.nsc.interactive.InteractiveAnalyzer$$anon$2.enterExistingSym(Global.scala:51)
	scala.tools.nsc.typechecker.Namers$Namer.standardEnterSym(Namers.scala:314)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym(AnalyzerPlugins.scala:496)
	scala.tools.nsc.typechecker.AnalyzerPlugins.pluginsEnterSym$(AnalyzerPlugins.scala:495)
	scala.meta.internal.pc.MetalsGlobal$MetalsInteractiveAnalyzer.pluginsEnterSym(MetalsGlobal.scala:78)
	scala.tools.nsc.typechecker.Namers$Namer.enterSym(Namers.scala:288)
	scala.tools.nsc.typechecker.Typers$Typer.enterSym(Typers.scala:2010)
	scala.tools.nsc.typechecker.Typers$Typer.enterSyms(Typers.scala:2005)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2065)
	scala.tools.nsc.typechecker.Typers$Typer.typedClassDef(Typers.scala:1927)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6060)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6231)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedBlock(Typers.scala:2597)
	scala.tools.nsc.typechecker.Typers$Typer.typedOutsidePatternMode$1(Typers.scala:6071)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6107)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedDefDef(Typers.scala:6417)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6059)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6231)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedTemplate(Typers.scala:2089)
	scala.tools.nsc.typechecker.Typers$Typer.typedModuleDef(Typers.scala:1965)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6061)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Typers$Typer.typedStat$1(Typers.scala:6231)
	scala.tools.nsc.typechecker.Typers$Typer.$anonfun$typedStats$8(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedStats(Typers.scala:3470)
	scala.tools.nsc.typechecker.Typers$Typer.typedPackageDef$1(Typers.scala:5743)
	scala.tools.nsc.typechecker.Typers$Typer.typed1(Typers.scala:6063)
	scala.tools.nsc.typechecker.Typers$Typer.typed(Typers.scala:6153)
	scala.tools.nsc.typechecker.Analyzer$typerFactory$TyperPhase.apply(Analyzer.scala:124)
	scala.tools.nsc.Global$GlobalPhase.applyPhase(Global.scala:480)
	scala.tools.nsc.interactive.Global$TyperRun.applyPhase(Global.scala:1370)
	scala.tools.nsc.interactive.Global$TyperRun.typeCheck(Global.scala:1363)
	scala.tools.nsc.interactive.Global.typeCheck(Global.scala:680)
	scala.meta.internal.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:22)
	scala.meta.internal.pc.SimpleCollector.<init>(PcCollector.scala:340)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:19)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzycompute$1(PcSemanticTokensProvider.scala:19)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:19)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:73)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticTokens$1(ScalaPresentationCompiler.scala:196)
```
#### Short summary: 

scala.MatchError: implicit class <error> extends  (of class scala.reflect.internal.Trees$ClassDef)