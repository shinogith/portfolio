SELECT 社員番号,社員.名前,部署.名前 AS 部署名,
支店.名前 AS 勤務地 FROM 社員
 JOIN 部署
 ON 社員.部署ID = 部署.部署ID
 JOIN 支店
 ON 社員.勤務地ID = 支店.支店ID;