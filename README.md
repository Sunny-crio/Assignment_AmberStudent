# Assignment_AmberStudent
AmberStudent QA Automation Project
This repository contains automated test scripts for the QA assignment focused on testing various functionalities of the AmberStudent website. The tasks include searching for accommodation in London, filtering search results, interacting with search results, and performing bonus tasks related to user interaction and verification.

Table of Contents
Requirements
Setup
Usage
Test Scenarios
Task
Bonus Task 1
Bonus Task 2
Requirements
Python 3.x
Selenium WebDriver
ChromeDriver
pytest
Setup
Clone the repository:
bash
Copy code
git clone https://github.com/Sunny-crio/Assignment_AmberStudent.git
cd amberstudent-qa-automation
Install the required dependencies:
bash
Copy code
pip install -r requirements.txt
Download ChromeDriver:
Download the appropriate version of ChromeDriver from here.
Place the downloaded executable in the drivers folder.
Usage
To run the automated tests, execute the following command in the terminal:

bash
Copy code
pytest test_amberstudent.py
This will execute the test script, and the results will be displayed in the terminal.

Test Scenarios
Task
Visit AmberStudent
Search for accommodation in London
Filter search results for Room Type - "Private Room" and Sharing - "Private Bathroom"
Open the second search result in a new tab
Switch to the tab and assert the title and location of the property
Bonus Task 1
Visit AmberStudent
Click on the search bar
Iterate over the counties’ tab
Verify the list of popular cities is different for all countries and no city is repeated or mentioned in more than 1 country tab. (Ignore “All” section)
Bonus Task 2
Visit AmberStudent
Login using Gmail
Search for accommodation in London
Filter search results for Room Type - "Private Room" and Sharing - "Private Bathroom"
Shortlist the second search result
Open the second search result in a new tab
Switch to the tab and assert the title and location of the property
Verify the property is shortlisted
Enter the check-in and check-out dates
Try to make a booking for the property
Log out of your account
