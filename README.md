# Morning Briefing  
A utility that allows users to get a rundown of their day in a single app. Information that users get will help them start off their day and give them a morning briefing

## Project Credits
Contributor | GitHub Link | Journal Links
----------- | ----------- | -------------
Gautam Gupta | [@batman084](https://github.com/batman084) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1tCDVj-Cb-zR5BkXZF6V9x2aPzR__5qMSUu2iNDu2oko/edit?usp=sharing)
Tanay Shah | [@Altoid0](https://github.com/Altoid0) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1g60S7gscwpYl4oalQHzpsQa1RahPRVd42iXyDRPMrnE/edit?usp=sharing)
Dhruv Kanetkar | [@DhruvK0](https://github.com/DhruvK0) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1tCDVj-Cb-zR5BkXZF6V9x2aPzR__5qMSUu2iNDu2oko/edit?usp=sharing)
Dhruv Sengupta | [@DaHippoBear](https://github.com/DaHippoBear) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1g60S7gscwpYl4oalQHzpsQa1RahPRVd42iXyDRPMrnE/edit?usp=sharing)


##Project Site
Our project is live and operational at this link: [Nautilus](http://76.176.51.196/)

## Scrum Board
We are monitoring and updating tasks that we have to do, are doing, and are done with in the [Scrum Board in GitHub](https://github.com/Altoid0/Nautilus/projects/1)  
**Note: Link to code is in the comments for each card. Click on `Go to issue for full details` and scroll down to see the comments for each card**  

# Wk 8 README Update:
Issue | Who Did It | What We Did | Code Link
----------------------------------------- | ----------- | -------------------------------------------------------------------------- | ---------------------------------------------
[Compile project to Jar](https://github.com/Altoid0/Nautilus/issues/22) | Tanay | Worked on fixing any compilation errors such as weather import and deployed compiled jar to devops environment running on homeserver | [Code Link](https://github.com/Altoid0/Nautilus/releases/tag/2.0.0)
[Create backend endpoint for spring](https://github.com/Altoid0/Nautilus/issues/4) | Dhruv K | Worked on making sure that the directory pathing and the route to /weather would work properly, and making sure that the add atribute would connect to the right variable in thymeleaf | [Code Link](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/java/com/nautilus/NautilusApplicationController.java)
[Touch up weather html](https://github.com/Altoid0/Nautilus/issues/14) | Gautam | Worked on adding the weather HTML inputs and the CSS so that the weather API has somewhere to output to | [Code Link](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/resources/templates/weather.html)
[Integrate Thyme HTML with website](https://github.com/Altoid0/Nautilus/issues/12) | Dhruv S | Worked on adding thyme integration into the HTML and worked on the backend of thyme leaf so that the code knows how to input, get, and output the info from weather api | [Code Link](https://github.com/Altoid0/Nautilus/blob/master/menu/src/main/resources/public/weather.html#L48)

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
