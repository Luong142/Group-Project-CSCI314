<?php
require ('inc_header.html');
session_start();
$_SESSION['profile'] = 'staff';
?>

<html>
<head>
<title>Register Account</title>
<style>
    .formContainer {
        margin-top: 7px;
        position: fixed;
        width: 430px;
        height: 66%;
        right: 346px;
        top: 60px;
        overflow: auto;
        background-color: white;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 2px 5px #666666;
    }
    form {
        margin: 0 auto;
        max-width: 400px;
        font-family: Arial;
    }
    label {
        display: block;
        margin-top: 10px;
        margin-bottom: 5px;
        font-weight: bold;
    }
    h2 {
        text-align: center;
        margin-top: -9px;
        margin-right: auto;
        margin-left: auto;
        font-family: Verdana, sans-serif;
        background-color: #316658;
        color: white;
        padding: 20px;
        width: 430px;
    }
    input[type="text"],
    input[type="tel"],
    input[type="date"],
    input[type="description"],
    input[type="password"],
    textarea,
    select {
        width: 100%;
        padding: 10px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        margin-bottom: 20px;
        font-size: 16px;
    }
    input[type = "submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #45a049;
    }
    input[type="submit"]:active {
        background-color: #3e8e41;
    }
    input[type="submit"]:focus {
        outline: none;
    }
    .password-input {
        position: relative;
        display: inline-block;
        width: 100%;
    }
    .password-input input[type="password"],
    .password-input input[type="text"] {
        width: 100%;
        padding: 10px;
        box-sizing: border-box;
        margin-bottom: 20px;
        font-size: 16px;
    }
    .password-toggle {
        position: absolute;
        right: 20px;
        top: 10px;
        cursor: pointer;
    }
    .btn-primary {
        background-color: #316658; 
        border: 1px black;
        width: 400px;
        margin-top: 25px;
        color: white;
        padding: 10px ;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        border-radius: 8px;
        cursor: pointer;
    }
    .btn-primary:hover {
        background-color: #113946;
        color: white;
        border: 1px black;
        border-radius: 8px;
    }
</style>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body>
    <h2>Register Form</h2>
    <div class = "formContainer" style = "text-align: left;">
    <form method = "post">
        <label for = "fname">First Name:</label>
        <input type = "text" id = "fname" name = "fname" placeholder = "Enter First Name" required><br>

        <label for = "lname">Last Name:</label>
        <input type = "text" id = "lname" name = "lname" placeholder = "Enter Last Name" required><br>

        <label for = "phone">Phone:</label>
        <input type = "tel" id = "phone" name = "phone" placeholder = "Enter Phone Number" required><br>

        <label for = "dob">Date of Birth:</label>
        <input type = "date" id = "dob" name = "dob" required><br>

        <label for = "address">Address:</label>
        <input type = "description" id = "address" name = "address" placeholder = "Enter Address" required><br>

        <lable for = "username"><b>Username: </b></lable>
        <input type = "text" id = "usrName" name = "usrName" placeholder = "Enter Username" required><br>

        <label for = "password">Password:</label>
        <div class = "password-input">
            <input type = "password" id = "password" name = "password" placeholder = "Enter Password" required>
            <span class = "password-toggle" onclick = "togglePasswordVisibility('password')"><i class = "fas fa-eye"></i></span><br>
        </div>

        <label for = "confirm-password">Confirm Password:</label>
        <div class = "password-input">
            <input type = "password" id = "confirm-password" name = "confirm-password" placeholder = "Confirm Password" required>
            <span class = "password-toggle" onclick = "togglePasswordVisibility('confirm-password')"><i class = "fas fa-eye"></i></span><br>
            <span id = "password-error" style = "color: red;"></span>
        </div>

        <label for = "position"><b>Position</b></label><br>
        <select id = "position" name = "position">
            <option value = "select">Select a Position</option>
            <option value = "adminpage.php">System Administrator</option>
            <option value = "owner">Cafe Owner</option>
            <option value = "staff">Cafe Staff</option>
            <option value = "manager">Cafe Manager</option>
        </select>
                
        <button class = "btn-primary" type = "submit" name = 'submit' value = "submit">Submit</button>
        <button class = "btn-primary" onclick = "window.history.back();">Back</button>
    </form>
    </div>

    <?php
        //require ('register_controller.php');
    ?>
    <script>
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
            
        document.querySelector("form").addEventListener("submit", function(event) {
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirm-password").value;
            var passwordError = document.getElementById("password-error");

            if (password != confirmPassword) {
                passwordError.textContent = "Passwords do not match.";
                event.preventDefault();
            } else {
                passwordError.textContent = "";
            }
        });

    </script>
    
    <?php
        if (isset($_POST['submit'])){
            $profile = 'staff';
            $fname = $_POST['fname'];
            $lname = $_POST['lname'];
            $phone = $_POST['phone'];
            $dob = $_POST['dob'];
            $address = $_POST['address'];
            $usrName = $_POST['usrName'];
            $password = $_POST['password'];
            $controller = new register_controller;
            
            if ($controller -> createAccount($profile,$fname,$lname,$phone,$dob,$address,$usrName,$password)){
                echo '<script>alert("Sign up succesful")</script>'; 
                echo" <script>window.location='homepage.php';</script>";
            }
        }
    ?>
</body>
</html>