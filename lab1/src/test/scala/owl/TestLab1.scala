/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */

package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB1 {
  lazy val runner = Runner("owl/", "nameDOB1.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB1 {
  import TestNameDOB1._

  @Test def test_nameDOB_test1() { runner.runOneTest("nameDOB_test1") }
  @Test def test_nameDOB_test_bad_1() { runner.runOneTest("nameDOB_test_bad_1") }

}
