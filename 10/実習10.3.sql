SELECT * FROM 家計簿N
 WHERE 費目 NOT IN('食費', '水道光熱費') 
 AND 費目 IS NOT NULL;