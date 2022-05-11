package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB6 {
  lazy val runner = Runner("", "nameDOB6.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB6 {
  import TestNameDOB6._

  @Test def test_nameDOB6_testBin1() { runner.runOneTest("nameDOB6_testBin1") }

}
