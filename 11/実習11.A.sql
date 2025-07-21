SELECT 支店ID, 支店.名前 AS 支店名, 社員.名前 AS 支店長名, C.社員数
 FROM 支店
 LEFT JOIN 社員
 ON 支店.支店長ID = 社員.社員番号
 JOIN (SELECT COUNT(*) AS 社員数, 勤務地ID
 FROM 社員 GROUP BY 勤務地ID) AS C
 ON 支店.支店ID = C.勤務地ID;