SELECT COUNT(*) AS book_number	
FROM books;

SELECT COUNT(*) AS book_number, released_year
FROM books
GROUP BY released_year;



SELECT SUM(stock_quantity) AS sum_stock
FROM books;

SELECT AVG(released_year) AS avg_released_year, author_fname
FROM books
GROUP BY author_fname;

SELECT CONCAT(author_fname, ' ', author_lname) AS full_name, pages
FROM books
ORDER BY pages DESC
LIMIT 1;

SELECT CONCAT(author_fname, ' ', author_lname) AS AUTHORS, MAX(pages)
FROM books
GROUP BY author_lname, author_fname
ORDER BY MAX(pages) DESC;


