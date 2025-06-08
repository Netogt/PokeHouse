CREATE TABLE boxes (
    id UUID PRIMARY KEY,
    box_number INTEGER,
    box_column INTEGER,
    box_row INTEGER,
    user_id UUID NOT NULL,
    pokemon_id UUID,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,

    CONSTRAINT fk_box_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT fk_box_pokemon FOREIGN KEY (pokemon_id) REFERENCES pokemons(id) ON DELETE SET NULL
);
