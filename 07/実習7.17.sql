UPDATE 回答者 SET 国名 =
 CASE WHEN メールアドレス LIKE '%jp' THEN '日本'
  WHEN メールアドレス LIKE '%uk' THEN 'イギリス'
  WHEN メールアドレス LIKE '%cn' THEN '中国'
  WHEN メールアドレス LIKE '%fr' THEN 'フランス'
  WHEN メールアドレス LIKE '%vn' THEN 'ベトナム'
END;
SELECT * FROM 回答者;