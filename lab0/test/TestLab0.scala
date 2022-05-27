

import org.junit.Test
import org.apache.daffodil.tdml.Runner
import org.junit.AfterClass

object TestCSV {
  lazy val runner = Runner("", "csv.tdml")

  @AfterClass def shutdown: Unit = { runner.reset }

}

class TestCSV {
  import TestCSV._

  @Test def test_csv_test(): Unit = { runner.runOneTest("csv_test") }
  @Test def test_csv_test_2(): Unit = { runner.runOneTest("csv_test_2") }
  @Test def test_csv_test_bad_ok(): Unit = { runner.runOneTest("csv_test_bad_ok") }
  @Test def test_csv_test_bad_detected(): Unit = { runner.runOneTest("csv_test_bad_detected") }

}
