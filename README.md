This repository is for the submission of the assignments of the spring boot sessions conducted in the backend module of Scaler Academy.
Problem Statment: Create a Demo Application with Rest Controller and Services to return data related to a Player. It should have two models: Player, with id, firstName, lastName and age and BOT with just name as the instance variable. But the JPA should create two tables in such a way that Player should have {id, firstName,lastName,age} with ID as primary key and BOT table with both ID as primary key and Name as the name of the bot.
Solution: One of the solution exist in the formation of the Inheritance relationship between the two DTOs - Players and BOT with the Inheritance strategy - "JOINED".
To learn more about this type and other inheritance strategy forms, follow: https://www.baeldung.com/hibernate-inheritance

Snapshot:
![image](https://github.com/abhayjohri23/Scaler_Assignment1_Inheritance_JoinedStrategy/assets/124622368/a72a3fc0-7b86-4183-9dc0-f1ceed65c967)

