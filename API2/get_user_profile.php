<?php

include('dbconnect.php'); 

$v1=$_REQUEST['f1'];

 
$output=array();

 
$result=mysqli_query($conn,"SELECT * FROM TABLE_SIGNUP where mno='$v1'");

$cnt=0;

while($r=mysqli_fetch_array($result))
{
    $cnt=1;
    $output[]=array("firstname"=>$r["firstname"],"lastname"=>$r["lastname"],"mno"=>$r["mno"],"email"=>$r["email"],"city"=>$r["city"],"address"=>$r["address"],"password"=>$r["password"]);  
  
      
    
    
}

  
$flag["code"]="0";

if($cnt>0)
{
    $flag["code"]="1";
    
    print(json_encode($output));
}
else
{   
    printf(json_encode("Error"));

} 

 

?>