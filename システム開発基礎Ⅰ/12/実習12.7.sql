SELECT クラス,MAX(演習課題+中間試験+期末試験) AS 最高合計点 
FROM 学生
JOIN 点数 ON 点数.学生ID=学生.ID 
GROUP BY クラス;