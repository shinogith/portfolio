SELECT 費目, SUM(出金額) AS 出金額合計 FROM 家計簿8
 GROUP BY 費目
HAVING SUM(出金額)>0
ORDER BY SUM(出金額);