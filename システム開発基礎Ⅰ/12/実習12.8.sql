SELECT ID,名前,クラス,
 CASE WHEN (演習課題+中間試験+期末試験) >= 250 THEN '秀'
 WHEN (演習課題+中間試験+期末試験) >= 200 THEN '優'
 WHEN (演習課題+中間試験+期末試験) >= 150 THEN '可'
 ELSE '不可'
 END AS 評定 
FROM 学生
JOIN 点数 ON 点数.学生ID=学生.ID ;