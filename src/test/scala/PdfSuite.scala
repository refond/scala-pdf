
import org.scalatest._


/**
 * While in console mode (sbt / act):
 *
 * `test-only PdfSuite`
 *
 * Provides control on multiple tests classes execution.
 * Here it simply solves the execution problems arising
 * if tests specs are run in parallel (file, directories
 * management). See also beforeall, ...
 * @see http://doc.scalatest.org/3.0.1/#org.scalatest.Suite
 */
class PdfSuite extends Suites(new TestSpec) 
