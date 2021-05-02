PRAGMA foreign_keys = ON;
-- DROP TABLE words;
-- DROP TABLE sentences;
-- DROP TABLE paragraphs;
-- DROP TABLE sections;
-- DROP TABLE chapters;
-- DROP TABLE operations;
-- DROP TABLE constructs; 
-- DROP TABLE operationtypes;

CREATE TABLE constructs (
  constructId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , constructType TEXT NOT NULL
  , CONSTRAINT constructTypeUnique UNIQUE(constructType)
);

INSERT OR REPLACE INTO constructs (constructType) VALUES ('word');
INSERT OR REPLACE INTO constructs (constructType) VALUES ('sentence');
INSERT OR REPLACE INTO constructs (constructType) VALUES ('paragraph');
INSERT OR REPLACE INTO constructs (constructType) VALUES ('section');
INSERT OR REPLACE INTO constructs (constructType) VALUES ('chapter');

CREATE TABLE operationTypes (
  operationTypeId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , operationType TEXT NOT NULL
  , CONSTRAINT operationTypeUnique UNIQUE(operationType)
);

INSERT OR REPLACE INTO operationTypes (operationType) VALUES ('insert');
INSERT OR REPLACE INTO operationTypes (operationType) VALUES ('update');
INSERT OR REPLACE INTO operationTypes (operationType) VALUES ('delete');

CREATE TABLE operations (
  operationId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , operationTypeId INTEGER NOT NULL
  , constructId INTEGER NOT NULL
  , createdAt DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP
  , FOREIGN KEY(constructId) REFERENCES constructs(constructId)
  , FOREIGN KEY(operationTypeId) REFERENCES operationTypes(operationTypeId)
);

CREATE TABLE chapters (
  chapterId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , operationId INTEGER NOT NULL
  , chapterName TEXT
  , oldValue TEXT
  , newValue TEXT
  , FOREIGN KEY(operationId) REFERENCES operations(operationId)
);

CREATE TABLE sections (
  sectionId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , operationId INTEGER NOT NULL
  , sectionName TEXT
  , oldValue TEXT
  , newValue TEXT
  , chapterId INTEGER NOT NULL
  , FOREIGN KEY(operationId) REFERENCES operations(operationId)
  , FOREIGN KEY(chapterId) REFERENCES sections(chapterId)
);

CREATE TABLE paragraphs (
  paragraphId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , operationId INTEGER NOT NULL
  , oldValue TEXT
  , newValue TEXT
  , sectionId INTEGER NOT NULL
  , FOREIGN KEY(operationId) REFERENCES operations(operationId)
  , FOREIGN KEY(sectionId) REFERENCES sections(sectionId)
);

CREATE TABLE sentences (
  sentenceId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , operationId INTEGER NOT NULL
  , oldValue TEXT
  , newValue TEXT
  , paragraphId INTEGER NOT NULL
  , FOREIGN KEY(operationId) REFERENCES operations(operationId)
  , FOREIGN KEY(paragraphId) REFERENCES paragraphs(paragraphId)
);

CREATE TABLE words (
  wordId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , operationId INTEGER NOT NULL
  , oldValue TEXT
  , newValue TEXT
  , FOREIGN KEY(operationId) REFERENCES operations(operationId)
);

CREATE TABLE IF NOT EXISTS sentenceWords (
  sentenceWordId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
  , sentenceId INTEGER NOT NULL
  , wordId INTEGER NOT NULL
  , FOREIGN KEY(sentenceId) REFERENCES sentences(sentenceId)
  , FOREIGN KEY(wordId) REFERENCES words(wordId)
)