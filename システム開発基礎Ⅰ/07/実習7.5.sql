UPDATE 家計簿
 SET メモ= REPLACE(メモ, '購入', '買った');
SELECT * FROM 家計簿;