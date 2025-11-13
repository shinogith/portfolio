INSERT INTO 家計簿(日付,費目ID,メモ,入金額,出金額)
 VALUES ('2019-12-31',1,'テスト13.5',0,1000);
SELECT * FROM 家計簿;
DELETE FROM 費目 WHERE ID=1;