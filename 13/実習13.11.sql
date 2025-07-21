CREATE INDEX pege_title_index ON page(page_title);

.timer on

SELECT COUNT(*) FROM page WHERE page_title='北海道';