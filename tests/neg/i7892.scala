import scala.quoted._

package x {
  class CExprResult1[T]
}

def run(using qctx: QuoteContext): Unit = {
  val cpsLeft: x.CExprResult1[?] = ???
  run1(cpsLeft) // error
}

def run1[L:Type](cpsLeft: x.CExprResult1[L]): Unit = ???
