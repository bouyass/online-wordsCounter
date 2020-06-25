var checked = false;
var lang = "none";


function check() {
	if ($('input[name="filter"]:checked').length > 0) {
		checked = true;
		console.log(checked);
	} else {
		checked = false;
		console.log(checked);
	}
}


function langs() {
	if ($("#lang").val() !== "none") {
		lang = "choosed";
	} else {
		lang = "none";
	}
}


$(document).ready(function() {

	$("#area").on('change keyup paste', function() {
		$.ajax({
			type: "get",
			url : "http://localhost:8080/wordsCounter",
			data : {
				text : "lyes"
			}
		}).done(function(response) {
			$("#numberCa").val(response)
		});
	});

	
	$("#lang").change(function() {
		if (lang !== "none") {
			$("#area").prop("disabled", false)
		} else {
			console.log("please select a language")
			$("#area").prop("disabled", true)
		}
	});

});