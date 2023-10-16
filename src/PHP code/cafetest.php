<?php
session_start();
$_SESSION = array();
session_destroy();
?>
</html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script src = "https://kit/fontawesome.com/a076d05399.js"></script>
<script>
        function togglePasswordVisibility() 
        {
            const passwordInput = document.getElementById('password-input');
            const showPasswordIcon = document.querySelector('.show-password-icon');

            if (passwordInput.type === 'password') {
                passwordInput.type = 'text';
                showPasswordIcon.classList.remove('fa-eye-slash');
                showPasswordIcon.classList.add('fa-eye');
            } else {
                passwordInput.type = 'password';
                showPasswordIcon.classList.remove('fa-eye');
                showPasswordIcon.classList.add('fa-eye-slash');
            }
        }
        function togglePW(){
            var password = document.querySelector('[name=password]');

            if(password.getAttribute('type')===='password'){
                password.setAttribute('type', 'text');
                document.getElementById('font').style.color='black';
            } else {
                password.setAttribute('type', 'password');
                document.getElementById('font').style.color='white';
            }
        }
    </script>
 <link rel = "stylesheet" href = "style.css">
 
<title>Agile Cafe</title>
<meta http-equiv="content-type" content="text/html; charset=iso-8859-1" />
<style>
    body {
        background-color: #d8ab7d;
        font-family: Verdana, sans-serif; margin:0;
    }
    .header_section {
        background-color: #290e00;
        min-height: 50px;
    }
    h3 {
        font-size: 30px;
        font-family: Verdana, sans-serif;
        color: white;
        padding-inline: 60px;
    }
    .footer_section {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        height: 20%;
        background-color: #290e00;
        color: white;
        text-align: center;
        font-size: 14px;
    }
    .form {
        position: right;
        width: 350px;
        height: 55%;
        margin: 0 auto;
        background-color: white;
        padding: 20px;
        margin-top: 20px;
        border-radius: 5px;
        box-shadow: 0px 2px 5px #666666;
    }
    .password-container {
        position: relative;
    }
    .show-password-icon {
        position: absolute;
        top: 50%;
        right: 10px;
        transform: translateY(-50%);
        cursor: pointer;
    }
    input[type = "text"], input[type = "password"] {
        width: 100%;
        padding: 10px;
        border-radius: 3px;
        border: 1px solid;
        margin-bottom: 20px;
    }
    .container {
        position: relative;
        width: 250px;
        margin: 150px auto;
    }
    input {
        box-sizing: border-box;
        width: 100%;
        font-size: 18px;
        border: none;
        outline: none;
        background-color: transparent;
        border-bottom: 1px solid white;
        padding: 10px;
        color: white;
    }
    ::placeholder {
        color: white;
        opacity: 0.7;
    }
    span {
        position: absolute;
        right: 15px;
        transform: translate(0, -50%);
        top: 50%;
        cursor: pointer;
    }
    .fa {
        font-size: 20px;
        color: white;
    }
</style>
</head>
<body>
    <div class = "header_section">
        <h3 style="padding-top: 5px;">AGILE CAFE<h3>
    </div>
    <div class = "footer_section">
        <br>&copy; 2023 AGILE CAFE <br>
        sdfdsf <br>
        sdfdsff <br>
        sfsd
    </div>
    <div class = "wrapper">
    <form action = "">

    <div class = "password-container">
        <span class = "input-group-text" id = "basic-addon1">Password</span>
        <input type = "password" placeholder = "Enter Password" id = "password-input" name = 'pass' required>
        <i class = "show-password-icon fa fa-eye-slash" aria-hidden = "true" onclick = "togglePasswordVisibility()"></i>
    </div>

    <div class = "container">
        <input type = "password" name = "password" placeholder = "Enter Password" required>
        <span>
            <i class = "fa fa-eye" id = "font" onclick = "togglePW()" aria-hidden = "true"></i>
        </span>
    </div>


</body>