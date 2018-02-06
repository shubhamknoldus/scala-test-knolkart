package edu.knolkart.Model

import edu.master.MasterDataEntities

case class User(name: String, password: String, email: String, number: String) extends MasterDataEntities {
 def getMapKey: Int = {
   (email, password, number) ##
 }
}
