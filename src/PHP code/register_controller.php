<?php
include_once ('user_model.php');

$model = new user_model;

//require ('../view/header.php');
class register_controller{
    //function to create a new account
    public function createAccount($profile,$fname,$lname,$phone,$email,$password,$dob){
        global $model;

        // Create a new user account using the user model
        if($model->createUser($profile,$fname,$lname,$phone,$email,$password,$dob)){
            return true;
        }

    }
}
?>