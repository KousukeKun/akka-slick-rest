package models

case class User(id: Option[UserId], username: String, password: String, age: Int, gender: String)