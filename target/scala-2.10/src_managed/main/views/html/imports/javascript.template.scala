
package views.html.imports

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
object javascript extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.2*/("""<!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src=""""),_display_(Seq[Any](/*5.19*/routes/*5.25*/.Assets.at("javascripts/jquery-1.10.2.js"))),format.raw/*5.67*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*6.19*/routes/*6.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*6.67*/("""" type="text/javascript"></script>

    <!-- Page Specific Plugins -->
    <script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
    <script src="http://cdn.oesmith.co.uk/morris-0.4.3.min.js"></script>
    
    <script src=""""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Assets.at("javascripts/morris/chart-data-morris.js"))),format.raw/*12.78*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*13.19*/routes/*13.25*/.Assets.at("javascripts/tablesorter/jquery.tablesorter.js"))),format.raw/*13.84*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*14.19*/routes/*14.25*/.Assets.at("javascripts/tablesorter/tables.js"))),format.raw/*14.72*/("""" type="text/javascript"></script>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 16 10:23:47 BRST 2014
                    SOURCE: D:/Desenv_Pessoal/workspaces/eclipse_indigo/play-projeto/projeto/app/views/imports/javascript.scala.html
                    HASH: 37809c9eaf57e92f6987c582cffed5d769def061
                    MATRIX: 868->4|1086->187|1100->193|1163->235|1252->289|1266->295|1329->337|1633->605|1648->611|1723->664|1813->718|1828->724|1909->783|1999->837|2014->843|2083->890
                    LINES: 29->2|32->5|32->5|32->5|33->6|33->6|33->6|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14
                    -- GENERATED --
                */
            