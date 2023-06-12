# MultiThreading in Java

This repository contains a Java project focused on exploring multi-threading concepts and techniques using Java's threading features. The project covers various topics, including creating threads using the `Runnable` interface and the `Thread` class, using `wait()` and `notify()` methods for thread synchronization, and implementing the producer-consumer problem.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Multi-threading is a powerful technique in Java that allows concurrent execution of multiple threads within a single program. This project aims to provide a comprehensive understanding of multi-threading concepts through practical examples and explanations.

## Installation

To run the code from this project, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Clone this repository to your local machine using the following command:

   ```shell
   git clone https://github.com/iamaditya/multiThreading.git

3. Open the project in your preferred Java Integrated Development Environment (IDE).
4. Build the project to compile the Java source files.

## Usage
To understand and observe the Producer-Consumer problem implemented using thread synchronization, you can follow these steps:

1. Clone the repository to your local machine using the following command:

   ```shell
   git clone https://github.com/your-username/MultiThreading-in-Java.git

2. Navigate to the ProducerConsumerProblem directory:

    ```shell
    cd MultiThreading-in-Java/ProducerConsumerProblem

3. Open the project in your preferred Java Integrated Development Environment (IDE).

4. Review the code in the following Java files:

    1. Company.java: Defines the Company class responsible for producing and consuming items. It includes the produced_items() and consumed_items() methods.
    2. Producer.java: Extends the Thread class and represents the producer thread. It interacts with the Company object by calling the produced_items() method.
    3. Consumer.java: Extends the Thread class and represents the consumer thread. It interacts with the Company object by calling the consumed_items() method.
    4. Main.java: Contains the main method, which initializes the Company object and starts the producer and consumer threads.

5. Run the Main.java file to observe the behavior of the producer and consumer threads. This will start an infinite loop where items are produced and consumed. The produced and consumed item numbers will be printed to the console.

    ```shell
    javac Main.java
    java Main

You will see the output similar to the following:


    Produced Item: 1
    Consumed Item: 1
    Produced Item: 2
    Consumed Item: 2
    ... 

*Note: You can stop the program by pressing Ctrl + C in the console.*  


## Examples

Here's an example of creating a simple thread using the Runnable interface:

    public class MyRunnable implements Runnable {
    public void run() {
        // Code to be executed in the thread
        System.out.println("Thread is running");
    }
    }

    public class Main {
        public static void main(String[] args) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }   

For more examples and detailed explanations, refer to the source code files within each package.

## Contributing

Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please feel free to open an issue or submit a pull request. Let's collaborate and make this project better together.

## License 

This project is licensed under the *MIT License*.

Copyright (c) 2023 Aditya_Sharma

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
