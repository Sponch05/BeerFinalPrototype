<?php
    $con = mysqli_connect(localhost", "root", "", "spacemindz");
    
	$idNumber = $_POST["idNumber"];
    $name = $_POST["name"];
	$surname = $_POST["surname"];
	$gender = $_POST["gender"];
    $username = $_POST["username"];
    $email = $_POST["email"];
	$cell = $_POST["cell"];
	$height = $_POST["height"];
	$weight = $_POST["weight"];
    $password = $_POST["password"];

    $statement = mysqli_prepare($con, "INSERT INTO customer (id_number, fname, lname, gender)
	VALUES ($idNumber, $name, $surname, $gender)");
	mysqli_stmt_bind_param($statement, "isss", $idNumber, $name, $surname, $gender);
    mysqli_stmt_execute($statement);
	$statement2 = mysqli_prepare($con, "INSERT INTO user (id_number, username, email_address, cell_number, height, weight)
	VALUES ($idNumber, $username, $email, $cell, $height, $weight, $password)");
	mysqli_stmt_bind_param($statement2, "isss", $idNumber, $name, $surname, $gender);
    mysqli_stmt_execute($statement2);
	
    
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>
