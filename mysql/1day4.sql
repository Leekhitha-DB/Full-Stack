create database games_club;
use games_club;

show tables;
desc games;

INSERT INTO games (cost_per_hour, game_name, status) VALUES
(5.00, 'Cyber Clash', 'AVAILABLE'),
(3.00, 'Mystic Quest', 'UNAVAILABLE'),
(7.00, 'Robo Arena', 'AVAILABLE'),
(2.00, 'Jungle Run', 'UNAVAILABLE'),
(6.00, 'Sky Battles', 'AVAILABLE'),
(4.00, 'Puzzle World', 'AVAILABLE'),
(8.00, 'Dungeon Raiders', 'UNAVAILABLE'),
(5.00, 'Speed Legends', 'AVAILABLE'),
(3.00, 'Ocean Escape', 'UNAVAILABLE'),
(6.00, 'Galaxy Racer', 'AVAILABLE');

select * from games;
drop table games;
