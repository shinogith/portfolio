SELECT * FROM レンタカー 
WHERE 価格<(SELECT MAX(価格) FROM レンタカー)*0.5;