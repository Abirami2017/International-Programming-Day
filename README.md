# International-Programming-Day

This Java program calculates and displays the date of **International Programming Day**, which is celebrated annually on the **256th** dayof the year. The program allows users to take year as its input.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Problem Statement](#problem-statement)
- [License](#license)

## Introduction

**International Programming Day** is celebrated on the 256th day of each year to honor programmers worldwide. This simple Java program allows users to input a year and returns the exact date for International Programming Day for that specific year.

## Features

- Accepts a year as input and returns the International Programming Day.
- Simple and lightweight.
- Clear output of the date in `DD-MM-YYYY` format.

## Problem Statement

Given a year y in a range between 1700 and 2700, find the date of the 256th day of that year according to the official Russian calendar during that year. Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is.

### Solution

“From 1700 to 1917, Russia’s official calendar was the Julian calendar; since 1919 they used the Gregorian calendar system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.”

On assigining the given problem statemnt as well as the information in hand, we would face three situationwhile formulating the code struture. 
1. **Before 1918:** The Julian leap years are divisible by 4.
2. **After 1918:**  The Gregorian calendar approach leap years are divisible by 4 with an extra condition for the years that are divisible to 100 must be divisible to 400 too in order to consider leap.
3. **During 1918:** An exception wuld occure that would return “26.09.1918”.

## Installation

To run this project locally, follow these steps:

### Prerequisites

Ensure you have the following installed:

- Java Development Kit (JDK) 8 or later.
- Git (optional, for cloning the repository).

### Steps

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/International-Programming-Day.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd International-Programming-Day
   ```

3. **Compile the program**:

   ```bash
   javac -d bin src/ProgrammingDay.java
   ```

4. **Run the program**:

   ```bash
   java -cp bin ProgrammingDay
   ```

## Usage

Once the program is compiled and run, you can enter a year, and the program will output the International Programming Day for that year.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.
