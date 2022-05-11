/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */
package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOB5 {
  lazy val runner = Runner("", "nameDOB5.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOB5 {
  import TestNameDOB5._

  @Test def test_nameDOB5_test1() { runner.runOneTest("nameDOB5_test1") }

}
