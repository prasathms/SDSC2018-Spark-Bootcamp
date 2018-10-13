package chrism.sdsc

import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll, FunSuite, Matchers}

private[sdsc] abstract class TestSuite
  extends FunSuite
    with TypeCheckedTripleEquals
    with Matchers
    with BeforeAndAfter
    with BeforeAndAfterAll