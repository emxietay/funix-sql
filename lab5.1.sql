SELECT *
FROM books
WHERE released_year < 1980;

SELECT *
FROM books
WHERE author_lname IN ('Eggers' , 'Chabon');

SELECT *
FROM books
WHERE author_lname = 'Lahiri' AND released_year < 2000;

SELECT *
FROM books
WHERE pages BETWEEN 100 AND 200;

SELECT title, author_lname,
	CASE 
		WHEN title LIKE '%stories%' THEN 'Short Stories'
		WHEN title LIKE 'Just Kids' OR title LIKE 'A Heartbreaking Work of Staggering Genius' THEN 'Memoir'
		ELSE 'NOVEL'
	END	AS TYPE
FROM books;


