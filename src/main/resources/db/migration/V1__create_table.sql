create table if not exists library (
	id INT,
	book_title TEXT,
	author VARCHAR(50),
	publication_date DATE,
	genre VARCHAR(15),
	isbn VARCHAR(50),
	language VARCHAR(50),
	page_count INT,
	publisher VARCHAR(50),
	available_copies INT,
	library_location VARCHAR(50)
);