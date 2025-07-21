SELECT クラス,AVG(演習課題) AS 演習課題平均点,
AVG(中間試験) AS 中間試験平均点,
AVG(期末試験) AS 期末試験平均点 FROM 学生
JOIN 点数 ON 点数.学生ID=学生.ID 
GROUP BY クラス;