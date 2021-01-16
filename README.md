# Morning Briefing  
A utility that allows users to get a rundown of their day in a single app. Information that users get will help them start off their day and give them a morning briefing

## Project Credits
Contributor | GitHub Link | Journal Links
----------- | ----------- | -------------
Gautam Gupta | [@batman084](https://github.com/batman084) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1tCDVj-Cb-zR5BkXZF6V9x2aPzR__5qMSUu2iNDu2oko/edit?usp=sharing)
Tanay Shah | [@Altoid0](https://github.com/Altoid0) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1g60S7gscwpYl4oalQHzpsQa1RahPRVd42iXyDRPMrnE/edit?usp=sharing)
Dhruv Kanetkar | [@DhruvK0](https://github.com/DhruvK0) | [Gautam & Dhruv K Journal](https://docs.google.com/document/d/1tCDVj-Cb-zR5BkXZF6V9x2aPzR__5qMSUu2iNDu2oko/edit?usp=sharing)
Dhruv Sengupta | [@DaHippoBear](https://github.com/DaHippoBear) | [Tanay & Dhruv S Journal](https://docs.google.com/document/d/1g60S7gscwpYl4oalQHzpsQa1RahPRVd42iXyDRPMrnE/edit?usp=sharing)

## Scrum Board
We are monitoring and updating tasks that we have to do, are doing, and are done with in the [Scrum Board in GitHub](https://github.com/Altoid0/Nautilus/projects/1)  
**Note: Link to code is in the comments for each card. Click on `Go to issue for full details` and scroll down to see the comments for each card**  

# Wk 5 Grading:

## Wk 5 - Total Grades
Name | Grade
-------- | -------
JoeCode | 20/20  

## Wk 5 - Scrum Master Grading
[Scrum Board in GitHub](https://github.com/Altoid0/Nautilus/projects/1)  
- All items that we did this week are under the 'Done' column, with the person assigned having completed the item  

Goals Completed this Week:  
1) Version 1 of Main webpage
2) Calendar app is ready, just needs HTML  
3) Added more parameters to weather app  
4) Added Thyme integration for HTML  

## Wk 5 - Guidance for Running & Reviewing Code
<u>Running Tanay's Code Steps:</u> 
1) First download the latest Gradle release https://gradle.org/releases/
2) Next follow the steps to manually install Gradle https://gradle.org/install/
3) Next, clone our project using `git clone https://github.com/Altoid0/Nautilus.git`
4) Open the folder in IntelliJ
5) Once opened navigate to the top right to add a build configuration
6) Click the plus sign in the top left of the new run configuration window that opened, and then click gradle  
![](https://github.com/Altoid0/Nautilus/blob/menu/src/main/resources/public/Tanay_RunGuide.png)  
7) Click the folder icon on the left and then select the `Calendar` project as seen in the screenshot above
8) In the "tasks" bar enter the word "run" without the quotes and finally click ok in the lower right. You should be able to now click the green run button in intellij to run the desired mini project. Repeat the run configuration steps for every project you wish to run.  

<u>Running Gautam's Code Steps</u>:
1) Navigate to the cloned project
2) Go into `Nautilus/menu/src/main/resources/public`
3) Open index.html in a web browser  

*Make sure that main.css is in the same directory as index.html*

<u>Running Dhruv S's Code Steps</u>:
1) Open the main page (index.html)
2) On the `Weather` card, click on `Run`

<u>Running Dhruv K's Code Steps</u>:  
1) First download the latest Gradle release https://gradle.org/releases/
2) Next follow the steps to manually install Gradle https://gradle.org/install/
3) Next, clone our project using `git clone https://github.com/Altoid0/Nautilus.git`
4) Open the folder in IntelliJ
5) Click on folder icon and select `Edit Configurations` and then select the `+` on the top left corner and click on `Gradle`. In the main panel on the right corner, click the folder with the blue square icon and select the `:weather` build file
6) In the taskbar, type `run`. Click `Ok` then press the `Run` button on the top right 

Build should be successful and data should be loaded

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
