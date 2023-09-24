SELECT CURTIME();
SELECT CURDATE();
SELECT DAYOFWEEK(CURDATE());
SELECT DAYOFWEEK(NOW());
SELECT DATE_FORMAT(NOW(), '%d') + 1;
SELECT DAYNAME(NOW());
SELECT DATE_FORMAT(NOW(), '%W');
SELECT DATE_FORMAT(CURDATE(), '%M %d %Y');
SELECT DATE_FORMAT(NOW(), '%M %d - %h:%i:%s');
CREATE TABLE tweets (
	content VARCHAR(140), 
    username VARCHAR(20), 
    created_at TIMESTAMP default now());
INSERT INTO tweets (content, username) VALUES
('this is my first tweet', 'coltscat'),
('this is my second tweet', 'coltscat');
select * FROM tweets;


