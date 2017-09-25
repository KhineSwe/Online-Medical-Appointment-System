<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/template.css" />
<link rel="stylesheet" href="css/updateprofile.css" />

<script src="js1/jquery.min.js"></script>
<script src="js1/my.js"></script>
<script src="js1/bootstrap.min.js"></script>

<!-- for rating
<script type="text/javascript" src="js-css/jquery.js"></script>
<script type="text/javascript" src="js-css/rating_simple.js"></script>
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
</script> -->





<script type="text/javascript">
	// should be in the "onload" of the body
	function createAutoCompleter() {
		new Autocompleter.DWR("frmTreatmentName1", "choices1",
				populateAutocomplete, {
					afterUpdateElement : TreatmentSelected,
					valueSelector : TreatmentValueSelector
				});
	}
	// the callback for the auto completer
	function populateAutocomplete(autocompleter, token) {
		AjaxTreatmentSearch.findTreatmentByLikeFromService(token, function(
				suggestions) {
			if (suggestions != null) {
				autocompleter.setChoices(suggestions);
			} else {
				autocompleter.setChoices("");
			}
		});
	}
	//this function extractes string from sample object for matching
	function TreatmentValueSelector(TreatmentView) {

		return TreatmentView.pname;
	}
	//this function is fired when users selects sample from list
	function TreatmentSelected(inputElement, selectedElement, TreatmentView) {

		dwr.util.setValue("selectTreatmentId", TreatmentView.id);

	}
//-->
</script>
<!-- <link href="css/library.css" rel="stylesheet" type="text/css"> -->
<!-- Declare the autocomplement style -->
<style type="text/css">
div.choices ul { /* autocomplete candidate */
	list-style-type: none;
	background-color: #fff;
	border: 2px solid #ccc;
	margin-left: 0;
	margin-top: 0;
	padding-left: 5px;
	padding-top: 0;
}

div.choices ul li.selected { /* selected autocomplete*/
	background-color: #99ccff;
	font-weight: bold;
}
</style>
<!-- Declare the javascript for scriptaculous -->
<script type="text/javascript" src="js/prototype.js"></script>
<script type="text/javascript" src="js/effects.js"></script>
<script type="text/javascript" src="js/controls.js"></script>
<script type="text/javascript" src="js/scriptaculous.js"></script>
<script type='text/javascript' src="js/autocompleteex.js"></script>
<!-- Declare the javascript for DWR -->
<script src='dwr/engine.js'></script>
<script src='dwr/util.js'></script>
<!-- Do the javascript function for auto complement -->
<script src='dwr/interface/AjaxTreatmentSearch.js'></script>


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
					<a class="navbar-brand" href="Doctoromas.do">OMAS</a>
				</div>
				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav">
						<li><a href="treatmentlistPath.do?frmControl=1">Treatment
								List</a></li>
						<!-- .dropdown -->
						<li><a href="appointmentPathFirst.do?frmControl=1">Appointment</a></li>
						<li><a href="docfaq.do">FAQ</a></li>
						<li><a href="docContactMailPathFistafterlogin.do">Contact
								Us</a></li>
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
</body>