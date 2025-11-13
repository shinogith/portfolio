SELECT 社員番号,社員.名前,部署.名前 AS 部署名 FROM 社員
 JOIN 部署
 ON 社員.部署ID = 部署.部署ID;