package edu.knolkart.accountservice

import edu.knolkart.Model.User

case class AddUserService(userMap: Map[Int, User]) extends AccountService {
  override def addUser(userToAdd: User): Boolean = {
    if (!isUserUnique(userToAdd)) {
      userMap + (userToAdd.getMapKey -> userToAdd)
      true
    } else {
      false
    }
  }

  override def authenticateUser(email: String, password: String): Boolean = {
    val x = userMap.values.toList
    x.exists(x => x.email == email && x.password == password)
  }

  private def isUserUnique(userToCheck: User): Boolean = {
    val y = userMap.values.toList
    y.exists(user => user.email == userToCheck.email || user.number == userToCheck.number)
  }
}
