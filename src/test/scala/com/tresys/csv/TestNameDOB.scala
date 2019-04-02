/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */

package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB {
  lazy val runner = Runner("/com/tresys/csv/", "nameDOB.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB {
  import TestNameDOB._

  @Test def test_nameDOB_test1() { runner.runOneTest("nameDOB_test1") }

}
