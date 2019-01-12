# pareture-selenium

# description
Selenium starter template and test cases for my basic static website: https://pareture.xyz. Driven using JUnit5. <br />
Note I am using the latest JUnit Release Candidate as I wanted to Order Method execution.


# test suite and test execution reporting
https://github.com/njgibbon/pareture-test <br/>
( TODO: link to actual test suite once docs created. ) <br />

# logic
One single test suite is executed. Chrome is the chosen browser. <br />
Before tests Chrome Driver is started and afterwards it is closed. <br />
The site is a static SPA. <br />
Each test Opens an internal / external link on the page. <br />
Once there it does some basic validation that the new page is as expected. <br />
It then moves on. <br />


# execute 
```
mvn test -Dtest=TestSuite1
```

## resources
Chrome Driver: <br />
http://chromedriver.chromium.org/getting-started <br />

<br />

Test Exection Order: <br />
https://junit.org/junit5/docs/5.4.0-M1/user-guide/index.html#writing-tests-test-execution-order <br />

## context
Ran on a 2017 MacBook.