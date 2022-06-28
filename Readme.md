# IPL AUCTION SYSTEM
This project is about creating the database of IPL Auction System by using some data stuctures.


## Project Description
IPL Auction System is a one of the  platform which  holds auction for cricket
players. BCCI is the organisation which will conduct the IPL auction every year.  Admin is the person who will host the  complete program by  releasing  the players and makes them available for sale.  IPL auctions are conducted offline in a conference and every team manager bids for the player. The players will be sold to the team of highest bidder.



Players register themselves for the auction along with a certain base price. Whereas team managers get their credentials from the admin. The terms and conditions which was displayed by the cricket board should be  followed by team managers during the entire
auction system. Our System will automatically sell the player to the highest bidder during the auction. And it will also conduct an Auction once again for any player
remaining unsold. 
 



## Functional Requirements of the System:

```bash
● There should be two panels dedicated to Admin and Team Manager.
● Each team manager should login with the given credentials before
working on the system.
● Admin will have the options to manage profiles of different types of
team managers and players registered.
● Users should be able to securely login and logout after performing
the task.
```

## Features of the project

```python
● Admin Login: Admin can login into the system and display
players one by one to start the auction.

● Team Manager Login: Team manager can login, search and
start bidding for the players.

● Each Team Manager has a 90cr. maximum limit for the entire
auction program. Where the amount spent on players will be
detected.

● Team managers get 30 seconds to bid for a player. The player
will be held unsold if no team manager bids within 1 minute.

● Players remaining unsold will be pushed into Unsold Stack.

● Stack is used to push the players purchased and tree data
structure is used to connect all the 11 players according to
their categories.
```

## Working of the project
● The unsold Players will be moved to Queue. So, it can be
presented again later for the auction.
● Players who are purchased by Team Managers will be added
to their respective Team Stack.


## License
[IPL](https://github.com/Singhsansar/IPL-Auction-System)
