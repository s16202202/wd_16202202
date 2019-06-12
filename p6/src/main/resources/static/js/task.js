/**
 * 
 */
$(document).ready(function() {	
	$("#btn").click(function(){
		var m = $("#num").val();
		$.ajax({
	        url: "http://localhost:8080/task/"+ m
	    }).then(function(data) {
	    	$("#tit").text("主题"+data.id);
	    	$("#msg").text(data.description);
	    });
	});    
});