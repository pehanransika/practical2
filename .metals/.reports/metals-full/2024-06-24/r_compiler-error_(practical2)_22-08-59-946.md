file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question01.scala
### java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Types$Type.typeSymbol()" because "tp" is null

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\practical2\bloop-bsp-clients-classes\classes-Metals-slyWoRxeReuunToCIEQt1w== [missing ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\sourcegraph\semanticdb-javac\0.9.10\semanticdb-javac-0.9.10.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 129
uri: file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question01.scala
text:
```scala
object Main extends App {
  var i, j, k = 2
  var m, n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'

  def calculate()@@
  def calculateResultA(): Int = {
    k + 12 * m
  }

  def calculateResultB(): Int = {
    m / j
  }

  def calculateResultC(): Int = {
    n % j
  }

  def calculateResultD(): Int = {
    m / j * j
  }

  def calculateResultE(): Float = {
    f + 10 * 5 + g
  }

  def calculateResultF(): Int = {
    i += 1
    i * n
  }

  val resultA = calculateResultA()
  val resultB = calculateResultB()
  val resultC = calculateResultC()
  val resultD = calculateResultD()
  val resultE = calculateResultE()
  val resultF = calculateResultF()

  println(s"k + 12 * m = $resultA")
  println(s"m / j = $resultB")
  println(s"n % j = $resultC")
  println(s"m / j * j = $resultD")
  println(s"f + 10 * 5 + g = $resultE")
  println(s"++i * n = $resultF")
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
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$signatureHelp$1(ScalaPresentationCompiler.scala:332)
```
#### Short summary: 

java.lang.NullPointerException: Cannot invoke "scala.reflect.internal.Types$Type.typeSymbol()" because "tp" is null