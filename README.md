# Movie Theater Ticketing System

## Source Code Structure

Web Pages: To order the movie tickets, users will go through each of these web pages following the other below:
1.	jsf/homepage.xhtml: list all the movies that are available to watch and book tickets. Press “Gets Tickets” at the bottom of the page to begin ordering movie tickets.
2.	jsf/theaters.xhtml: list all the theaters grouped by their zip codes. Press a zip code and press select for a theater you want to visit.
3.	jsf/movies.xhtml: list all the movies that are available for that selected theater. Press “Select” under the movie information card you want to book tickets.
4.	jsf/datetime.xhtml: list the date and time that are available for the chosen movie and theater. Press on the date, then “select” the time you want to watch the movie.
5.	jsf/seats.xhtml: display the theater seating chart. Press on the seat number you want to book the tickets. A text box at the bottom of the page will be appeared to show your selections. When you finish booking your seats, press “submit” to continue. You can press “reset” to clear all your seat selections and start over selecting your seats,
6.	jsf/checkout.xhtml: display a summary of your ticket order. Type your name on your credit card (required), card number (required 16 digits), choose the month, and type the year (required 4 digits) expiration of your payment card. Press “submit” to finish your order
7.	jsf/done.xhtml: display a summary of your ticket order and say thank you to the customer.

Source Package:
JSF CDI beans:
-	bean/HomePageBean.java: CDI bean for homepage.xhtml
-	bean/TheatersBean.java: CDI bean for theaters.xhtml. It was set as session scoped for ajax call
-	bean/MoviesBean.java: CDI bean for movie.xhtml. It was set as session scoped for ajax call
-	bean/DateTimeBean.java: CDI bean for datetime.xhtml. It was set as session scoped for ajax call.
-	bean/SeatBean.java: CDI bean for seats.xhtml. It was set as session scoped for ajax call.
-	bean/CheckOutBean.java: CDI bean for checkout.xhtml. No ajax call needed; therefore, its scope was request.
-	bean/DoneBean.java: CDI bean for done.xhtml. This CDI bean will call a function to destroy all session scoped bean.
-	bean/TicketBean.java: This is the managed session bean. It was used to store the user selection data from the theater selection to check out.
-	bean/_dummy_bean_.java: This is my utility CDI bean which provided some useful functionalities to create webpage layouts.

EJB Session beans:
-	ejb/TheatersEJB.java: this is EJB stateless session bean to manage the “Theaters” database entity.
-	ejb/MoviesEJB.java: this is EJB stateless session bean to manage the “Movies” database entity
-	ejb/DateSlotsEJB.java: this EJB stateless session bean to manage the “DateSlots” database entity
-	ejb/TimeSlotsEJB.java: this EJB stateless session bean to manage the “TimeSlots” database entity
-	ejb/ShowsEJB.java: this EJB stateless session bean to manage the “Shows” database entity
-	ejb/OrdersEJB.java: this EJB stateless session bean to manage the “Orders” database entity. This is the only EJB bean that was used to write the new data, customer ticket orders, to the database.

JPA entity classes:
-	entity/Theaters.java: JPA entity class for “Theaters” table in MovieDB. The table contains information for 10 given theaters.
-	entity/Movies.java: JPA entity class for “Movies” table in MovieDB. The table contains information for 5 given movies
-	entity/DateSlots.java: JPA entity class for “DateSlots” table in MovieDB. The table contains information for available dates. It has all the dates information for August 2022.
-	entity/TimeSlots.java: JPA entity class for “TimeSlots” table in MovieDB. The table contains information for available time slots from 8:30 AM to 9:00 PM
-	entity/Shows.java: JPA entity class for “Shows” table in MovieDB. The table contains information for available movie shows, different dates and time for each theater
-	entity/Orders.java: JPA entity class for “Orders” table in MovieDB. Store customer ticket order data for future development.

Supplemental Java class:
entity/Ticket.java:: This is a basic Java class used by Ticket CDI bean to store the user’s selection data.

Not used environment configuration files:
-	env/Env.java: (not used) java supporting class to create a JDBC connection.
-	env/jdbc_conn.xml: (not used) a xml file that store the JDBC connection information.

## Screeshot

![Home Page](/Screens/1_HomePage.png)

![Theater Selection](/Screens/2_TheaterSelection.png)

![DateTime Selection](/Screens/3_DateTimeSelection.png)

![Movie Selection](/Screens/3_MovieSelection.png)

![Seat Selection](/Screens/4_SeatSelection.png)

![Checkout](/Screens/5_CheckOut.png)

![Order Complete](/Screens/6_OrderComplete.png)
