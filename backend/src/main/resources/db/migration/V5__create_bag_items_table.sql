CREATE TABLE bag_items (
    id UUID PRIMARY KEY,
    item_id INTEGER,
    item_name VARCHAR(255),
    item_count INTEGER,
    trainer_id UUID NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,

    CONSTRAINT fk_bagitem_trainer FOREIGN KEY (trainer_id) REFERENCES trainers(id) ON DELETE CASCADE
);
