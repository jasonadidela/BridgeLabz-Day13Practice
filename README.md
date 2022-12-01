# BridgeLabz-Day-13Practice

## Find Maximum Problem using Generics

- Test Maximum of 3 Variables.

## TC: In the following Use Cases
- Make sure Test Cases.

## UC1: Given 3 Integers find the maximum
- Ensure to test code with the Test Case.
- To ensure your Code works you need 3 test cases with Max Number at 1st, 2nd and 3rd.
- Use Integer Object and compareTo method to test the maximum number.

## TC 1.1: Given Max Number at 1st Position return the Same Number
- Ensure the test data has Max Number in the First position.

## TC 1.2: Given Max Number at 2nd Position return the Same Number
- Ensure the test data has Max Number in the Second position.

## TC 1.3: Given Max Number at 3rd Position return the Same Number
- Ensure the test data has Max Number in the Third position.

## UC2: Given 3 Floats find the maximum
- Ensure to test code with the Test Case and repeat with the similar 3 Test cases in UC1.

## UC3: Give 3 String find the maximum
- Ensure to test code with the Test Case and repeat with the similar 3 Test cases in UC1.
- E.g. Apple Peach Banana

## Refactor 1: Refactor all the 3 to One Generic Method and find the maximum
- Ensure the Generic Type extends Comparable.
- Make the test case work.

## Refactor 2: Refactor to create Generic Class to take in 3 variables of Generic Type
- Ensure the Generic Type extends Comparable.
- Write parameter constructor.
- Write testMaximum method to internally call the static testMaximum method passing the 3 instance variables
- Define new test case to use the Generic Class.

## UC4: Extend the max method to take more then three parameters
- Use Options and use Sorting.

## UC5: Extend the max method to also print the max to std out using Generic Method
- Write printMax Generic Method which is internally called from testMaximum.