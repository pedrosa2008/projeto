
package views.html.componentes

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
object messages extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*2.3*/if(flash.contains("error"))/*2.30*/ {_display_(Seq[Any](format.raw/*2.32*/("""
		<div class="alert alert-danger alert-dismissable">
			<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
			"""),_display_(Seq[Any](/*5.5*/flash/*5.10*/.get("error"))),format.raw/*5.23*/("""
		</div>
	""")))})),format.raw/*7.3*/("""
	
	"""),_display_(Seq[Any](/*9.3*/if(flash.contains("success"))/*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
		<div class="alert alert-success alert-dismissable">
			<button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
			"""),_display_(Seq[Any](/*12.5*/flash/*12.10*/.get("success"))),format.raw/*12.25*/("""
		</div>
	""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 16 10:25:09 BRST 2014
                    SOURCE: D:/Desenv_Pessoal/workspaces/eclipse_indigo/play-projeto/projeto/app/views/componentes/messages.scala.html
                    HASH: 0ce7b5a7ed42f13a243b96079a0926f467a2a1f7
                    MATRIX: 879->5|914->32|953->34|1144->191|1157->196|1191->209|1235->223|1276->230|1313->259|1352->261|1545->419|1559->424|1596->439
                    LINES: 29->2|29->2|29->2|32->5|32->5|32->5|34->7|36->9|36->9|36->9|39->12|39->12|39->12
                    -- GENERATED --
                */
            