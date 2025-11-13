SELECT * FROM 家計簿
WHERE 費目 = '食費'
AND 出金額 < (SELECT MIN(出金額) FROM 家計簿アーカイブ 
        WHERE 費目 = '食費');