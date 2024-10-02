# IPL Player Management System

This is a simple Java-based project that performs database operations (CRUD) on an `IPL Player` database using MySQL. The project currently supports updating and deleting player information in the database.

## Features
- **Update Player Runs**: Updates the number of runs for a player identified by their jersey number.
- **Delete Player**: Deletes a player from the database using their unique jersey number.

## Technologies Used
- Java
- MySQL
- JDBC (Java Database Connectivity)

## Prerequisites
Before running the project, ensure you have the following installed:
- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [MySQL](https://dev.mysql.com/downloads/installer/)
- MySQL JDBC Driver (already included in the project)

## Database Setup
1. Start MySQL and create a database for the players:
    ```sql
    CREATE DATABASE iplplayer;
    ```

2. Create the `player` table:
    ```sql
    CREATE TABLE player (
        jerseyno INT PRIMARY KEY,
        name VARCHAR(100),
        runs INT
    );
    ```

3. Insert some test data (optional):
    ```sql
    INSERT INTO player (jerseyno, name, runs) VALUES (210, 'Player1', 200), (211, 'Player2', 150);
    ```

## Project Structure
The project consists of two primary classes for database operations:

1. **IPL_Dao_Update**: Handles updating the number of runs for a player.
2. **IPL_Dao_Delete**: Handles deleting a player from the database.

## Usage

### Update Player Runs
This class updates the `runs` for a player with a specific `jerseyno`.

```java
IPL_Dao_Update updateDao = new IPL_Dao_Update();
updateDao.updatePlayerRuns();
