SELECT 種別,AVG(残高) AS 平均残高,
       MAX(残高) AS 最高残高,
       MIN(残高) AS 最小残高 
FROM 口座 GROUP BY 種別;