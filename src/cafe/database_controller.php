<?php
require('../model/Database_model.php');

$con = new database_model;

class database_controller{
    public function setupDatabase(){
        global $con;
        // Create the database named "CSIT314_Test"
        $con -> createDatabase("CSIT314_Test");
        // Create the first profile (table) in the database
        $con -> createFirstProfile();
        // Create the first user in the database
        $con -> createFirstUser();
    }
    
}

?>