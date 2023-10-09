# Group-Project-CSCI314
Cafe Management System
User Guides:




// tutor notes

Class UserAccount
Name, DOB, Address, ID, Role, 

Class UserProfile
Name, Photo?

Class Bid (For cafe staff)
What is a bid class? it handles everything based on a bid, CRUDS (Data Base)
Only Entity class can talk to data base (no controller or boundary class)

Class UserInterface(Boundary class) can have different interfaces for each user type.

Class UserController(Controller class)

The bid must respond with the cafe staff
        Boundary class              Controller class             Entity class
        SubmitBid                   BidController                    Bid

CRUDS is important for all users.

Check with our tutor to make sure all designs are correct before programming.