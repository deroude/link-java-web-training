insert into `team` (`name`,`coach`) 
values 
('Romania','Cosmin Contra'), 
('Argentina','Jorge Sampaoli'), 
('England','Gareth Southgate');
insert into `player` (`id`,`name`,`team_name`) 
values 
('1','Vlad Chiricheș', 'Romania'), 
('2','Nicușor Stanciu', 'Romania'),
('3','Lionel Messi','Argentina'),
('4','Angel diMaria','Argentina'),
('5','Harry Kane','England'),
('6','Jesse Lingard','England');
insert into `game` (`date`,`home_name`,`away_name`,`home_score`,`away_score`) 
values 
('2018-7-21 20:00:00','Romania','England',1,1),
('2018-7-22 19:00:00','Argentina','Romania',2,3);
insert into `user` (`username`,`password`,`role`,`active`)
values
('user','$2a$11$de6223GV3duxx5DP93uHa.HuW9YkrdkKH7jdjiEkCeZ2xqeT6Jqhm','USER',1);