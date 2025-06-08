CREATE TABLE saves (
    id UUID PRIMARY KEY,
    path_json VARCHAR(255),
    path_sav VARCHAR(255),
    trainer_id UUID,

    created_at TIMESTAMP,
    updated_at TIMESTAMP,

    CONSTRAINT fk_save_trainer FOREIGN KEY (trainer_id) REFERENCES trainers(id) ON DELETE SET NULL
);
