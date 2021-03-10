# Nautilus
A utility that allows users to get a rundown of their day in a single app. Start your morning off the right way with Nautilus.

## Project Credits
Contributor | GitHub Link | Journal Links
----------- | ----------- | -------------
Gautam Gupta | [@batman084](https://github.com/batman084) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1tCDVj-Cb-zR5BkXZF6V9x2aPzR__5qMSUu2iNDu2oko/edit?usp=sharing)
Tanay Shah | [@Altoid0](https://github.com/Altoid0) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1g60S7gscwpYl4oalQHzpsQa1RahPRVd42iXyDRPMrnE/edit?usp=sharing)
Dhruv Kanetkar | [@DhruvK0](https://github.com/DhruvK0) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1tCDVj-Cb-zR5BkXZF6V9x2aPzR__5qMSUu2iNDu2oko/edit?usp=sharing)
Dhruv Sengupta | [@DaHippoBear](https://github.com/DaHippoBear) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1g60S7gscwpYl4oalQHzpsQa1RahPRVd42iXyDRPMrnE/edit?usp=sharing)

## Technicals Involved
* Gradle
  * Tanay - [Multiproject Builds](https://github.com/Altoid0/Nautilus/blob/master/settings.gradle) | [resources used](https://docs.gradle.org/current/samples/sample_building_java_applications_multi_project.html)
  * Tanay - [Per Project Dependencies](https://github.com/Altoid0/Nautilus/blob/master/menu/build.gradle) | [resources used](https://spring.io/guides/gs/gradle/)
  * Tanay - Object Definition Inspired by CB - [Google Calendar API with Custom Object Creation](https://github.com/Altoid0/Nautilus/blob/master/calendar/src/main/Java/com/calendar/CalendarRequest.java) | [resources used](https://developers.google.com/calendar/quickstart/java)
  * Dhruv S - [Weather API](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/java/com/nautilus/ApiCall.java) | [resources used](https://openweathermap.org/current)
  * Dhruv S - [Stocks API](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/java/com/nautilus/StockEval.java) | [resources used](https://polygon.io/)
  * Dhruv K/Gautam - [News API](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/java/com/nautilus/NewsCall.java) | [resources used](https://newsapi.org/)
* SpringBoot
  * Dhruv K - Inspired by Techtalk - [Page Routing](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/java/com/nautilus/NautilusApplicationController.java#L20) | [resources used](https://github.com/nighthawkcoders/spring-idea/blob/master/src/main/java/com/example/lessons/controllers/_MainController.java)
  * Dhruv K - Inspired by Techtalk - [User Input to Backend](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/java/com/nautilus/NautilusApplicationController.java#L21) | [resources used](https://github.com/nighthawkcoders/spring-idea/blob/master/src/main/java/com/example/lessons/controllers/_MainController.java)
  * Gautam - [All HTML and CSS Frontend](https://github.com/Altoid0/Nautilus/tree/master/menu/src/main/resources) | [resources used](https://www.w3schools.com/)
* Thymeleaf
  * Tanay/Gautam - Backend Object Definition Inspired by CB - [Iterative Loop Displays](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/resources/templates/calendar.html#L34) | [resources used](https://stackoverflow.com/questions/43266112/how-to-display-the-collection-of-objects-with-for-each-loop-in-thymeleaf/43267021)
  * Dhruv K/Gautam - [Indexed Array Displays]() | [resources used](https://www.baeldung.com/thymeleaf-iteration)
  * Dhruv K - [Null Pointer Error Handling]() | [resources used](https://attacomsian.com/blog/thymeleaf-handling-null-values)
  * Dhruv S - [Javascript Integration for graphing](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/resources/templates/stock.html) | [resources used](https://visjs.github.io/vis-timeline/docs/graph2d/)

## Project Site
Our project is live and operational at this link: [Nautilus](http://76.176.51.196/)

## Scrum Board
We are monitoring and updating tasks that we have to do, are doing, and are done with in the [Scrum Board in GitHub](https://github.com/Altoid0/Nautilus/projects/1)  
**Note: Link to code is in the comments for each card. Click on `Go to issue for full details` and scroll down to see the comments for each card**  

# Wk 10 README Updates - Focus on Front End:
- This weeks focus was on the front end aspect of our project  
- We already created an excellent front end with a clear color pallete  
- This week, we focused on updating our weather.html file to match our style guide of our index.html page
- Our future goals for this page are to fix up the CSS and add more color to the page. We also want to add a more appealing color system and animations to the page

Before weather.html: ![](https://github.com/Altoid0/Nautilus/blob/master/assets/Weather_OldPage.png)

After weather.html: ![](https://github.com/Altoid0/Nautilus/blob/master/assets/Weather_HomePage.png)

Index.html page: ![](https://github.com/Altoid0/Nautilus/blob/master/assets/Index_HomePage.png)

# Project Plan
Here is our detailed project plan for our project: [P1 JoeCode Project Plan](https://docs.google.com/document/d/1m7wAU9ol465JiQeQv9NltoqsjlFo8B8UNO8IeDBx2rU/edit?usp=sharing)  

# Project Features
Feature | Description
------- | ---------------------------------------
Weather Trends | - Tells temperature  <br>- Tells weather type (rainy, sunny, etc)<br>  - Chance of precipitation<br>  - Forecast for next couple days (might not add)<br>  
ToDo List | - Tells the users what they have to do for the day<br>  - Overall menu of everything they have to do based on their calendar and canvas  
Calendar Integration | - Users can link their Google Calendar so that they can view their events for the day in the ToDo list  
News Briefing | - Users would get links to top trending articles in the morning to prepare the user for the day and to let them know of any important events happening in the world  
Canvas Integration | - Users can link their Canvas so that they can see what assignments they have to do today and what is due today for them in their classes  
Traffic in your area | - Users would get an ETA from their home to their main destination in the morning and an idea of how much traffic there is on their route to school  
Stock Trends | - Users will get an overview of the stock trends for the day and what are the most trending stocks for the day  
