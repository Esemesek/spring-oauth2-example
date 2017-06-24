INSERT INTO
  user (id, username, password)
  VALUES
  (1, 'admin', 'b8f57d6d6ec0a60dfe2e20182d4615b12e321cad9e2979e0b9f81e0d6eda78ad9b6dcfe53e4e22d1');

INSERT INTO authority (name)
VALUES
  ('ROLE_USER'),
  ('ROLE_ADMIN');

INSERT INTO user_authority (id_user, name)
  VALUES (1, 'ROLE_ADMIN');
