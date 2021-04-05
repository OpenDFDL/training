/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */

package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB4 {
  lazy val runner = Runner("owl/", "nameDOB4.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB4 {
  import TestNameDOB4._

  @Test def test_nameDOB4_test1() { runner.runOneTest("nameDOB4_test1") }

}
