
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
object stylesheet extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.2*/("""<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>"""),_display_(Seq[Any](/*3.13*/Messages("app.title"))),format.raw/*3.34*/("""</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.55*/routes/*9.61*/.Assets.at("images/favicon.png"))),format.raw/*9.93*/("""">
    
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.50*/routes/*11.56*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*11.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.50*/routes/*12.56*/.Assets.at("stylesheets/theme.css"))),format.raw/*12.91*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.50*/routes/*13.56*/.Assets.at("font-awesome/css/font-awesome.min.css"))),format.raw/*13.107*/("""">"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 16 10:24:38 BRST 2014
                    SOURCE: D:/Desenv_Pessoal/workspaces/eclipse_indigo/play-projeto/projeto/app/views/imports/stylesheet.scala.html
                    HASH: 24551840c60752d4352f2b3fea599c38156d6448
                    MATRIX: 868->4|1024->125|1066->146|1337->382|1351->388|1404->420|1499->479|1514->485|1579->528|1668->581|1683->587|1740->622|1829->675|1844->681|1918->732
                    LINES: 29->2|30->3|30->3|36->9|36->9|36->9|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13
                    -- GENERATED --
                */
            