SELECT 学生.学籍番号,氏名,科目,点数 FROM 学生
JOIN 成績 ON 学生.学籍番号=成績.学籍番号 WHERE 科目='システム開発基礎I' ORDER BY 点数 DESC;