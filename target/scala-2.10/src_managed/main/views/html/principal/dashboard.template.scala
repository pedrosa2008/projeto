
package views.html.principal

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
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Usuario,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(usuario: Usuario):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

"""),_display_(Seq[Any](/*3.2*/templates/*3.11*/.main(usuario)/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
	
	<div class="row">
		<div class="col-sm-3">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-4">
							<i class="fa fa-comments fa-5x"></i>
						</div>
						<div class="col-xs-8 text-right">
							<p class="announcement-heading">456</p>
							<p class="announcement-text">New Mentions!</p>
						</div>
					</div>
				</div>
				<a href="#">
					<div class="panel-footer announcement-bottom">
						<div class="row">
							<div class="col-xs-10">
								View Mentions
							</div>
							<div class="col-xs-2 text-right">
								<i class="fa fa-arrow-circle-right"></i>
							</div>
						</div>
					</div>
				</a>
			</div>
		</div>
		
		<div class="col-sm-3">
			<div class="panel panel-warning">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-4">
							<i class="fa fa-check fa-5x"></i>
						</div>
						<div class="col-xs-8 text-right">
							<p class="announcement-heading">12</p>
							<p class="announcement-text">To-Do Items</p>
						</div>
					</div>
				</div>
				<a href="#">
					<div class="panel-footer announcement-bottom">
						<div class="row">
							<div class="col-xs-10">
								Complete Tasks
							</div>
							<div class="col-xs-2 text-right">
								<i class="fa fa-arrow-circle-right"></i>
							</div>
						</div>
					</div>
				</a>
			</div>
		</div>
		
		<div class="col-sm-3">
			<div class="panel panel-danger">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-4">
							<i class="fa fa-tasks fa-5x"></i>
						</div>
						<div class="col-xs-8 text-right">
							<p class="announcement-heading">18</p>
							<p class="announcement-text">Crawl Errors</p>
						</div>
					</div>
				</div>
				<a href="#">
					<div class="panel-footer announcement-bottom">
						<div class="row">
							<div class="col-xs-10">
								Fix Issues
							</div>
							<div class="col-xs-2 text-right">
								<i class="fa fa-arrow-circle-right"></i>
							</div>
						</div>
					</div>
				</a>
			</div>
		</div>
		
		<div class="col-sm-3">
			<div class="panel panel-success">
				<div class="panel-heading">
					<div class="row">
						<div class="col-xs-4">
							<i class="fa fa-inbox fa-5x"></i>
						</div>
						<div class="col-xs-8 text-right">
							<p class="announcement-heading">56</p>
							<p class="announcement-text">New Orders!</p>
						</div>
					</div>
				</div>
				<a href="#">
					<div class="panel-footer announcement-bottom">
						<div class="row">
							<div class="col-xs-10">
								Complete Orders
							</div>
							<div class="col-xs-2 text-right">
								<i class="fa fa-arrow-circle-right"></i>
							</div>
						</div>
					</div>
				</a>
			</div>
		</div>
	</div><!-- /.row -->
		
	<div class="row">
		<div class="col-sm-12">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title"><i class="fa fa-bar-chart-o"></i> Traffic Statistics: October 1, 2013 - October 31, 2013</h3>
				</div>
				<div class="panel-body">
					<div id="morris-chart-area"></div>
				</div>
			</div>
		</div>
	</div><!-- /.row -->
		
	<div class="row">
		<div class="col-sm-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> Traffic Sources: October 1, 2013 - October 31, 2013</h3>
				</div>
				<div class="panel-body">
					<div id="morris-chart-donut"></div>
					<div class="text-right">
						<a href="#">View Details <i class="fa fa-arrow-circle-right"></i></a>
					</div>
				</div>
			</div>
		</div>
		
		<div class="col-sm-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title"><i class="fa fa-clock-o"></i> Recent Activity</h3>
				</div>
				<div class="panel-body">
					<div class="list-group">
						<a href="#" class="list-group-item">
							<span class="badge">just now</span>
							<i class="fa fa-calendar"></i> Calendar updated
						</a>
						<a href="#" class="list-group-item">
							<span class="badge">4 minutes ago</span>
							<i class="fa fa-comment"></i> Commented on a post
						</a>
						<a href="#" class="list-group-item">
							<span class="badge">23 minutes ago</span>
							<i class="fa fa-truck"></i> Order 392 shipped
						</a>
						<a href="#" class="list-group-item">
							<span class="badge">46 minutes ago</span>
							<i class="fa fa-money"></i> Invoice 653 has been paid
						</a>
						<a href="#" class="list-group-item">
							<span class="badge">1 hour ago</span>
							<i class="fa fa-user"></i> A new user has been added
						</a>
						<a href="#" class="list-group-item">
							<span class="badge">2 hours ago</span>
							<i class="fa fa-check"></i> Completed task: "pick up dry cleaning"
						</a>
						<a href="#" class="list-group-item">
							<span class="badge">yesterday</span>
							<i class="fa fa-globe"></i> Saved the world
						</a>
						<a href="#" class="list-group-item">
							<span class="badge">two days ago</span>
							<i class="fa fa-check"></i> Completed task: "fix error on sales page"
						</a>
					</div>
					<div class="text-right">
						<a href="#">View All Activity <i class="fa fa-arrow-circle-right"></i></a>
					</div>
				</div>
			</div>
		</div>
		<!-- 
		<div class="col-sm-4">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title"><i class="fa fa-money"></i> Recent Transactions</h3>
				</div>
				<div class="panel-body">
					<div class="table-responsive">
						<table class="table table-bordered table-hover table-striped tablesorter">
						  <thead>
						    <tr>
						      <th>Order # <i class="fa fa-sort"></i></th>
						      <th>Order Date <i class="fa fa-sort"></i></th>
						      <th>Order Time <i class="fa fa-sort"></i></th>
						      <th>Amount (USD) <i class="fa fa-sort"></i></th>
						    </tr>
						  </thead>
						  <tbody>
						    <tr>
						      <td>3326</td>
						      <td>10/21/2013</td>
						      <td>3:29 PM</td>
						      <td>$321.33</td>
						    </tr>
						    <tr>
						      <td>3325</td>
						      <td>10/21/2013</td>
						      <td>3:20 PM</td>
						      <td>$234.34</td>
						    </tr>
						    <tr>
						      <td>3324</td>
						      <td>10/21/2013</td>
						      <td>3:03 PM</td>
						      <td>$724.17</td>
						    </tr>
						    <tr>
						      <td>3323</td>
						      <td>10/21/2013</td>
						      <td>3:00 PM</td>
						      <td>$23.71</td>
						    </tr>
						    <tr>
						      <td>3322</td>
						      <td>10/21/2013</td>
						      <td>2:49 PM</td>
						      <td>$8345.23</td>
						    </tr>
						    <tr>
						      <td>3321</td>
						      <td>10/21/2013</td>
						      <td>2:23 PM</td>
						      <td>$245.12</td>
						    </tr>
						    <tr>
						      <td>3320</td>
						      <td>10/21/2013</td>
						      <td>2:15 PM</td>
						      <td>$5663.54</td>
						    </tr>
						  </tbody>
						</table>
					</div>
					<div class="text-right">
						<a href="#">View All Transactions <i class="fa fa-arrow-circle-right"></i></a>
					</div>
				</div>
			</div>
		</div>
		 -->
	</div><!-- /.row -->
	
""")))})))}
    }
    
    def render(usuario:Usuario): play.api.templates.HtmlFormat.Appendable = apply(usuario)
    
    def f:((Usuario) => play.api.templates.HtmlFormat.Appendable) = (usuario) => apply(usuario)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jan 16 10:34:25 BRST 2014
                    SOURCE: D:/Desenv_Pessoal/workspaces/eclipse_indigo/play-projeto/projeto/app/views/principal/dashboard.scala.html
                    HASH: eda83356f4fe7129c88e9d5023f5f05e86204b7c
                    MATRIX: 789->1|901->19|938->22|955->31|977->45|1015->46
                    LINES: 26->1|29->1|31->3|31->3|31->3|31->3
                    -- GENERATED --
                */
            