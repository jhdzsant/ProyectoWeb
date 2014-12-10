<?php
include('../includes/config.php');



session_start();



$a= $_SESSION['id'];



$query="select idusuario, usuariopc, prioridad, tservicio, descripcion, fecha, estado from tickets where idusuario=$a order by estado desc";
$result = $mysqli->query($query) or die($mysqli->error.__LINE__);

$arr = array();
if($result->num_rows > 0) {
	while($row = $result->fetch_assoc()) {
		$arr[] = $row;	
	}
}
# JSON-encode the response
$json_response = json_encode($arr);

// # Return the response
echo $json_response;
?>
