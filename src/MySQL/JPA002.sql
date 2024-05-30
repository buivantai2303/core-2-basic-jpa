-- Table Daddy
CREATE TABLE Daddy (
    DaddyID INT AUTO_INCREMENT PRIMARY KEY,
    DaddyFullName VARCHAR(255) NOT NULL,
    DaddyAge INT CHECK (DaddyAge >= 25) NOT NULL
);

-- Table Child
CREATE TABLE Child (
    ChildID INT AUTO_INCREMENT PRIMARY KEY,
    ChildFullName VARCHAR(255) NOT NULL,
    ChildAge INT NOT NULL,
    Gender ENUM('Male', 'Female') NOT NULL,
    DaddyID INT,
    FOREIGN KEY (DaddyID) REFERENCES Daddy(DaddyID)
);

-- Add the PhoneNumber field to the Daddy table
ALTER TABLE Daddy
ADD COLUMN PhoneNumber VARCHAR(12) NOT NULL;