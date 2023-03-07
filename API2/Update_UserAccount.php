<?php

include('dbconnect.php');
 
$v1=$_REQUEST['f1'];
$v2=$_REQUEST['f2'];
$v3=$_REQUEST['f3'];
$v4=$_REQUEST['f4'];
$v5=$_REQUEST['f5'];
$v6=$_REQUEST['f6'];
$v7=$_REQUEST['f7'];




$response = array();
 
$sql=mysqli_query($conn,"UPDATE TABLE_SIGNUP SET firstname='$v1',lastname='$v2',email='$v4',city='$v5',address='$v6',password='$v7' WHERE mno='$v3' ");


 
if ( $sql == TRUE)
{
    $response["success"] = 1;
    $response["message"] = "  successfully.";
    echo json_encode($response);
    
}
else
{
    $response["success"] = 0;
    $response["message"] = "  failed.";
    echo json_encode($response);
}

?>

