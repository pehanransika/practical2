file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question03.scala
### scala.reflect.internal.FatalError: 
  ThisType(method calculateNetPay) for sym which is not a class
     while compiling: file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question03.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -classpath <WORKSPACE>\.bloop\practical2\bloop-bsp-clients-classes\classes-Metals-slyWoRxeReuunToCIEQt1w==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\sourcegraph\semanticdb-javac\0.9.10\semanticdb-javac-0.9.10.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: TypeTree
       tree position: line 20 of file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question03.scala
            tree tpe: <error>
              symbol: <none>
   symbol definition: <none> (a NoSymbol)
      symbol package: <none>
       symbol owners: 
           call site: <none> in <none>

== Source file context for tree position ==

    17     val otHours: Int = 30
    18 
    19     val grossPay = calculateGrossPay(workingHours,otHours)
    20     val netPay = calculateNetPay(grossPa_CURSOR_y)
    21 
    22     println(f"The net pay (take-home salary) is Rs. $netPay%.2f")
    23   }

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\practical2\bloop-bsp-clients-classes\classes-Metals-slyWoRxeReuunToCIEQt1w== [missing ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\sourcegraph\semanticdb-javac\0.9.10\semanticdb-javac-0.9.10.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
offset: 530
uri: file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question03.scala
text:
```scala
object SalaryCalculator {
  val normalPayRate = 250
  val otPayRate= 85
  val taxRate = 0.12


  def calculateGrossPay(workingHours: Double, otHours: Double): Double = {
    workingHours*normalPayRate + otHours * otPayRate
  }

  def calculateNetPay(grossPay: Double, taxDeduction: Double): Double = {
    
  }

  def main(args: Array[String]): Unit = {
    val workingHours: Int = 40
    val otHours: Int = 30

    val grossPay = calculateGrossPay(workingHours,otHours)
    val netPay = calculateNetPay(grossPa@@y)

    println(f"The net pay (take-home salary) is Rs. $netPay%.2f")
  }
}

```



#### Error stacktrace:

```
scala.reflect.internal.Reporting.abort(Reporting.scala:70)
	scala.reflect.internal.Reporting.abort$(Reporting.scala:66)
	scala.reflect.internal.SymbolTable.abort(SymbolTable.scala:28)
	scala.reflect.internal.Types$ThisType.<init>(Types.scala:1394)
	scala.reflect.internal.Types$UniqueThisType.<init>(Types.scala:1414)
	scala.reflect.internal.Types$ThisType$.apply(Types.scala:1418)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$3.applyOrElse(AutoImportsProvider.scala:74)
	scala.meta.internal.pc.AutoImportsProvider$$anonfun$autoImports$3.applyOrElse(AutoImportsProvider.scala:60)
	scala.collection.immutable.List.collect(List.scala:267)
	scala.meta.internal.pc.AutoImportsProvider.autoImports(AutoImportsProvider.scala:60)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$autoImports$1(ScalaPresentationCompiler.scala:299)
```
#### Short summary: 

scala.reflect.internal.FatalError: 
  ThisType(method calculateNetPay) for sym which is not a class
     while compiling: file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question03.scala
        during phase: globalPhase=<no phase>, enteringPhase=parser
     library version: version 2.13.12
    compiler version: version 2.13.12
  reconstructed args: -classpath <WORKSPACE>\.bloop\practical2\bloop-bsp-clients-classes\classes-Metals-slyWoRxeReuunToCIEQt1w==;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\sourcegraph\semanticdb-javac\0.9.10\semanticdb-javac-0.9.10.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar;<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar -Xplugin-require:semanticdb -Yrangepos -Ymacro-expand:discard -Ycache-plugin-class-loader:last-modified -Ypresentation-any-thread

  last tree to typer: TypeTree
       tree position: line 20 of file:///C:/Users/pehan/AppData/Local/Temp/practical2/src/main/scala/question03.scala
            tree tpe: <error>
              symbol: <none>
   symbol definition: <none> (a NoSymbol)
      symbol package: <none>
       symbol owners: 
           call site: <none> in <none>

== Source file context for tree position ==

    17     val otHours: Int = 30
    18 
    19     val grossPay = calculateGrossPay(workingHours,otHours)
    20     val netPay = calculateNetPay(grossPa_CURSOR_y)
    21 
    22     println(f"The net pay (take-home salary) is Rs. $netPay%.2f")
    23   }