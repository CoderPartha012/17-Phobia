# 17 Phobia

## Problem Statement

Maya is a brilliant student but once she failed in mathematics and got 17 marks out of 100. Since then she has developed a phobia for number 17. She so disturbed that she gets panic attacks in three conditions:

1. The number is 17
2. The number 17 is a part of a number.
3. The number is divisible by 17

Maya has a very happy face otherwise in any condition. Her friend has a list of numbers with her and she wants your help in determining the numbers on which Maya will get Panic Attack or be Happy Face. She does not want to frighten her friend. Can you help her out?

## Input Format

The first line consists of number of test cases, T

The only line of each test case consists of a single integer, N.

## Constraints

1<= T <=100

1<= N <=100000

## Output Format

For each test case, print if Maya will have Panic Attack or Happy Face

## Solution

The solution to this problem is to check if the given number meets any of the panic attack conditions. We can do this by writing a function `isPanicAttack` that takes an integer as input and returns a boolean value indicating whether the number meets any of the panic attack conditions.

The `isPanicAttack` function first checks if the number is 17. If it is, then it returns true, indicating that Maya will have a panic attack.

Next, it checks if the number is divisible by 17. If it is, then it returns true, indicating that Maya will have a panic attack.

Finally, it checks if the number contains 17 as part of it. To do this, it converts the number to a string and checks if the string contains the substring "17". If it does, then it returns true, indicating that Maya will have a panic attack.

If none of the panic attack conditions are met, then the `isPanicAttack` function returns false, indicating that Maya will have a happy face.

The main function reads the number of test cases and iterates through each test case. For each test case, it calls the `isPanicAttack` function and prints "Panic Attack" or "Happy Face" depending on the boolean value returned by the function.

## Complexity Analysis

The time complexity of this solution is O(log n) because we need to convert the number to a string to check if it contains the substring "17". The space complexity is O(1) because we only need a constant amount of space to store the input and output variables.
