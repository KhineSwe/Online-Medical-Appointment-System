<!-- @@@@@@@@@@@@@@@@@@@@@@@@Doctor Management@@@@@@@@@@@@@@@@@@@@@@@ -->

<script type="text/javascript">
	// should be in the "onload" of the body
	function createAutoCompleter() {
		new Autocompleter.DWR("frmHospitalName1", "choices1",
				populateAutocomplete, {
					afterUpdateElement : HospitalSelected,
					valueSelector : HospitalValueSelector
				});
	}
	// the callback for the auto completer
	function populateAutocomplete(autocompleter, token) {
		AjaxHospitalSearch.findHospitalByLikeFromService(token, function(
				suggestions) {
			if (suggestions != null) {
				autocompleter.setChoices(suggestions);
			} else {
				autocompleter.setChoices("");
			}
		});
	}
	//this function extractes string from sample object for matching
	function HospitalValueSelector(Hospital) {

		return Hospital.hosname;
	}
	//this function is fired when users selects sample from list
	function HospitalSelected(inputElement, selectedElement, Hospital) {

		dwr.util.setValue("selectHospitalId", Hospital.id);

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
<script src='dwr/interface/AjaxHospitalSearch.js'></script>

<!-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->
</head>