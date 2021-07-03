INSERT INTO tb_user (name, email, password) VALUES ('Ana', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_MEMBER');
INSERT INTO tb_role (authority) VALUES ('ROLE_VISITOR');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_genre (name) VALUES ('Ação');
INSERT INTO tb_genre (name) VALUES ('Aventura');
INSERT INTO tb_genre (name) VALUES ('Drama');

INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Resgate do Soldado Ryan', null, 1998, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/3E5pvJLNEz5WmYWl6GfFW8hEVV3.jpg','Ao desembarcar na Normandia, no dia 6 de junho de 1944, capitão Miller recebe a missão de comandar um grupo do segundo batalhão para o resgate do soldado James Ryan, caçula de quatro irmãos, dentre os quais três morreram em combate. Por ordens do chefe George C. Marshall, eles precisam procurar o soldado e garantir o seu retorno, com vida, para casa.',3);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Guerra nas Estrelas', 'O Retorno de Jedi', 1983, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/c7bdJqqDUEarvt8lC1LEDLQ0E9y.jpg','O imperador está supervisionando a construção de uma nova Estrela da Morte. Enquanto isso Luke Skywalker liberta Han Solo e a Princesa Leia das mãos de Jaba. Luke só se tornará um cavaleiro jedi quando destruir Darth Vader, que ainda pretende atraí-lo para o lado sombrio da Força.',1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Poderoso Chefão', null, 1972, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/rSPw7tgCH9c6NqICZef4kZjFOQ5.jpg','Uma família mafiosa luta para estabelecer sua supremacia nos Estados Unidos depois da Segunda Guerra Mundial. Uma tentativa de assassinato deixa o chefão Vito Corleone incapacitado e força os filhos Michael e Sonny a assumir os negócios.',3);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('O Planeta dos Macacos', 'null', 1968, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/fDDT6yClA6i3tjql8IePGq0Au1h.jpg','George Taylor, um astronauta americano, viaja por séculos em estado de hibernação. Ao acordar, ele e seus companheiros se vêem em um planeta dominado por macacos, no qual os humanos são tratados como escravos e nem mesmo tem o dom da fala.',2);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Air America - Loucos Pelo Perigo', 'Loucos Pelo Perigo', 1990, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/v4dLYy1iYtaiEMY2b6ycki9P7aP.jpg','Gene Ryack é um piloto contratado pela CIA para, sob disfarce, para transportar abastecimentos durante a Guerra do Vietnã. Ao mesmo tempo, ele tenta conciliar o tempo com o seu negócio pessoal de contrabando de armas. Mas tudo parece desandar quando ele recebe a companhia de um recruta, Billy Covington, um jovem rebelde que fora dispensado do seu último trabalho.',1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Gladiador', null, 2000, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/1g2Oribnq9fLTBqLQtLIhA7X1Zy.jpg','Nos dias finais do reinado de Marcus Aurelius, o imperador desperta a ira de seu filho Commodus ao tornar pública sua predileção em deixar o trono para Maximus, o comandante do exército romano. Sedento pelo poder, Commodus mata seu pai, assume a coroa e ordena a morte de Maximus, que consegue fugir antes de ser pego e passa a se esconder sob a identidade de um escravo e gladiador do Império Romano.',1);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Coração Valente', null, 1995, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/bZLbzF5LaiJc3y0rZ26sTFPfXCH.jpg','No século XIII, soldados ingleses matam a mulher do escocês William Wallace, bem na sua noite de núpcias. Para vingar a amada, ele resolve liderar seu povo em uma luta contra o cruel Rei inglês Edward I. Com a ajuda de Robert e Bruce, ele vai deflagrar uma violenta batalha com o objetivo de libertar a Escócia de uma vez por todas.',3);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('Forrest Gump: O Contador de Histórias', 'O Contador de Histórias', 1994, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/tNVTWNa8cxZLw7aWvHzSDLyc7ig.jpg','Tom Hanks tem uma impressionante interpretação como Forrest, um homem comum cuja simplicidade e inocência personificam uma geração. Ao lado de sua mãe, seu melhor amigo Bubba e sua favorita Jenny, Forrest tem lugar privílegiado nos mais memoráveis acontecimentos da segunda metade do século 20.',3);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('A Lista de Schindler', null, 1993, 'https://www.themoviedb.org/t/p/w533_and_h300_bestv2/yP2FC9JYXlYnCgJgVEL7ckklM0q.jpg','O alemão Oskar Schindler viu na mão de obra judia uma solução barata e viável para lucrar com negócios durante a guerra. Com sua forte influência dentro do partido nazista, foi fácil conseguir as autorizações e abrir uma fábrica. O que poderia parecer uma atitude de um homem não muito bondoso, transformou-se em um dos maiores casos de amor à vida da História, pois este alemão abdicou de toda sua fortuna para salvar a vida de mais de mil judeus em plena luta contra o extermínio alemão.',3);
INSERT INTO tb_movie (title, sub_title, year, img_url, synopsis, genre_id) VALUES ('À Espera de um Milagre', null, 1999, 'https://www.themoviedb.org/t/p/w220_and_h330_face/14hEqW67IiHlKpzKMLUXyktzZIV.jpg','Milagres acontecem em lugares inesperados, mesmo no bloco de celas para o corredor da morte na Penitenciária Cold Mountain. Lá, John Coffey, um gentil e gigante prisioneiro com poderes sobrenaturais, traz um senso de espírito e humanidade aos seus guardas e colegas de cela.',3);

INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Muito bom',1,1);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Excelente filme',3,1);
INSERT INTO tb_review (text, movie_id, user_id) VALUES ('Um dos melhores filmes',9,1);