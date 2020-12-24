## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com

#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/

#### Expectations
We will be evaluating
1. Quality of test cases
2. Variety  of testing types (examples: boundary, happy path, negative, etc)
3. Code structure and organization
4. Naming conventions
5. Code readability
6. Code modularity

#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

 1.  When a customer chooses any pizza with no toppings, then the user shouldn't be able to select toppings
 2.  When a customer chooses any pizza with one topping, then the user should be able to select one topping
 3.	 When a customer chooses any pizza with two topping, then the user should be able to select two toppings
 4.  When a customer chooses any pizza with one topping only, then the user shouldn't be able to select the second topping
 5.  If the customer chooses O quantity, then the user shouldn't be able to click "Place Order" button
 6.  If the customer chooses >0 quantity, then the user should be able to click "Place Order" button
 7.  When a customer chooses the quantity of any pizza, then the cost updates accordingly
 8.  When a customer chooses any pizza with any toppings, then the user shouldn't be able to click "Place Order" without choosing any toppings
 9.  The customer shouldn't be able to click "Place Order" without putting his/her Name
 10. The customer shouldn't be able to click "Place Order" without putting his/her Phone number
 11. The customer should be able to click "Place Order" without putting his Email
 12. The customer should be able to choose only one payment option
 13. The customer shouldn't be able to choose both payment options
 14. When the customer clicks "Reset" button, all fields should be cleared
 15. When a customer chooses any pizza with >0 toppings, selects the toppings, enters valid name and phone number and payment information, then the user should be able to click "Place Order" 
 16. When a customer chooses any pizza with no toppings, enters valid name and phone number and payment information, then the user should be able to click "Place Order"
 
 #### Defects
 
 1. When a customer chooses any pizza with >0 toppings, but doesn't select the toppings, enters valid name and phone number and payment information, then the user is able to click "Place Order" 
 2. When a customer chooses any pizza with no toppings,  customer is able to choose toppings 
 3. Customer can click "Place Order" without putting his/her name
 4. Customer can click "Place Order" without putting his/her phone
 5. Customer can select both payment methods at the same time
 6. The Pizza order form resetting doesn't reset toppings information
 
 
 //Since there is only one pizza selection field, it can be named simply "Pizza" and not "Pizza1"
 
 

