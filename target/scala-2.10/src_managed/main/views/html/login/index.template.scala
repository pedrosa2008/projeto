
package views.html.login

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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Usuario],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(form: Form[Usuario]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""

<!DOCTYPE html>

<html>
    <head>
    	"""),_display_(Seq[Any](/*7.7*/imports/*7.14*/.stylesheet())),format.raw/*7.27*/("""
    </head>
    
    <body>
	
	    <div class="container theme-showcase">
	    	
		    """),_display_(Seq[Any](/*14.8*/if(form.hasGlobalErrors)/*14.32*/ {_display_(Seq[Any](format.raw/*14.34*/("""
		    	<div class="alert alert-warning alert-dismissable">
					<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
		            """),_display_(Seq[Any](/*17.16*/form/*17.20*/.globalError.message)),format.raw/*17.40*/("""
				</div>
		    """)))})),format.raw/*19.8*/("""
		    	
			"""),_display_(Seq[Any](/*21.5*/componentes/*21.16*/.messages())),format.raw/*21.27*/("""
		    
			<div class="jumbotron">
				<h1><strong>"""),_display_(Seq[Any](/*24.18*/Messages("app.title"))),format.raw/*24.39*/("""</strong></h1>
				
		    	"""),_display_(Seq[Any](/*26.9*/helper/*26.15*/.form(routes.Autenticacao.login)/*26.47*/ {_display_(Seq[Any](format.raw/*26.49*/("""
				    
				    <div class="form-inline" role="form" align="right">
						<div class="form-group" style="padding: 3px">
							<input type="text" class="form-control" name="usuario" id="usuario" placeholder=""""),_display_(Seq[Any](/*30.90*/Messages("label.usuario"))),format.raw/*30.115*/("""" value=""""),_display_(Seq[Any](/*30.125*/form("usuario")/*30.140*/.value)),format.raw/*30.146*/("""">
						</div>
						
						<div class="form-group" style="padding: 3px">
							<input type="password" class="form-control" name="senha" id="senha" placeholder=""""),_display_(Seq[Any](/*34.90*/Messages("label.senha"))),format.raw/*34.113*/("""" value=""""),_display_(Seq[Any](/*34.123*/form("senha")/*34.136*/.value)),format.raw/*34.142*/("""">
						</div>
						
						<div class="form-group" style="padding: 3px">
							<button type="submit" class="btn btn-default">"""),_display_(Seq[Any](/*38.55*/Messages("label.autenticar"))),format.raw/*38.83*/("""</button>
		 				</div>
	 				</div>
				""")))})),format.raw/*41.6*/("""
			</div>
        </div>
    </body>
    
    """),_display_(Seq[Any](/*46.6*/imports/*46.13*/.javascript())),format.raw/*46.26*/("""
</html>"""))}
    }
    
    def render(form:Form[Usuario]): play.api.templates.HtmlFormat.Appendable = apply(form)
    
    def f:((Form[Usuario]) => play.api.templates.HtmlFormat.Appendable) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 16 10:35:30 BRST 2014
                    SOURCE: D:/Desenv_Pessoal/workspaces/eclipse_indigo/play-projeto/projeto/app/views/login/index.scala.html
                    HASH: e5c48319215db4109dafbdc8d8ce63c5bc6474a7
                    MATRIX: 787->1|902->22|979->65|994->72|1028->85|1152->174|1185->198|1225->200|1434->373|1447->377|1489->397|1539->416|1587->429|1607->440|1640->451|1728->503|1771->524|1834->552|1849->558|1890->590|1930->592|2177->803|2225->828|2272->838|2297->853|2326->859|2526->1023|2572->1046|2619->1056|2642->1069|2671->1075|2836->1204|2886->1232|2959->1274|3042->1322|3058->1329|3093->1342
                    LINES: 26->1|29->1|35->7|35->7|35->7|42->14|42->14|42->14|45->17|45->17|45->17|47->19|49->21|49->21|49->21|52->24|52->24|54->26|54->26|54->26|54->26|58->30|58->30|58->30|58->30|58->30|62->34|62->34|62->34|62->34|62->34|66->38|66->38|69->41|74->46|74->46|74->46
                    -- GENERATED --
                */
            