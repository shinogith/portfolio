SELECT * FROM 家計簿 
WHERE 日付 >= '2018-01-10' AND 日付 <= '2018-02-10' 
UNION 
SELECT * FROM 家計簿アーカイブ 
WHERE 日付 >= '2018-01-10' AND 日付 <= '2018-02-10' 
ORDER BY 日付;