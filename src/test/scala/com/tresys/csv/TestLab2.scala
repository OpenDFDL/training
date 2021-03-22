/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */

package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB2 {
  lazy val runner = Runner("lab2/com/tresys/csv/", "nameDOB2.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB2 {
  import TestNameDOB2._

  @Test def test_nameDOB2_test1() { runner.runOneTest("nameDOB2_test1") }
  @Test def test_nameDOB2_test_bad_1() { runner.runOneTest("nameDOB2_test_bad_1") }

}
