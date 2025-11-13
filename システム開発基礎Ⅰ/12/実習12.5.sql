SELECT ID,名前,クラス,演習課題 FROM 学生
JOIN 点数 ON 点数.学生ID=学生.ID ORDER BY 演習課題 DESC;