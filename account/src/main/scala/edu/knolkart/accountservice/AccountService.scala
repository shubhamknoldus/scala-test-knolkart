package edu.knolkart.accountservice

import edu.knolkart.Model.User

trait AccountService {
  def addUser(userToAdd: User): Boolean
  def authenticateUser(email: String, password: String): Boolean
}
