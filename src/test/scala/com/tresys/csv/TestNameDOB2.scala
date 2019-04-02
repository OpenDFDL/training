/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */
package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB2 {
  lazy val runner = Runner("/com/tresys/csv/", "nameDOB2.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB2 {
  import TestNameDOB2._

  @Test def test_nameDOB_test2() { runner.runOneTest("nameDOB_test2") }
  @Test def test_nameDOB_test3() { runner.runOneTest("nameDOB_test3") }

}
