<?php
$conn = new mysqli('localhost','root', '');

class database_model {
    public function createDatabase($dbName){
        global $conn;

        // SQL query to create the database
        $sql = "CREATE DATABASE IF NOT EXISTS $dbName";
        try {
            mysqli_query($conn, $sql); 
            //echo "Database created successfully"; 
        }
        catch(mysqli_sql_exception $e) {
            die("Error creating database: " . mysqli_error($conn)); }
    }

    //Function to create first profile
    public function createFirstProfile(){
        global $conn;
        $conn->select_db('CSIT314_Test');
        // SQL query to create the system_admin table
        $sql = "CREATE TABLE IF NOT EXISTS `system_admin` (
            `fname` varchar(255) NOT NULL,
            `lname` varchar(255) NOT NULL,
            `phone` INT NOT NULL DEFAULT 0,
            `email` VARCHAR(255) NOT NULL,
            `password` VARCHAR(255) NOT NULL,
            `dob` DATE NOT NULL,
            `status` VARCHAR(25) DEFAULT 'active',
            
            PRIMARY KEY(phone)
        );";
    

      if ($conn->query($sql) === TRUE) {
          //echo "Table customer created successfully";
          return true;
      } else {
          echo "Error creating table: " . $conn->error;
          return false;
      }
    }
    //Function to create first user
    public function createFirstUser(){
        global $conn;
        $conn->select_db('CSIT314_Test');
        $mysql_date = '2022-12-13';
        $email = 'abc@gmail.com';
        $phone = 12345678;

        try {
            // Check if the user already exists in the database
            $sql = "SELECT COUNT(*) FROM `system_admin` WHERE `phone` = '$phone'";
            $result = mysqli_query($conn, $sql);
            $count = mysqli_fetch_array($result)[0];

            if ($count == 0) {
                // User does not exist, insert new record
                $sql = "INSERT INTO `system_admin` (fname, lname, phone, email, `password`, dob)
                        VALUES ('user1', 'user1', $phone, '$email', 'asd', '$mysql_date')";
                mysqli_query($conn, $sql); 
                return true;
            } else {
                // User already exists, return false
                //echo '<script>alert("User already exists")</script>'; 
                return false;
            }
        } catch (mysqli_sql_exception $e) {
            die("Error creating user: " . mysqli_error($conn)); 
            echo '<script>alert("error creating user")</script>'; 
            return false;
        }

    }

   
}
?>
