# Group-Project-CSCI314
Cafe Management System
Innitially, this read me file should be a guide for users
Programming Language: Java
Package: ()

(user profile, user account), they are not the same, system admin only cares two of these
        Data Base
Create
Read
Update
Suspend (not Delete)
Search

Anyone can modify this user stories as this one is not finalized. 
(there might be any duplicates) (there are more user stories)
(As a <user>, I want to <do something>, so that <some reason> => format of user stories)
User Stories for admin :

As a system admin, I want to create user profiles for cafe owners, managers, and staff so that I can register in their behalf

As a system admin, I want to view user accounts so that I can check

As a system admin, I want to log in and log out so that I can access my account.

As a system admin, I want to suspend accounts so that I can ...

As a system admin, I want to search for accounts so that I can find them.

As a system admin, I want to securely login to the system with my credentials so that

As a system admin, I want to logout when I am done using the system so that

As a system admin, I want to reset my password if I forget it so that I can access my account again.


User Stories for cafe owner (7):

As a cafe owner, I want to view available work slots so that I can see staffing requirement

As a cafe owner, I want to add new work slots with required cafe roles so that I can ---

As a cafe owner, I want to log in and log out so that I can access my account.

User Stories for cafe staff:

As a cafe staff, I want to view open work slots so that I can bid for them.

As a cafe staff, I want to submit my bid form for work slots and wait for the bid to respond so that I can work based on my desired bid.
(maximum of 3 weeks for an example) (Morning, Night, Evening shift)
(role: cashier, service staff, bartender)

As a cafe staff, I want to specify my maximum availability so that I can let cafe manager know.

As a cafe staff, I want to see if my bid was accepted or rejected so that I can verify my bid.


User Stories for cafe manager:

As a cafe manager, I want to review all bids so that I can assign staff to slots.

As a cafe manager, I want to approve or reject staff bids for work slots so that 

As a cafe manager, I want to assign cafe roles like chef, cashier, waiter to approved bids so that

As a cafe manager, I want to view available staff and offer additional slots to fill requirements so that
(There is no interaction with the system so the function is invalid)
(user stories must be about the system interact with any user)

As a cafe manager, I want to ensure a balanced workload across all staff so that 


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