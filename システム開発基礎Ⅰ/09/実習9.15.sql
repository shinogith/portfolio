SELECT 種別,
       ROUND(AVG(残高)/10000, 0) AS 平均残高（万円）,
       ROUND(MAX(残高)/10000, 0) AS 最高残高（万円）,
       ROUND(MIN(残高)/10000, 0) AS 最小残高（万円） 
FROM 口座 GROUP BY 種別;