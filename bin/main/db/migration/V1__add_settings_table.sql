CREATE TABLE IF NOT EXISTS settings (
	id INTEGER PRIMARY KEY AUTOINCREMENT,
	key TEXT UNIQUE NOT NULL,
	value TEXT NOT NULL,
	created_at DATETIME NOT NULL,
	updated_at DATETIME NOT NULL
);

INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('high-season.price.person', '1.0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('low-season.price.person', '1.0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('high-season.price.dog', '1.0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('low-season.price.dog', '1.0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('high-season.price.electricity', '1.0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('low-season.price.electricity', '1.0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('high-season.months', '6,7,8,9', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO settings (key, value, created_at, updated_at)
VALUES ('low-season.months', '1,2,3,4,5,10,11,12', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);