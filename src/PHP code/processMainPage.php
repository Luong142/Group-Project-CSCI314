<?php session_start() ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Agile Cafe</title>
<meta http-equiv = "content-type" content = "text/html; charset=iso-8859-1" />
</head>
<body>
<?php include ("inc_header.html"); ?>
<?php function redisplayForm($nickName, $topic) { 
		?>
		<form name = "mainForm" action = "processMainPage.php" method = "POST">
			<p>Name :  <input type = "text" name = "usrName" value = "<?php echo $nickName; ?>" /></p>
			<p>Topics:
				<select name = "top">
					<option value = "history">Singapore History</option>
					<option value = "geography">Singapore Geography</option>
				</select>
			</p>
			<input type = "submit" name = "Submit" value = "Start Quiz" style = "font-size: 15px;"/>
		</form>
		<?php
    }

    function displayRequired($fieldName) {
        echo "The field \"$fieldName\" is required.<br />\n";
    }

    function validate($data, $fieldName) {
        global $errorCount;
        if (strlen($data) == 0) {
            displayRequired($fieldName);
            ++$errorCount;
            $retval = "";
        } else { 
            $retval = trim($data);
            $retval = stripslashes($retval);
        }
        return($retval);
    }

    $errorCount = 0;
    
	$nickName = validate($_POST["usrName"], "Username");
	$topic = $_POST["top"];
    
    if (isset($_POST["Submit"])) {
	    
	if ($errorCount>0) {
		redisplayForm($nickName, $topic);
	}
	else {
		$_SESSION["usrName"] = $nickName;
		$_SESSION["overall"] = 0;

		switch($topic) {
			case 'geography':
				echo '<script>window.location="Geography.php"</script>';
				break;
			case 'history':
			default:
				echo '<script>window.location="History.php"</script>';
		}
	}

	
    }
?>
</body>
</html>