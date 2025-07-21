SELECT 注文日, 商品名,単価 FROM 注文
 JOIN 商品
 ON 注文.商品ID = 商品.ID;