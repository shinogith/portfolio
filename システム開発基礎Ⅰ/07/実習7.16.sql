SELECT 受験者ID AS 合格者ID FROM 試験結果
 WHERE 午前>=60 AND (午後1+午後2)>=120
  AND 論述>=平均点*4*0.3;