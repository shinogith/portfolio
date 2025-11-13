SELECT 社員.社員番号,社員.名前,社員1.名前 AS 上司名 
 FROM 社員
 LEFT JOIN 社員 AS 社員1
 ON 社員.上司ID = 社員1.社員番号;