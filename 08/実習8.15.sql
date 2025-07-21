SELECT COUNT(*) AS 入室中の社員 
FROM 入退室管理
WHERE 退室 IS NULL;