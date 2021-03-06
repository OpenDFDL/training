
import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB3 {
  lazy val runner = Runner("", "nameDOB3.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB3 {
  import TestNameDOB3._

  @Test def test_nameDOB3_test1(): Unit = { runner.runOneTest("nameDOB3_test1") }
  @Test def test_nameDOB3_test2(): Unit = { runner.runOneTest("nameDOB3_test2") }

  // EXERCISE
  // Add a regression test driver line to invoke your new TDML test.

}
