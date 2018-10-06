INSERT INTO parent(id) VALUES (1)
INSERT INTO parent(id) VALUES (2)

INSERT INTO child_one(id,parent_id) VALUES (1,1)
INSERT INTO child_one(id,parent_id) VALUES (2,1)
INSERT INTO child_one(id,parent_id) VALUES (3,2)

INSERT INTO child_two(id,parent_id) VALUES (1,1)
INSERT INTO child_two(id,parent_id) VALUES (2,2)
INSERT INTO child_two(id,parent_id) VALUES (3,2)

INSERT INTO neo_parent(id) VALUES (1)
INSERT INTO neo_parent(id) VALUES (2)

INSERT INTO neo_child_one(id,neo_parent_id) VALUES (1,1)
INSERT INTO neo_child_one(id,neo_parent_id) VALUES (2,1)
INSERT INTO neo_child_one(id,neo_parent_id) VALUES (3,2)

INSERT INTO neo_child_two(id,neo_parent_id) VALUES (1,1)
INSERT INTO neo_child_two(id,neo_parent_id) VALUES (2,2)
INSERT INTO neo_child_two(id,neo_parent_id) VALUES (3,2)