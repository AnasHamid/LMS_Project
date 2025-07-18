# LMS_Project
LMS project

### Day 1 :
Create a java springboot project and connect it to a github repo.

### Day 2:
Configure checkstyles.

### Day 3:
Build an api to get BookList of hard coded data (book id, book name, author name and publisher name).
Configure PostgresSQL in the project.
Run the Service Successfully.

### Day 4:
Configure Flyway and create new table using flyway migration.
Change project formatting rules in IDE.
Run external book list api on local. 
 
Response : 

{
"bookList": [
{
"bookId": 1,
"bookName": "",
"authorName": "",
"publisherName": ""
},
{
"bookId": 2,
"bookName": "",
"authorName": "",
"publisherName": ""
},
{
"bookId": 3,
"bookName": "",
"authorName": "",
"publisherName": ""
}
]
}

### Day 5:
Connect entity with database.
Create insertion api for book store.
Run insertion api on local.
Implement OpenAPI Specification (swagger).

Request :

{
"bookList": [
{
"bookName": "Five Point Someone",
"authorName": "Chetan Bhagat",
"publisherName": "RK Brothers Prakashan"
}
]
}

Response :
Books added successfully
