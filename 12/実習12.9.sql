SELECT ID,名前,クラス FROM 学生
JOIN (SELECT 学生ID FROM 点数 WHERE 期末試験 <= 60) AS u60
 ON ID=u60.学生ID ;
