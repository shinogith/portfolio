UPDATE 成績表 SET 外国語=81
 WHERE 学籍番号 IN('A002', 'E003');
UPDATE 成績表 SET 外国語=81
 WHERE 学籍番号 ='A002' OR 学籍番号 ='E003';
SELECT * FROM 成績表;