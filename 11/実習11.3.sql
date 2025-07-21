SELECT 日付,名前 AS 費目,メモ,入金額,出金額 FROM 家計簿
 JOIN (SELECT * FROM 費目 WHERE 名前 = '給料') AS 費目
 ON 家計簿.費目ID = 費目.ID;