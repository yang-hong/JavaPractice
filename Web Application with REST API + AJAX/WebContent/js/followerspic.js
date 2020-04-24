$(document).ready(function() {
	$.ajax( {
		url:"https://api.github.com/users/mojombo/followers"
	}).then(function(data){
		console.log(data);
		var table = $("#usersTable");
		var contents = "";
		$.each(data, function(idx){
			contents += "<tr>";
			contents += "<td>" + data[idx].id + "</td>";
			contents += "<td><img src='" + data[idx].avatar_url + "' width=50 height=50 /></td>";
			contents += "</tr>";
		})
		table.append(contents);
	});
});