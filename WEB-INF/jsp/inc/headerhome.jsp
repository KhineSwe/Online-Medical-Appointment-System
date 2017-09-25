<html lang="en">
<head>
<title></title>
<meta charset="utf-8">

<!-- for rating............ -->

<script type="text/javascript" src="js-css/jquery.js"></script>
<script type="text/javascript" src="js-css/rating_simple.js"></script>
<script type="text/javascript" src="js1/my.js"></script>
<link href="js-css/rating_simple.css" rel="stylesheet" type="text/css" />
<link href="js-css/style.css" rel="stylesheet" type="text/css" />

<script language="javascript" type="text/javascript">

var j = jQuery.noConflict();
j(document).ready( function() {
	
	var textRate = j('#rating_simple2').val();

	j("#rating_simple2").webwidget_rating_simple({
		rating_star_length : '5',
		rating_initial_value : textRate,
		rating_function_name : '',//this is function name for click
		directory : 'js-css/'
	});

});
</script>
<!-- .................... -->




</head>
<body>
	<header>

		<div class="myheader">
				<img src="images/aoa_header.jpg" class="img-responsive" /> 		 
		</div>

		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="omas.do">OMAS</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">


						<li><a href="speSubPath.do?frmControl=1">Appointment</a></li>





						<li class="dropdown" class="active"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown" role="button"
							aria-expanded="false">History <span class="caret"></span></a>
							<ul class="dropdown-menu" role="menu">
								<li class="dropdown-submenu"><a tabindex="-1"
									href="treatmentPath.do?frmControl=1"> Hospital <i
										class="fa fa-chevron-right"></i></a></li>
								<li class="dropdown-submenu"><a tabindex="-1"
									href="searchbyspecializePath.do?frmControl=5">
										Specialization <i class="fa fa-chevron-right"></i>
								</a></li>

								<li class="dropdown-submenu"><a tabindex="-1"
									href="searchbydoctorPath.do?frmControl=3"> Doctor<i
										class="fa fa-chevron-right"></i></a></li>
							</ul></li>



						<li><a href="about.do">About</a></li>
						<li><a href="faq.do">FAQ</a></li>
						<li><a href="contactMailPathFistafterlogin.do">Contact Us</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="updatePathFirst.do"><span
								class="glyphicon glyphicon-edit"></span> Profile Edit </a></li>
						<li><a href="logoutPath.do"><span
								class="glyphicon glyphicon-logout"></span> Logout </a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	
	<div class="container">
	<div class="row">