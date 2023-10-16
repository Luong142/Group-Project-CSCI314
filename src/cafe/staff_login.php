<?php
session_start();
$_SESSION = array();
session_destroy();
?>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns = "http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript"> 
    function togglePasswordVisibility(id) {
        var input = document.getElementById(id);
        var icon = event.target;

        if (input.type === "password") {
            input.type = "text";
            icon.classList.remove("fa-eye");
            icon.classList.add("fa-eye-slash");
        } else {
            input.type = "password";
            icon.classList.remove("fa-eye-slash");
            icon.classList.add("fa-eye");
        }
    }
</script>

<title>Agile Cafe</title>
<meta http-equiv = "content-type" content = "text/html; charset=iso-8859-1" />
<style>
    body {
        background-image: url('background.jpg');
        background-repeat: no-repeat;
        background-attachment: fixed;  
        background-size: 765px;
        background-position: 0px 35px; 
    }
    .header_section {
        min-height: 50px;
    }
    .logo {
        margin-top: 10px;
        max-width: 250px;
    }
    .topnav a {
        float: right;
        color: #316658;
        margin-top: -45px;
        text-align: center;
        padding: 14px 13px;
        text-decoration: none;
        font-family: Helvetica, Sans, Serif;
        font-size: 17px;
    }
    .topnav a:hover {
        color: black;
    }
    .topnav a.active {
        color: black;
    }
    input[type="username"],
    input[type="password"],
    textarea,
    select {
        margin-bottom: 10px;
        padding: 8px;
        border-radius: 3px;
        width: 90%
    } /*position option value*/
    .footer_section {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        height: 13%;
        background-color: #290e00;
        color: white;
        text-align: center;
        font-size: 12px;
    }
    .form {
        position: fixed;
        width: 350px;
        height: 57%;
        right: 30px;
        top: 60px;
        text-align: center; 
        font-family: Helvetica, Sans, Serif;
        font-size: 16px;
        background-color: white;
        padding: 20px;
        margin-top: 20px;
        border-radius: 5px;
        box-shadow: 0px 2px 5px #666666;
    }
    .btn-primary {
        background-color: #316658; 
        border: 2px solid white;
        width: 320px;
        margin-top: 25px;
        color: white;
        padding: 10px ;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        border-radius: 8px;
        cursor: pointer;
    }/*log in button*/
    .btn-primary:hover {
        background-color: #113946;
        border: 2px solid white;
        color: white;
        border-radius: 8px;
    }/*login button point cursor*/
    .form-control {
        width: 90%;
        font-size: 15px;
        padding: 8px;
        border: 1px solid black; 
        border-radius: 3px; 
    }/*username box style*/
    .password-input {
        position: relative;   
        width: 90%;
        height: 50px;
        left: 16px;
    }
    .password-input input[type="password"],
    .password-input input[type="text"] {
        width: 100%;
        border: 1px solid black; 
        border-radius: 3px; 
        padding: 8px;
        margin-bottom: 20px;
        font-size: 16px;
    }/*password box style*/
    .password-toggle {
        position: absolute;
        right: 15px;
        top: 10px;
        cursor: pointer;
    }/*password eye visibility style*/
    .register-link {
        font-size: 12px;
        text-align: center;
        margin-top: 10px;
    }
    .register-link p a {
        color: #000080;
        font-size: 12px;
        font-family: "Helvetica", Sans, Serif;
        text-decoration: none;
        font-weight: 600;
    }
    .register-link p a:hover {
        text-decoration: underline;
    }
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>

<body>
    <div class = "header_section">
        <img src = "Logo.png" alt = "Logo" class = "logo">
    </div>
    <div class = "footer_section">
        <br><br>&copy; 2023 AGILE CAFE <br> 
    </div>

    <div class = "topnav">
        <a class = "active" href = "manager_login.php"><b>Cafe Manager</b></p></a>
        <a href = "staff_login.php"><b>Cafe Staff</b></a>
        <a href = "owner_login.php"><b>Cafe Owner</b></a>
        <a href = "admin_login.php"><b>System Admin</b></a>
    </div>

    <div class = "form">
        <form method = 'post'><br>
            <label for = "username"><b>Username:</b></lable>
            <div class = "username-input" >
                <span class = "input-group-text" id = "username-label"></span>
                <input class = "form-control" type = "text" name = "name" id = "name" placeholder = "Enter Username" required><br>
            <br>

            <label for = "password"><br><b>Password:</b></label>
            <div class = "password-input">
                <input type = "password" id = "password" name = "password" placeholder = "Enter Password" required>
                <span class = "password-toggle" onclick = "togglePasswordVisibility('password')"><i class = "fas fa-eye"></i></span>
            </div>
            <br>

            <button class = "btn-primary"> Log in </button><br>
            <div class = "register-link">
            <p style = "font-family: Helvetica, Sans, Serif;">Don't have account? <a href = "register.php">Register Here</a></p>
        </form>
    </div>

</body>