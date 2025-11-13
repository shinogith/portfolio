CREATE TABLE 成績(
    学籍番号 INTEGER PRIMARY KEY,
    氏名 VARCHAR(100) NOT NULL,
    点数 INTEGER CHECK(点数>=0)
);
INSERT INTO 成績(学籍番号,氏名,点数)
 VALUES (1,'北海雪子',90);
INSERT INTO 成績(学籍番号,氏名,点数)
 VALUES (2,'情報太郎',85);