<?php
    $con = mysqli_connect("localhost", "root", "", "spacemindz");
    
    $username = $_POST["username"];
    $password = $_POST["password"];
    
    $statement = mysqli_prepare($con, "SELECT * FROM user WHERE username = '.$username.' AND password = '.$password.'");
    mysqli_stmt_bind_param($statement, "ss", $username, $password);
    mysqli_stmt_execute($statement);
    
    mysqli_stmt_store_result($statement);
    mysqli_stmt_bind_result($statement, $dbIdNumber,$dbUsername, $dbemail, $dbCell, $dbHeight, $dbWeight,$dbPassword);
    
    $response = array();
    $response["success"] = false;  
    
    while(mysqli_stmt_fetch($statement)){
		if (password_verify($password, $dbPassword)) {
        $response["success"] = true;  
        $response["email"] = $dbemail;
        $response["idNumber"] = $dbIdNumber;
        $response["username"] = $dbUsername;
		}
    }
    
    echo json_encode($response);
?>
