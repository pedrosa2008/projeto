
package views.html.templates

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Usuario,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: Usuario)(body: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
    	"""),_display_(Seq[Any](/*7.7*/imports/*7.14*/.stylesheet())),format.raw/*7.27*/("""
    </head>
    
    <body>
		<div id="wrapper">
			
			<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">Projeto Admin</a>
				</div>
				
				<div class="collapse navbar-collapse navbar-ex1-collapse">
					<ul class="nav navbar-nav side-nav">
						<li class="active"><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
						<li><a href="#"><i class="fa fa-bar-chart-o"></i> Charts</a></li>
						<li><a href="#"><i class="fa fa-table"></i> Tables</a></li>
						<li><a href="#"><i class="fa fa-edit"></i> Forms</a></li>
						<li><a href="#"><i class="fa fa-font"></i> Typography</a></li>
						<li><a href="#"><i class="fa fa-desktop"></i> Bootstrap Elements</a></li>
						<li><a href="#"><i class="fa fa-wrench"></i> Bootstrap Grid</a></li>
						<li><a href="#"><i class="fa fa-file"></i> Blank Page</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-caret-square-o-down"></i> Dropdown <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">Dropdown Item</a></li>
								<li><a href="#">Another Item</a></li>
								<li><a href="#">Third Item</a></li>
								<li><a href="#">Last Item</a></li>
							</ul>
						</li>
					</ul>
					
					<ul class="nav navbar-nav navbar-right navbar-user">
						<li class="dropdown messages-dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> Messages <span class="badge">7</span> <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li class="dropdown-header">7 New Messages</li>
								<li class="message-preview">
									<a href="#">
										<span class="avatar"><img src="http://placehold.it/50x50"></span>
										<span class="name">John Smith:</span>
										<span class="message">Hey there, I wanted to ask you something...</span>
										<span class="time"><i class="fa fa-clock-o"></i> 4:34 PM</span>
									</a>
								</li>
								<li class="divider"></li>
								<li class="message-preview">
									<a href="#">
										<span class="avatar"><img src="http://placehold.it/50x50"></span>
										<span class="name">John Smith:</span>
										<span class="message">Hey there, I wanted to ask you something...</span>
										<span class="time"><i class="fa fa-clock-o"></i> 4:34 PM</span>
									</a>
								</li>
								<li class="divider"></li>
								<li class="message-preview">
									<a href="#">
										<span class="avatar"><img src="http://placehold.it/50x50"></span>
										<span class="name">John Smith:</span>
										<span class="message">Hey there, I wanted to ask you something...</span>
										<span class="time"><i class="fa fa-clock-o"></i> 4:34 PM</span>
									</a>
								</li>
								<li class="divider"></li>
								<li><a href="#">View Inbox <span class="badge">7</span></a></li>
							</ul>
						</li>
						<li class="dropdown alerts-dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> Alerts <span class="badge">3</span> <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#">Default <span class="label label-default">Default</span></a></li>
								<li><a href="#">Primary <span class="label label-primary">Primary</span></a></li>
								<li><a href="#">Success <span class="label label-success">Success</span></a></li>
								<li><a href="#">Info <span class="label label-info">Info</span></a></li>
								<li><a href="#">Warning <span class="label label-warning">Warning</span></a></li>
								<li><a href="#">Danger <span class="label label-danger">Danger</span></a></li>
								<li class="divider"></li>
								<li><a href="#">View All</a></li>
							</ul>
						</li>
						<li class="dropdown user-dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> """),_display_(Seq[Any](/*95.95*/usuario/*95.102*/.pessoa.nome)),format.raw/*95.114*/(""" <b class="caret"></b></a>
							<ul class="dropdown-menu">
								<li><a href="#"><i class="fa fa-user"></i> Profile</a></li>
								<li><a href="#"><i class="fa fa-envelope"></i> Inbox <span class="badge">7</span></a></li>
								<li><a href="#"><i class="fa fa-gear"></i> Settings</a></li>
								<li class="divider"></li>
								<li><a href=""""),_display_(Seq[Any](/*101.23*/routes/*101.29*/.Autenticacao.logout())),format.raw/*101.51*/(""""><i class="fa fa-power-off"></i> Log Out</a></li>
							</ul>
						</li>
					</ul>
				</div>
			</nav>
			
			<div id="page-wrapper">
				<div class="row">
					<div class="col-lg-12">
						<h1>Dashboard <small>Statistics Overview</small></h1>
						<ol class="breadcrumb">
							<li class="active"><i class="fa fa-dashboard"></i> Dashboard</li>
						</ol>
						
						"""),_display_(Seq[Any](/*116.8*/componentes/*116.19*/.messages())),format.raw/*116.30*/("""
					          
					</div>
				</div>
				
				"""),_display_(Seq[Any](/*121.6*/body)),format.raw/*121.10*/("""
			</div>
		</div>
    </body>
    
    """),_display_(Seq[Any](/*126.6*/imports/*126.13*/.javascript())),format.raw/*126.26*/("""
</html>
"""))}
    }
    
    def render(usuario:Usuario,body:Html): play.api.templates.HtmlFormat.Appendable = apply(usuario)(body)
    
    def f:((Usuario) => (Html) => play.api.templates.HtmlFormat.Appendable) = (usuario) => (body) => apply(usuario)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 16 10:34:25 BRST 2014
                    SOURCE: D:/Desenv_Pessoal/workspaces/eclipse_indigo/play-projeto/projeto/app/views/templates/main.scala.html
                    HASH: 4421c753bb44f2027dba85329a54b4a666cd8866
                    MATRIX: 789->1|913->31|990->74|1005->81|1039->94|5434->4453|5451->4460|5486->4472|5876->4825|5892->4831|5937->4853|6352->5232|6373->5243|6407->5254|6493->5304|6520->5308|6598->5350|6615->5357|6651->5370
                    LINES: 26->1|29->1|35->7|35->7|35->7|123->95|123->95|123->95|129->101|129->101|129->101|144->116|144->116|144->116|149->121|149->121|154->126|154->126|154->126
                    -- GENERATED --
                */
            