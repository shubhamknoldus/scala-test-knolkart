package edu.knoldus.account.test

import edu.knolkart.Model.User
import edu.knolkart.accountservice.AddUserService
import org.scalatest.FunSuite

class AddUserServiceTest extends FunSuite{
  val user1 = User("Ram", "Ram@123", "ram@gmail.com", "9807263516")
  val user1withModificationNumber = User("Ram", "Ram@123", "ram@gmail.com", "5656587879")
  val user1withModification = User("Ram", "Ram@123", "shyam@gmail.com", "9807263516")
  val user2 = User("Laxman", "Laxman@123", "laxman@gmail.com", "8763529122")
  val user3 = User("Shyam", "Shyam@123", "shyam@gmail.com", "9354672897")
  val user4 = User("Ankit", "Ankit@123", "ankit@gmail.com", "7230920828")
  val user5 = User("Abhishek", "abhi@123", "abhi@gmail.com", "2456342213")

  val userMap: Map[Int ,User] = Map(
    user1.getMapKey -> user1,
    user2.getMapKey -> user2,
    user3.getMapKey -> user3,
    user4.getMapKey -> user4
  )

  val addUserServiceObj = AddUserService(userMap)

  test("It should return false on adding a user with same email"){
    assert(!addUserServiceObj.addUser(user1withModification))
  }
  test("It should also return false on adding the user with same number"){
    assert(!addUserServiceObj.addUser(user1withModificationNumber))
  }
  test("should return true on adding a normal user"){
    assert(addUserServiceObj.addUser(user5))
  }

//  test("it should return fale")

}
