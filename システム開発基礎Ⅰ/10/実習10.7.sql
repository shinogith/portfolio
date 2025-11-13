INSERT INTO 家計簿集計 (費目,合計,平均,最大,最小,回数)
 SELECT 費目,SUM(出金額),AVG(出金額),MAX(出金額),
        MIN(出金額),COUNT(出金額) FROM 家計簿
 WHERE 出金額 > 0
GROUP BY 費目;
SELECT * FROM 家計簿集計;