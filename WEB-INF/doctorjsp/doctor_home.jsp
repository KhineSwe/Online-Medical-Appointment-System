<%@ include file="inc/common.jsp"%>
<%@ include file="inc/headerforRating.jsp"%>

	<div class="container">
	
	<div class="row">
	
	<marquee> 
								
								<div style="float:left;padding-top:0.5%;"><h4> Welcome : ${doctorFormBean.frmDname} 

									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Your rating is: 

								</h4></div>
								<div style="float:right; border:0px solid red;">
								
								  
								<div style="margin-top: -11px;">
								<c:forEach var="i" begin="0"
										end="${doctorFormBean.mydrateValue.size() }" step="1">
									<c:set var="total"
											value="${total + doctorFormBean.mydrateValue[i-1].rateValue}" />
									</c:forEach> <html:hidden property="rating" value="${total * 0.2}"
										styleId="rating_simple2" />
								</div>		
								</div>
										</marquee> 
						
	
	</div>
<div class="row">
	<div class="panel panel-success">
		<div class="panel-heading">Sakura Hospital</div>
		<div class="panel-body col-sm-8">
			<p>No.23,Shin Saw Pu Road,Sanchaung Township,Yangon,Myanmar</p>
			<p>01512668 / 01512669,01510079,01613886,01513887 .</p>
			<p>EDP@sakurahospital.com.mm</p>
			<p>http:.//www.sakurahospital.com.mm</p>
			<p>01512668</p>
		</div>
		<div class="panel-body col-sm-4">
			<img src="myimage/sakura.jpg" class="img-responsive img-rounded"
				style="width: 100%" alt="Image">
		</div>
	</div>
</div>

<div class="row">
	<div class="panel panel-info">
		<div class="panel-heading">SSC Hospital</div>
		<div class="panel-body col-sm-4">
			<img src="myimage/ssc.jpg" class="img-responsive img-rounded"
				style="width: 100%" alt="Image">
		</div>
		<div class="panel-body col-sm-8">
			<p>SSC Hospial</p>
			<p>Shwegondaing Rd, Yangon 11201, Myanmar (Burma),</p>
			<p> Tamwe Township , Yangon.</p>
			<p>01545851 / 01-545759 / +95 9 794 507456</p>
			<p>01545851</p>
		</div>
	</div>
</div>

<div class="row">
<div class="panel panel-success">
		<div class="panel-heading">Shwe Baho Hospital</div>
			
			<div class="panel-body col-sm-8">
				<p>Shwe Ba Ho</p>
				<p>No.1/33 , Thema Byanar Road , Kyukkasan Road & Corner of
					Themabyanar Road , Matharyaemon</p>
				<p>, Tamwe Township , Yangon.</p>
				<p>01545851 / 01-545759 / 01-548605 / 01-548367 / 01-544090 /
					01-548783</p>
				<p>01545851</p>
			</div>
			<div class="panel-body col-sm-4">
				<img src="myimage/shwebaho.jpg" class="img-responsive img-rounded"
					style="width: 100%" alt="Image">
			</div>
		</div>
	</div>

</div>

<%@ include file="inc/footer.jsp"%>

