SELECT 値,
 CASE WHEN 値>0 THEN '正'
      WHEN 値<0 THEN '負'
 ELSE 'ゼロ'
END AS 種類
FROM 整数;