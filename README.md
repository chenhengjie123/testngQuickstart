# testngQuickstart

A project with testng and reportng using maven. Sample for new testng user.

# Usage

```
mvn clean test
```

Then you should see outputs like below:

```
-------------------------------------------------------
 T E S T S
 -------------------------------------------------------
 Running TestSuite
 Hello world
 Tests run: 2, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.374 sec <<< FA
 ILURE!

 Results :

 Failed tests:
   testFailed(com.chjvps.test.samples.AppTest)

   Tests run: 2, Failures: 1, Errors: 0, Skipped: 0

   [INFO] ------------------------------------------------------------------------
   [ERROR] BUILD FAILURE
   [INFO] ------------------------------------------------------------------------
   [INFO] There are test failures.

   Please refer to D:\Personal\Develop\testngDemo\target\surefire-reports for the i
   ndividual test results.
```

It shows the test cases are executed and one of it failed.

# Project structure

`src/test/java/com/chjvps/test/samples/AppTest.java`: Test case file. Including 2 test cases.

`target/surefire-reports/html/index.html`: Report generaled by reportng using default setting.
