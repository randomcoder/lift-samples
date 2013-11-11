package code.snippet

import net.liftweb.util.Helpers._

/**
 * Created with IntelliJ IDEA.
 * User: Tim
 * Date: 11/11/13
 * Time: 20:42
 * To change this template use File | Settings | File Templates.
 */
class SampleListing {

  def offered = {
    "#offered *" #> <h3>An Offered listing</h3>
  }

  def wanted = {
    "#wanted *" #> <h3>A Wanted listing</h3>
  }
}
