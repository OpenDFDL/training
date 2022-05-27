
import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB7 {
  lazy val runner = Runner("", "nameDOB7.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB7 {
  import TestNameDOB7._

  @Test def test_nameDOB7_testBin1(): Unit = { runner.runOneTest("nameDOB7_testBin1") }

  //
  // This additional test shows much more complex outputValueCalcs of
  // stored occurs counts and lengths.
  //
  @Test def test_nameDOB7_testBin1_b(): Unit = { runner.runOneTest("nameDOB7_testBin1_b") }
  @Test def test_nameDOB7_testBin1_c(): Unit = { runner.runOneTest("nameDOB7_testBin1_c") }

}
