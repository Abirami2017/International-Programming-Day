# International-Programming-Day

This Java program calculates and displays the date of **International Programming Day**, which is celebrated annually on **January 7th**. The program allows users to input a year and confirms the date.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

**International Programming Day** is celebrated on January 7th each year to honor programmers worldwide. This simple Java program allows users to input a year and returns the exact date for International Programming Day for that specific year.

## Features

- Accepts a year as input and returns the International Programming Day.
- Simple and lightweight.
- Clear output of the date in `YYYY-MM-DD` format.

## Installation

To run this project locally, follow these steps:

### Prerequisites

Ensure you have the following installed:

- Java Development Kit (JDK) 8 or later.
- Git (optional, for cloning the repository).

### Steps

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/InternationalProgrammingDayFinder.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd InternationalProgrammingDayFinder
   ```

3. **Compile the program**:

   ```bash
   javac -d bin src/ProgrammingDayFinder.java
   ```

4. **Run the program**:

   ```bash
   java -cp bin ProgrammingDayFinder
   ```

## Usage

Once the program is compiled and run, you can enter a year, and the program will output the International Programming Day for that year.

Example:

```java
import java.util.Scanner;

public class ProgrammingDayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Since International Programming Day is always on January 7th
        System.out.println("International Programming Day in " + year + " is: " + year + "-01-07");
    }
}
```

### Example Output:

```
Enter a year: 2024
International Programming Day in 2024 is: 2024-01-07
```

## Contributing

If you would like to contribute, feel free to fork the repository and create a pull request, or open an issue with any suggestions or improvements.

1. Fork the repo.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a pull request.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

You can adapt this template as necessary, depending on your specific implementation and features.
