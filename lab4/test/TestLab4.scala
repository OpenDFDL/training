
import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB4 {
  lazy val runner = Runner("", "nameDOB4.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB4 {
  import TestNameDOB4._

  @Test def test_nameDOB4_test1(): Unit = { runner.runOneTest("nameDOB4_test1") }

}
