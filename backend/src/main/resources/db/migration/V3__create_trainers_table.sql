CREATE TABLE trainers (
    id UUID PRIMARY KEY,
    t_id INTEGER,
    s_id INTEGER,
    name VARCHAR(255),
    gender INTEGER,
    badges INTEGER,
    money INTEGER,
    play_time VARCHAR(255),
    seen_count INTEGER,
    caught_count INTEGER,
    game_version VARCHAR(255),
    game_generation INTEGER,
    user_id UUID NOT NULL,
    save_id UUID NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,

    CONSTRAINT fk_trainer_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT fk_trainer_save FOREIGN KEY (save_id) REFERENCES saves(id) ON DELETE CASCADE
);