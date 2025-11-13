INSERT INTO 頭数集計 (飼育県,頭数)
 SELECT 飼育県, COUNT(個体識別番号) FROM 個体識別
 GROUP BY 飼育県;
SELECT * FROM 頭数集計;