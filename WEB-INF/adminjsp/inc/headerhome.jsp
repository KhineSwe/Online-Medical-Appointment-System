<!DOCTYPE html>
<html lang="en">
<head>
  <title>OMAS (Online Medical Appointment System)</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/template_one.css">
  <script src="js1/jquery.min.js"></script>
  <script src="js1/bootstrap.min.js"></script>
  
</head>
<body>

 <!-- Start Container -->
<div class="container-fluid">
	 <!-- Start Sub Container -->
  <div class="row content">
  
  <!-- Start Header Bar -->
<nav class="navbar navbar-default">
	<div class="container-fluid">
		<ul class="nav navbar-nav navbar-left">
			<li> <h3> OMAS's Admin</h3> </li>
		</ul>
  
		<ul class="nav navbar-nav navbar-right">
			<li><a href="#"><span class="glyphicon glyphicon-user"></span> Welcome: Admin </a></li>
			<li><a href="adminlogoutPath.do"><span class="glyphicon glyphicon-log-out"></span> Logout </a></li>
		</ul>
	</div>
</nav>
	<!-- End Header Bar -->
	
	<!-- Start Side Bar -->
    <div class="col-sm-3 sidenav">	
	<br /><br />
      <ul class="nav nav-pills nav-stacked">
		
		<!-- Active Only Menu -->
		<div class="panel panel-default">
		<div class="panel-heading" data-toggle="collapse" data-parent="#accordion"  data-target="#collapse0">
			<li>
				<a href="#"> Hospital</a>
				<span class="caret"></span>
			</li>
		</div>
		<div id="collapse0" class="panel-collapse collapse">
			<div class="panel-body">
			<ul>
				<li><a href="hospitalListPath.do?frmControl=1">View Hospital Management</a></li>
				<li><a href="hospitalPathFirst.do">Add Hospital</a></li>
			</ul>
			</div>
		</div>
		</div>
		<!-- End Active Only Menu -->
		
		<!-- Active Only Menu -->
		<div class="panel panel-default">
		<div class="panel-heading" data-toggle="collapse" data-parent="#accordion"  data-target="#collapse00">
			<li>
				<a href="#"> Specialize</a>
				<span class="caret"></span>
			</li>
		</div>
		<div id="collapse00" class="panel-collapse collapse">
			<div class="panel-body">
			<ul>
				<li><a href="adminAddSpe.do?frmControl=2">Add New Specialize</a></li>
				<li><a href="adminSpe.do?frmControl=1">Add Specialize to Hospital</a></li>
				<li><a href="adminUpdateSpe.do">Update Specialize</a></li>
			</ul>
			</div>
		</div>
		</div>
		<!-- End Active Only Menu -->
	
		<!-- Default Only Menu -->
		<div class="panel panel-default">
		<div class="panel-heading" data-toggle="collapse" data-parent="#accordion"  data-target="#collapse1">
			<li>
				<a href="#"> Doctor</a>
				<span class="caret"></span>
			</li>
		</div>
		<div id="collapse1" class="panel-collapse collapse">
			<div class="panel-body">
			<ul>
				<li><a href="doctorlistPath.do?frmControl=1">View Doctor</a></li>
				<li><a href="doctorRegisterPathFirst.do">Add Doctor</a></li>
			</ul>
			</div>
		</div>
		</div>
		<!-- End Default Only Menu -->	
		<!-- Default Only Menu -->
		<div class="panel panel-default">
		<div class="panel-heading" data-toggle="collapse" data-parent="#accordion"  data-target="#collapse2">
			<li>
				<a href="#"> Schedule</a>
				<span class="caret"></span>
			</li>
		</div>
		<div id="collapse2" class="panel-collapse collapse">
			<div class="panel-body">
			<ul>
				<li><a href="adminspecSubPath.do">Create Schedule </a></li>
				<li><a href="adminupdatespecSubPath.do">Update Schedule</a></li>
			</ul>
			</div>
		</div>
		</div>
		<!-- End Default Only Menu -->	
		<!-- Default Only Menu -->
		<div class="panel panel-default">
		<div class="panel-heading" data-toggle="collapse" data-parent="#accordion"  data-target="#collapse3">
			<li>
				<a href="#"> Patient</a>
				<span class="caret"></span>
			</li>
		</div>
		<div id="collapse3" class="panel-collapse collapse">
			<div class="panel-body">
			<ul>
				<li><a href="autoComplementPath.do?frmControl=1">View Patient</a></li>
				
			</ul>
			</div>
		</div>
		</div>
		<!-- End Default Only Menu -->	
		<!-- Default Only Menu -->
		<div class="panel panel-default">
		<div class="panel-heading" data-toggle="collapse" data-parent="#accordion"  data-target="#collapse4">
			<li>
				<a href="#"> Appointment</a>
				<span class="caret"></span>
			</li>
		</div>
		<div id="collapse4" class="panel-collapse collapse">
			<div class="panel-body">
			<ul>
				<li><a href="AppointmentlistPathFirst.do">View Appointment List</a></li>
			</ul>
			</div>
		</div>
		</div>
		<!-- End Default Only Menu -->

      </ul><br>
    <!--   <div class="input-group">
        <input type="text" class="form-control" placeholder="Search..">
        <span class="input-group-btn">
          <button class="btn btn-default" type="button">
            <span class="glyphicon glyphicon-search"></span>
			</button>
        </span>
      </div> -->
    </div>
	<!-- End Side Bar -->
	
	<!-- Start Content -->
    <div class="col-sm-9 mycontent">