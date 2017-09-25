<script type="text/javascript">
	function sendHospital(hospitalId) {
		AjaxSearchSpecialize.getBySpecialize(hospitalId, callbackCat);
	}

	function callbackCat(message) {
		dwr.util.removeAllOptions("specializelist");
		dwr.util.addOptions("specializelist", message, "id", "specializetype");
	}
</script>
<script type="text/javascript" src="js/prototype.js"></script>
<script type="text/javascript" src="js/effects.js"></script>
<script type="text/javascript" src="js/controls.js"></script>
<script type="text/javascript" src="js/scriptaculous.js"></script>
<script type='text/javascript' src="js/autocompleteex.js"></script>
<script src='dwr/engine.js'></script>
<script src='dwr/util.js'></script>
<script src='dwr/interface/AjaxSearchSpecialize.js'></script>