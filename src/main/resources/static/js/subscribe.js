
function validatePhoneNum(){
	
	var contactNumber =$("#contactNumber").val();
	var submitBtn = $("#submitBtn");
	if(contactNumber.length == 10 ){
		//Validation passes
		$("#errorMob").hide();
		submitBtn.prop('disabled', false);
	}else{
		//ValidATION FAILS 
		$("#errorMob").show();
		submitBtn.prop('disabled', true);
	}
}
function subscribeMobileNum(){
	var subScribURL="https://mbrdaarserver.mybluemix.net/api/V1/mbar/subscribe?phone="
	var contactNumber =$("#contactNumber").val();
	subScribURL = subScribURL + contactNumber;
	 $.post(subScribURL,
    {
    },
    function(data,status){
    	if(status == "success"){
    		$("#firstpage").hide();
    		$("#thankYouDiv").show();
    	}
    	
    });
}


 