CREATE TABLE saves (
    id UUID PRIMARY KEY,
    path_json VARCHAR(255),
    path_sav VARCHAR(255),

    created_at TIMESTAMP,
    updated_at TIMESTAMP
);
