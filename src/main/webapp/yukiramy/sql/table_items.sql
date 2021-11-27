CREATE TABLE Items(
	item_id INT NOT NULL AUTO_INCREMENT,
	title VARCHAR(40) NOT NULL,
	info VARCHAR(250),
	submission_date DATE,
	url CHAR(100),
	PRIMARY KEY (item_id)
)