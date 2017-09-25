<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/template.css" />
<link rel="stylesheet" href="css/updateprofile.css" />
<script src="js1/jquery.min.js"></script>
<script src="js1/bootstrap.min.js"></script>
<script src="js1/my.js"></script>
<!--for rating-->
<script type="text/javascript" src="js-css/jquery.js"></script>
<script type="text/javascript" src="js-css/rating_simple.js"></script>
<script type="text/javascript" src="js1/-my.js"></script>
<link href="js-css/rating_simple.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">
	$(function() {
		
		var textRate = $('#rating_simple2').val();

		$("#rating_simple2").webwidget_rating_simple({
			rating_star_length : '5',
			rating_initial_value : textRate,
			rating_function_name : '',//this is function name for click
			directory : 'js-css/'
		});

	});
</script>
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
					<a class="navbar-brand" href="Doctoromas.do">OMAS</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li><a href="treatmentlistPath.do?frmControl=1">Treatment List</a></li>
						<!-- .dropdown -->
						<li><a href="appointmentPathFirst.do?frmControl=1">Appointment</a></li>
						<li><a href="docfaq.do">FAQ</a></li>
						<li><a href="docContactMailPathFistafterlogin.do">Contact Us</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="doctorupdatePathFirst.do"><span
								class="glyphicon glyphicon-edit"></span> Profile Edit </a></li>
						<li><a href="doctorlogoutPath.do"><span
								class="glyphicon glyphicon-logout"></span> Logout </a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	
	<div class="container">
	<div class="row">