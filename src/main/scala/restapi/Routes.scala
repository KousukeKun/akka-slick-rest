package restapi

import akka.http.scaladsl.server.Directives._
import api.{ApiErrorHandler, UsersApi}

trait Routes extends ApiErrorHandler with UsersApi /*extends ApiErrorHandler with UsersApi*/
{
  // val routes =
  //   pathPrefix("v1") {
  //     usersApi ~
  //     postsApi ~
  //     commentsApi
  //   } ~ path("")(getFromResource("public/index.html"))

  val routes = pathPrefix("v1") {
    usersApiRoutes
  } ~ path("")(getFromResource("public/index.html"))
}