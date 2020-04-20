$(document).ready(function() {
	console.log("load jquery");
	$("#btn").click(function() {
		var lon = $("#longitude").val();
		var lat = $("#latitude").val();
		$.ajax({
			url:"https://api.openweathermap.org/data/2.5/find?lat=" + lat +  "&lon=" + lon + "&cnt=10&appid=9f15903845909b9ac4f41280cc55dacf"
		}).then(function(data) {
			//console.log(data.name);
			var divTag = $("#content");
			$.each(data.list, function(idx) {
				var temp = data.list[idx].name;
				console.log(data.list[idx].name);
				divTag.append("<li>" + temp);
			})
		})
	})
})
