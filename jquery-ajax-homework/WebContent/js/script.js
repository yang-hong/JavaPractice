$(document).ready(function() {
	console.log("load jquery");
	$("#ok").click(function() {
		var zip = $("#zipcode").val();
		$.ajax({
			url:"https://api.openweathermap.org/data/2.5/weather?zip=" + zip + ",us&appid=9f15903845909b9ac4f41280cc55dacf"
		}).then(function(data) {
			console.log(data);
			var divTag = $("#content");
			divTag.append("City Name: ");
			divTag.append(data.name);
			divTag.append(" ");
			divTag.append("Temperature: ");
			divTag.append(data.main.temp);
		})
	})
})