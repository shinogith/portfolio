SELECT 名義,残高,
 CASE 種別 WHEN '1' THEN '普通' 
  WHEN '2' THEN '当座' 
  WHEN '3' THEN '別段' 
END AS 種別名 
FROM 口座 
ORDER BY 残高 DESC LIMIT 10;