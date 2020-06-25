<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online word counter</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
</head>
<body>
	<nav class="navbar navbar-light bg-light">
		<a class="navbar-brand" href="#">SMART WORDS COUNTER</a> <img
			src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcShf8IMlYMg5-j79cHNfUNJuENReI1S5F-1Ow&usqp=CAU"
			width="30" height="30" alt=""> </a>
	</nav>

	<div class="custom-control custom-checkbox">
		<input onClick="check()" name="filter" type="checkbox" class="custom-control-input" id="customCheck1">
		<label class="custom-control-label" for="customCheck1">Filter
			preposition words</label>
	</div>

	

		<select onChange="langs()" id="lang" name="language" class="custom-select custom-select-sm">
			<option name="none" value="none" selected>Choose your language</option>
			<option name="french" value="french">French</option>
			<option name="english" value="english">English</option>
		</select>

		<div class="text">
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Your text here </label>
				<textarea disabled class="form-control" id="area"
					rows="3"></textarea>
			</div>
		</div>
		
		<div class="form-group row">
		<label for="inputPassword" class="col-sm-2 col-form-label">Number of words</label>
		<div class="col-sm-10">
			<input disabled type="number" class="form-control" id="numberCa"
				placeholder="number of words">
		</div>
		</div>
		 

</body>
	<script type="text/javascript" src="javascript/index.js"></script>
</html>