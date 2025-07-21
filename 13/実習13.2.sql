PRAGMA foreign_keys = ON;
PRAGMA foreign_keys;

CREATE TABLE 家計簿(
    日付 DATE NOT NULL,
    費目ID INTEGER,
    メモ VARCHAR(100) NOT NULL DEFAULT '不明',
    入金額 INTEGER DEFAULT 0 CHECK(入金額>=0),
    出金額 INTEGER DEFAULT 0 CHECK(出金額>=0),
    FOREIGN KEY (費目ID) REFERENCES 費目(ID)
);

.schema 家計簿