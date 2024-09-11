# Testing Framework Setup Instructions

## Prerequisites
Ensure that the following tools are installed on your system:

* Java Development Kit (JDK 21)
* Apache Maven
* Docker (v.18+)
* IDE (optional)

## Setup instructions
1. Clone the repository 
   * ```git clone ```
   * ```cd <repository_folder```
2. Install Dependencies
   *  ```mvn clean install```
3. Build and Run Docker Containers
   * ```docker build -t pltsci-sdet-assignment service/```
   * ```docker run -d -p 8081:8080 --name pltsci-sdet-assignment pltsci-sdet-assignment```
   * 
4. Run the Tests
