package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB7 {
  lazy val runner = Runner("", "nameDOB7.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB7 {
  import TestNameDOB7._

  @Test def test_nameDOB7_testBin1() { runner.runOneTest("nameDOB7_testBin1") }

  //
  // This additional test shows much more complex outputValueCalcs of
  // stored occurs counts and lengths.
  //
  @Test def test_nameDOB7_testBin1_b() { runner.runOneTest("nameDOB7_testBin1_b") }

}
