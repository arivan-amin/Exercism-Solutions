# Salary Calculator

Welcome to Salary Calculator on Exercism's Java Track.
If you need help running the tests or submitting your code, check out `HELP.md`.
If you get stuck on the exercise, check out `HINTS.md`, but try and solve it without using those
first :)

## Introduction

## Ternary Operators

The _ternary operator_ is a lightweight, compact alternative for simple _if/else_ statements.
Usually used in (but not restricted to) return statements, it needs just one single line to make the
decision, returning the left value if the expression is `true` and the right value if `false`, as
follows:

```java
boolean expr = 0 != 200;

// Ternary statement
int value = expr ? 22 : 33;
// => 22
```

A lot of simple _if/else_ expressions can be simplified using _ternary operators_.

## Instructions

In this exercise, you'll be implementing rules for calculating the total salary of an employee in a
month.
The International Siderurgy Company (ISC) requires assistance in calculating employee salaries,
considering various factors that can impact the final wage.

You have three tasks, and you should use the ternary operator instead of if/else statements to
implement them.

## 1. Determine the salary multiplier

Implement the `salaryMultiplier` method, which returns the salary multiplier based on the number of
days an employee skipped work.
Apply a 15% penalty if the employee skipped at least five days.

```java
int daysSkipped = 3;
salaryMultiplier(daysSkipped);
// => 1.0

daysSkipped = 7;
salaryMultiplier(daysSkipped);
// => 0.85
```

## 2. Calculate the bonus for products sold

Implement the `bonusMultiplier` and `bonusForProductsSold` methods.
The ISC pays ten monetary units for each product sold, and if an employee sells twenty products or
more, the multiplier improves to thirteen.
`bonusMultiplier` should determine which multiplier to apply, and `bonusForProductSold` should
return the total bonus in monetary units.

```java
int productsSold = 21;
bonusMultiplier(productsSold);
// => 13
bonusForProductsSold(productsSold);
// => 273

productsSold = 5;
bonusMultiplier(productsSold);
// => 10
bonusForProductsSold(productsSold);
// => 50
```

## 3. Calculate the final salary for the employee

Implement the `finalSalary` method.
It should multiply the base salary of `1000.00` by the salary multiplier, add the bonus, and return
the result.
However, salaries should be capped at `2000.00`.

```java
int daysSkipped = 2;
int productsSold = 3;
finalSalary(daysSkipped, productsSold);
// => 1030.00

productsSold = 90;
finalSalary(daysSkipped, productsSold);
// => 2000.00
```

## Source

### Created by

- @TalesDias

### Contributed to by

- @smicaliz
