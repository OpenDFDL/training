
import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB1 {
  lazy val runner = Runner("", "nameDOB1.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB1 {
  import TestNameDOB1._

  @Test def test_nameDOB_test1(): Unit = { runner.runOneTest("nameDOB_test1") }
  @Test def test_nameDOB_test_bad_1(): Unit = { runner.runOneTest("nameDOB_test_bad_1") }

}
