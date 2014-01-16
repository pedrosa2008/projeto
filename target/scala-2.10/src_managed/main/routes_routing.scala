// @SOURCE:D:/Desenv_Pessoal/workspaces/eclipse_indigo/play-projeto/projeto/conf/routes
// @HASH:44217e06759beb6a63960716855e20bccc80b5f0
// @DATE:Thu Jan 16 10:35:06 BRST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Autenticacao_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Autenticacao_login1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Autenticacao_logout2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:11
private[this] lazy val controllers_Dashboard_dashboard3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
        

// @LINE:40
private[this] lazy val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Autenticacao.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Autenticacao.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Autenticacao.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.Dashboard.dashboard()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Autenticacao_index0(params) => {
   call { 
        invokeHandler(controllers.Autenticacao.index(), HandlerDef(this, "controllers.Autenticacao", "index", Nil,"GET", """ Autenticacao""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Autenticacao_login1(params) => {
   call { 
        invokeHandler(controllers.Autenticacao.login(), HandlerDef(this, "controllers.Autenticacao", "login", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Autenticacao_logout2(params) => {
   call { 
        invokeHandler(controllers.Autenticacao.logout(), HandlerDef(this, "controllers.Autenticacao", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:11
case controllers_Dashboard_dashboard3(params) => {
   call { 
        invokeHandler(controllers.Dashboard.dashboard(), HandlerDef(this, "controllers.Dashboard", "dashboard", Nil,"GET", """ Dashboard""", Routes.prefix + """dashboard"""))
   }
}
        

// @LINE:40
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     