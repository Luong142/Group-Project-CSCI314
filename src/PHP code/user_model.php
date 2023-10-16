<?php
$conn = new mysqli('localhost','root', '');

class user_model {
    private $phone;
    private $password;
    private $email;
    private $fname;
    private $lname;
    private $dob;

    //Function to create user
    public function createUser($profile,$fname,$lname,$phone,$email,$password,$dob){
        global $conn;
        $conn -> select_db("CSIT314_Test");
        // Convert date of birth to MySQL format
        $mysql_date = date('Y-m-d', strtotime($dob));
        // Prepare SQL query to insert user data into the `$profile` table
        $sql = "INSERT INTO `$profile` (fname, lname, phone, email,`password`, dob)

        VALUES ('$fname','$lname','$phone','$email','$password','$mysql_date');";
        try {
            // Execute the SQL query
            if(mysqli_query($conn, $sql)==false){
                echo '<script>alert("Phone number already exists in the database")</script>';
                return false;
            } else{
                mysqli_query($conn, $sql);
            }
            // $this->setProfile($fname,$lname,$phone,$email,$mysql_date,$password);
            return true; }
        catch(mysqli_sql_exception $e) {
            $error_message = mysqli_error($conn);
            if (strpos($error_message, "Duplicate entry") !== false) {
                echo '<script>alert("Phone number already exists in the database")</script>';
            } else {
                echo '<script>alert("Error creating user: ' . $error_message . '")</script>';
            }
        return false;}
    }
    //Function to set account
    public function setAccount($user){
        $this->phone = $user;
    }
    //Function to retrieve account
    public function getAccount($profile,$phone){
        global $conn;
        $arr = array();

        // Select the database
        $conn -> select_db('CSIT314_Test');

        // Prepare SQL query to retrieve account data based on phone number
        $sql = "SELECT * FROM `$profile` WHERE phone = '$phone';";

        // Execute the SQL query
        $result = $conn->query($sql);

        // check if the query was successful
        if (!$result) {
        echo "Error: " . $conn->error;
        exit();
        }

        // fetch the result row as an associative array
        
        // $date = $row['dob'];
        // $dob = date("d/m/Y", strtotime($date));
        while ($row = mysqli_fetch_assoc($result) ) {
            $arr = $row;
        }
        return $arr;
        // assign the value to a variable
        
       
    }
    //function to update user profile
    public function updateUser($profile,$fname,$lname,$phone,$email,$password,$dob,$status,$oldPhone){
        global $conn;
        $conn -> select_db("CSIT314_Test");
        // Convert date of birth to MySQL format
        $mysql_date = date('Y-m-d', strtotime($dob));

        // Prepare SQL query to update user data in the `$profile` table
        $sql =" UPDATE `$profile` SET `fname`='$fname',`lname`='$lname',`email`='$email',`dob`='$mysql_date', `password` = '$password' ,`phone`='$phone' ,`status`='$status' WHERE phone = '$oldPhone';";

        try {
            // Execute the SQL query
            mysqli_query($conn, $sql); 
            //echo '<script>alert("good to go")</script>'; 
            return true; 
        }
        catch(mysqli_sql_exception $e) {
            // An error occurred while updating the user
            die("Error creating user: " . mysqli_error($conn)); 
            echo '<script>alert("error creating user")</script>'; 
        return false;}
    }
    //function to see all registered account
    public function getAllAccount($profile){
        global $conn;
        $conn -> select_db("CSIT314_Test");
        // Create an empty array to store the account data
        $array=[];
        // Prepare SQL query to retrieve all account data from the `$profile` table
        $sql = "SELECT * FROM `$profile`;"; 

        // Execute the SQL query
        $result = $conn->query($sql);

        // Iterate through the result set and store each row in the array
        while ($row = mysqli_fetch_assoc($result)) {
            $array[] =  $row;
        }
        
        // Return the array of account data
        return $array;
    }
}
// $con = new user;

// $con -> echoUser();
// print_r($arr);
// $con->checkUser(87945631,'qwe');
// print($con->getAccount());
// $con->createTable();
?>