CREATE TABLE pokemons (
    id UUID PRIMARY KEY,
    p_id INTEGER,
    is_shiny INTEGER,
    gender INTEGER,
    species VARCHAR(255),
    nickname VARCHAR(255),
    exp INTEGER,
    nature VARCHAR(255),
    held_item INTEGER,
    ability VARCHAR(255),
    current_friendship INTEGER,
    poke_language VARCHAR(50),
    game_version VARCHAR(50),
    generation INTEGER,
    met_location VARCHAR(255),
    ball INTEGER,
    met_level INTEGER,

    stats TEXT,
    ivs TEXT,
    evs TEXT,
    moves TEXT,

    marking_circle BOOLEAN,
    marking_triangle BOOLEAN,
    marking_square BOOLEAN,
    marking_heart BOOLEAN,
    marking_cross BOOLEAN,
    marking_star BOOLEAN,
    marking_diamond BOOLEAN,

    t_id_16 INTEGER,
    original_trainer_name VARCHAR(255),
    original_trainer_gender INTEGER,

    user_id UUID NOT NULL,
    save_id UUID NOT NULL,

    created_at TIMESTAMP,
    updated_at TIMESTAMP,

    CONSTRAINT fk_pokemon_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT fk_pokemon_save FOREIGN KEY (save_id) REFERENCES saves(id) ON DELETE CASCADE
);
