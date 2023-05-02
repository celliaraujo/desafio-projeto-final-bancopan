INSERT INTO tb_contatos (id, nome, endereco) VALUES (1, 'maria', 'rua 21') on conflict do nothing
INSERT INTO tb_telefones (contato_id, telefone) VALUES (1, '2199658-9658') on conflict do nothing
INSERT INTO tb_telefones (contato_id, telefone) VALUES (1, '2199687-9658') on conflict do nothing
INSERT INTO tb_contatos (id, nome, endereco) VALUES (2, 'joao', 'rua 10') on conflict do nothing
INSERT INTO tb_telefones (contato_id, telefone) VALUES (2, '2199632-9658') on conflict do nothing
INSERT INTO tb_contatos (id, nome, endereco) VALUES (3, 'miguel', 'rua 10') on conflict do nothing
INSERT INTO tb_telefones (contato_id, telefone) VALUES (3, '2199632-9632') on conflict do nothing
INSERT INTO tb_contatos (id, nome, endereco) VALUES (4, 'celia', 'rua 1') on conflict do nothing
INSERT INTO tb_telefones (contato_id, telefone) VALUES (4, '2198742-9658') on conflict do nothing
INSERT INTO tb_contatos (id, nome, endereco) VALUES (5, 'abrantes', 'rua 10') on conflict do nothing
INSERT INTO tb_telefones (contato_id, telefone) VALUES (5, '2199632-9963') on conflict do nothing