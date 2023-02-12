# Running the 2048 Game in Gradle
This repository contains a Java implementation of the popular game 2048, built using Gradle. In order to play the game, you will need to have Gradle installed on your local machine.


## Prerequisites
Java Development Kit (JDK)
Gradle
## Step 1: Clone the Repository
Clone the repository to your local machine using the following command:
git clone https://github.com/danmao1/2048.git

## Step 2: Navigate to the Project Directory
Open a terminal or command prompt and navigate to the root directory of the project. This is the directory where the build.gradle file is located.

## Step 3: Build and Run the Application
Run the following command to build and run the application:
./gradlew run
Note that the ./gradlew script is used to run Gradle on Unix-based systems, while on Windows systems you would use gradlew.bat.

## How to Play 2048
2048 is a simple yet addictive game. The goal is to combine tiles with the same number to form a new tile with a higher number. The game is played on a 4x4 grid and the player moves the tiles by swiping up, down, left, or right. When two tiles with the same number touch, they merge into one tile with the combined value. The game is won when a tile with the value 2048 is formed. The game is lost when there are no more moves left.

Here are the controls for playing the game:

Use the arrow keys or swipe gestures to move the tiles.

## Conclusion
By following these steps, you should be able to play the 2048 game that is built using Gradle in this repository. If you encounter any issues or have any questions, please refer to the issues section of the repository for assistance.
