/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */

package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB3 {
  lazy val runner = Runner("/com/tresys/csv/", "nameDOB3.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB3 {
  import TestNameDOB3._

  @Test def test_nameDOB3_test1() { runner.runOneTest("nameDOB3_test1") }

}
