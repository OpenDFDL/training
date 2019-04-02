/* Copyright (c) 2019 Tresys Technology, LLC. All rights reserved. */
package com.tresys.csv

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestNameDOBBinary {
  lazy val runner = Runner("/com/tresys/csv/", "nameDOBBinary.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestNameDOBBinary {
  import TestNameDOBBinary._

  @Test def test_nameDOB_testBin1() { runner.runOneTest("nameDOB_testBin1") }
  @Test def test_nameDOB_testBinOVC1() { runner.runOneTest("nameDOB_testBinOVC1") }

}
