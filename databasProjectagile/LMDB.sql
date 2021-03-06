PRAGMA foreign_keys=ON;
BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS movies(movie_id integer primary key not null, Title text, Genre text, Rated text, Prodcompany text, Plot text, Prodyear text, Premierdate text, Director text);
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('The Shawskank Redemption','Drama','15årsgräns','Castle Rock Entertainment','Two imprisoned men bond over a number of years finding solace and eventual redemption through acts of common decency','1994','14 Oct 1994','Frank Darabont');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('The Godfather','Crime','15årsgräns','Paramount Pictures','The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son','1972','24 mar 1972','Francis Ford Coppola');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('The Godfather: Part II','Crime','15årsgräns','Paramount Pictures','The early life and career of Vito Corleone in 1920s New York is portrayed while his son  Michael  expands and tightens his grip on the family crime syndicate','1974','20 dec 1974','Francis Ford Coppola');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('The Dark Knight','Action','11årsgräns','Warner Bros','When the menace known as the Joker wreaks havoc and chaos on the people of Gotham  the caped crusader must come to terms with one of the greatest psychological tests of his ability to fight injustice','2008','18 jul 2008','Christopher Nolan');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('12 Angry Men','Drama','Barntillåtet','Orion-Nova Productions','A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence','1957','01 apr 1957','Sidney Lume');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('Schindlers List','Drama','15årsgräns','Universal Pictures','In German-occupied Poland during World War II  Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazi Germans','1993','04 feb 1994','Steven Spielberg');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('Pulp Fiction','Action','15årsgräns','Miramax','The lives of two mob hit men a boxer a gangsters wife and a pair of diner bandits intertwine in four tales of violence and redemption','1994','14 oct 1994','Quentin Tarantino');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('The Lord of the Rings: The Return of the King','Adventure','11årsgräns','New Line Cinema','Gandalf and Aragorn lead the World of Men against Saurons army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring','2003','17 dec 2003','Peter Jackson');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('The Good, the Bad and the Ugly','Western','Barntillåten','Produzioni Europee Associati','A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery','1966','29 dec 1967','Sergio Leone');
INSERT INTO "movies" (Title, Genre, Rated, Prodcompany, Plot, Prodyear, Premierdate, Director) VALUES('Fight Club','Drama','15årsgräns','Fox 2000 Pictures','An insomniac office worker, looking for a way to change his life, crosses paths with a devil-may-care soap maker, forming an underground fight club that evolves into something much, much more','1999','15 oct 1999','David Fincher');
CREATE TABLE IF NOT EXISTS actors(actor_id integer primary key not null, Name text, Actorbirth text, Actornat text, Actorchar text);
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Morgan Freeman','1 jun 1937','American','Elis Boyd "Red" Redding');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Marlon Brando','3 apr 1924','American','Don Vito Corleone');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Al Pacino','25 apr 1940','American','Michael Corleone');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('James Caan','26 mar 1940','American','Sonny Corleone');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Robert De Niro','17 aug 1943','American','Vito Corleone');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Christian Bale','30 jan 1974','Welsh','Bruce Wayne');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Heath Ledger','22 jan 2008','Australian','Joker');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Aaron Eckhart','12 mar 1968','American','Harvey Dent');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Martin Balsam','4 nov 1919','American','Juror 1');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Liam Neeson','7 jun 1952','American','Oskar Schindler');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('John Travolta','18 feb 1954','American','Vincent Vega');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Samuel L Jackson','21 dec 1948','American','Jules Winnfield');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Bruce Willis','19 mar 1955','German','Butch Coolidge');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Sean Astin','25 feb 1971','American','Sam');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Sean Bean','17 apr 1959','British','Boromir');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Orlando Bloom','13 jan 1977','British','Legolas');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Viggo Mortensen','20 oct 1958','American','Aragon');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Elijah Wood','28 jan 1981','American','Frodo Baggins');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Eli Wallach','7 dec 1915','American','Tuco');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Lee Van Cleef','9 jan 1925','American','Sentenza');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Clint Eastwood','31 may 1930','American','Blondie');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Brad Pitt','18 dec 1963','American','Tyler Durden');
INSERT INTO "actors" (Name, Actorbirth, Actornat, Actorchar) VALUES('Edward Norton','18 aug 1969','American','The Narrator');
CREATE TABLE IF NOT EXISTS reviews(review_id integer primary key not null, Rmovie_id integer, Review text);
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(1,"The Shawskank Redemption is my favorite movie, i r8 8/8");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(2,"The Godfather of all mafia movies, a solid 5/5");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(3,"The Godfather Part II the second best mafia movie of all time! 4/5");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(4,"The Dark Knight IMO best Batman ever made t. 13 years old");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(5,"12 Angry Men is in black and white, ewwwwww 1/5");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(6,"Schindlers List, too many feelings for my taste 375");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(7,"Pulp Fiction Should be rank #1 IMO");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(8,"Return of the king has a really good ending, <3 Aragon");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(9,"The good The Bad and The Worse, 0/5");
INSERT INTO "reviews" (Rmovie_id, Review) VALUES(10,"Fight Club - I dont really like long monolouges not my movie at all 1/5");
CREATE TABLE IF NOT EXISTS actors_movies(actor_id integer, movie_id integer);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(1,1);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(2,2);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(3,3);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(4,3);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(5,3);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(6,4);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(7,4);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(8,4);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(9,5);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(10,6);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(11,7);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(12,7);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(13,7);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(14,8);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(15,8);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(16,8);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(17,8);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(18,8);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(19,9);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(20,9);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(21,9);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(22,10);
INSERT INTO "actors_movies" (actor_id, movie_id) VALUES(23,10);
COMMIT;
