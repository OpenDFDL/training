/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */
package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB7 {
  lazy val runner = Runner("/com/tresys/csv/", "nameDOB7.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB7 {
  import TestNameDOB7._

  @Test def test_nameDOB7_testBin1() { runner.runOneTest("nameDOB7_testBin1") }

}
