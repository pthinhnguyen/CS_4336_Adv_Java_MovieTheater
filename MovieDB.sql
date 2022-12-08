CREATE TABLE Theaters (
    id INT NOT NULL,
    name_t VARCHAR(50) NOT NULL,
    street VARCHAR(100),
    state_t VARCHAR(2),
    zipcode VARCHAR(5) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Movies (
    id INT NOT NULL,
    title VARCHAR(50) NOT NULL,
    description_m VARCHAR(500),
    poster VARCHAR(500),
    PRIMARY KEY (id)
);

CREATE TABLE DateSlots (
    id INT NOT NULL,
    date_t VARCHAR(10) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE TimeSlots (
    id INT NOT NULL,
    time_t VARCHAR(5) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Shows (
    id_show INT NOT NULL,
    id_theater INT NOT NULL,
    id_movie INT NOT NULL,
    id_dateslot INT NOT NULL,
    id_timeslot INT NOT NULL,
    PRIMARY KEY (id_show),
    CONSTRAINT FK_Shows_Theater FOREIGN KEY (id_theater) REFERENCES Theaters (id),
    CONSTRAINT FK_Shows_Movie FOREIGN KEY (id_movie) REFERENCES Movies (id),
    CONSTRAINT FK_Shows_DateSlot FOREIGN KEY (id_dateslot) REFERENCES DateSlots (id),
    CONSTRAINT FK_Shows_TimeSlot FOREIGN KEY (id_timeslot) REFERENCES TimeSlots (id)
);

CREATE TABLE Payments (
    id INT NOT NULL,
    name_on_card VARCHAR(100) NOT NULL,
    card_number VARCHAR(16) NOT NULL,
    expiration_month INT,
    expiration_year INT,
    PRIMARY KEY (id)
);

CREATE TABLE Customers (
    id INT NOT NULL,
    fullname VARCHAR(100) NOT NULL,
    username VARCHAR(50) NOT NULL,
    password_c VARCHAR(50) NOT NULL,
    id_credit INT NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_Customers_Payments FOREIGN KEY (id_credit) REFERENCES Payments (id)
);

CREATE TABLE Orders(
    id INT NOT NULL,
    -- id_customer INT NOT NULL,
    id_show INT NOT NULL,
    seat_code VARCHAR(500) NOT NULL,
    quantity INT NOT NULL,
    total_paid FLOAT NOT NULL,
    PRIMARY KEY (id),
    -- CONSTRAINT FK_Orders_Customers FOREIGN KEY (id_customer) REFERENCES Customers (id),
    CONSTRAINT FK_Orders_Shows FOREIGN KEY (id_show) REFERENCES Shows (id_show)
);

-- CREATE TABLE Tickets(
--     id INT NOT NULL,

-- )

INSERT INTO Theaters VALUES (1, 'The Prodigy Theatre', '41 Tunnel St. Glen Ellyn', 'UT','84003');
INSERT INTO Theaters VALUES (2, 'The Curator Concert Hall', '24 West Vermont Avenue Palm Coast', 'CA','92704');
INSERT INTO Theaters VALUES (3, 'The Harmony Amphitheater', '9705 Church St. Orange', 'NY','14738');
INSERT INTO Theaters VALUES (4, 'The Eclipse Concert Hall', '81 Valley Farms Rd. Danbury', 'UT','84003');
INSERT INTO Theaters VALUES (5, 'The Grand Shrine Concert Hall', '194 Homewood Court Hartselle', 'NC','28119');
INSERT INTO Theaters VALUES (6, 'The Ancestral Concert Hall', '8518 S. Maple Street Oakland Gardens', 'NC','28119');
INSERT INTO Theaters VALUES (7, 'The Prodigy Amphitheater', '73 Stillwater Lane Newnan', 'NY','14738');
INSERT INTO Theaters VALUES (8, 'The Enigma Concert Hall', '202 Walnutwood Street Deland', 'CA','92704');
INSERT INTO Theaters VALUES (9, 'The Solar Theater', '8333 Sulphur Springs Road Lindenhurst', 'NY','14738');
INSERT INTO Theaters VALUES (10, 'The Warden Opera House', '7282 Myers St. Brockton', 'CA','92704');

INSERT INTO Movies VALUES (1,'Pulp Fiction', 'The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.', 'https://upload.wikimedia.org/wikipedia/en/3/3b/Pulp_Fiction_%281994%29_poster.jpg');
INSERT INTO Movies VALUES (2,'The Social Network', 'As Harvard student Mark Zuckerberg creates the social networking site that would become known as Facebook, he is sued by the twins who claimed he stole their idea, and by the co-founder who was later squeezed out of the business.', 'https://upload.wikimedia.org/wikipedia/en/thumb/8/8c/The_Social_Network_film_poster.png/220px-The_Social_Network_film_poster.png');
INSERT INTO Movies VALUES (3,'12 Years a Slave', 'In the antebellum United States, Solomon Northup, a free black man from upstate New York, is abducted and sold into slavery.', 'https://upload.wikimedia.org/wikipedia/en/5/5c/12_Years_a_Slave_film_poster.jpg');
INSERT INTO Movies VALUES (4,'The Silence of the Lambs','A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims.', 'https://upload.wikimedia.org/wikipedia/en/8/86/The_Silence_of_the_Lambs_poster.jpg');
INSERT INTO Movies VALUES (5,'Black Panther','Challa, heir to the hidden but advanced kingdom of Wakanda, must step forward to lead his people into a new future and must confront a challenger from his country past.', 'https://upload.wikimedia.org/wikipedia/en/d/d6/Black_Panther_%28film%29_poster.jpg');

INSERT INTO DateSlots VALUES (8122, '08/01/2022');
INSERT INTO DateSlots VALUES (8222, '08/02/2022');
INSERT INTO DateSlots VALUES (8322, '08/03/2022');
INSERT INTO DateSlots VALUES (8422, '08/04/2022');
INSERT INTO DateSlots VALUES (8522, '08/05/2022');
INSERT INTO DateSlots VALUES (8622, '08/06/2022');
INSERT INTO DateSlots VALUES (8722, '08/07/2022');
INSERT INTO DateSlots VALUES (8822, '08/08/2022');
INSERT INTO DateSlots VALUES (8922, '08/09/2022');
INSERT INTO DateSlots VALUES (81022, '08/10/2022');
INSERT INTO DateSlots VALUES (81122, '08/11/2022');
INSERT INTO DateSlots VALUES (81222, '08/12/2022');
INSERT INTO DateSlots VALUES (81322, '08/13/2022');
INSERT INTO DateSlots VALUES (81422, '08/14/2022');
INSERT INTO DateSlots VALUES (81522, '08/15/2022');
INSERT INTO DateSlots VALUES (81622, '08/16/2022');
INSERT INTO DateSlots VALUES (81722, '08/17/2022');
INSERT INTO DateSlots VALUES (81822, '08/18/2022');
INSERT INTO DateSlots VALUES (81922, '08/19/2022');
INSERT INTO DateSlots VALUES (82022, '08/20/2022');
INSERT INTO DateSlots VALUES (82122, '08/21/2022');
INSERT INTO DateSlots VALUES (82222, '08/22/2022');
INSERT INTO DateSlots VALUES (82322, '08/23/2022');
INSERT INTO DateSlots VALUES (82422, '08/24/2022');
INSERT INTO DateSlots VALUES (82522, '08/25/2022');
INSERT INTO DateSlots VALUES (82622, '08/26/2022');
INSERT INTO DateSlots VALUES (82722, '08/27/2022');
INSERT INTO DateSlots VALUES (82822, '08/28/2022');
INSERT INTO DateSlots VALUES (82922, '08/29/2022');
INSERT INTO DateSlots VALUES (83022, '08/30/2022');
INSERT INTO DateSlots VALUES (83122, '08/31/2022');


INSERT INTO TimeSlots VALUES (830, '8:30');
INSERT INTO TimeSlots VALUES (900, '9:00');
INSERT INTO TimeSlots VALUES (930, '9:30');
INSERT INTO TimeSlots VALUES (1000, '10:00');
INSERT INTO TimeSlots VALUES (1030, '10:30');
INSERT INTO TimeSlots VALUES (1100, '11:00');
INSERT INTO TimeSlots VALUES (1130, '11:30');
INSERT INTO TimeSlots VALUES (1200, '12:00');
INSERT INTO TimeSlots VALUES (1230, '12:30');
INSERT INTO TimeSlots VALUES (1300, '13:00');
INSERT INTO TimeSlots VALUES (1330, '13:30');
INSERT INTO TimeSlots VALUES (1400, '14:00');
INSERT INTO TimeSlots VALUES (1430, '14:30');
INSERT INTO TimeSlots VALUES (1500, '15:00');
INSERT INTO TimeSlots VALUES (1530, '15:30');
INSERT INTO TimeSlots VALUES (1600, '16:00');
INSERT INTO TimeSlots VALUES (1630, '16:30');
INSERT INTO TimeSlots VALUES (1700, '17:00');
INSERT INTO TimeSlots VALUES (1730, '17:30');
INSERT INTO TimeSlots VALUES (1800, '18:00');
INSERT INTO TimeSlots VALUES (1830, '18:30');
INSERT INTO TimeSlots VALUES (1900, '19:00');
INSERT INTO TimeSlots VALUES (1930, '19:30');
INSERT INTO TimeSlots VALUES (2000, '20:00');
INSERT INTO TimeSlots VALUES (2030, '20:30');
INSERT INTO TimeSlots VALUES (2100, '21:00');

INSERT INTO Shows VALUES (1, 1, 1, 8522, 930);
INSERT INTO Shows VALUES (2, 1, 1, 8622, 930);
INSERT INTO Shows VALUES (3, 1, 1, 8622, 1130);
INSERT INTO Shows VALUES (4, 1, 1, 8622, 1630);
INSERT INTO Shows VALUES (5, 1, 1, 8622, 2030); 
INSERT INTO Shows VALUES (6, 1, 1, 81222, 830);
INSERT INTO Shows VALUES (7, 1, 1, 81222, 1200);
INSERT INTO Shows VALUES (8, 1, 1, 81222, 1400);
INSERT INTO Shows VALUES (9, 1, 1, 81222, 1600);

INSERT INTO Shows VALUES (10, 1, 2, 81922, 1600);
INSERT INTO Shows VALUES (11, 1, 2, 81922, 1700);
INSERT INTO Shows VALUES (12, 1, 2, 82022, 930);
INSERT INTO Shows VALUES (13, 1, 2, 82022, 1030);
INSERT INTO Shows VALUES (14, 1, 2, 82022, 1200);
INSERT INTO Shows VALUES (15, 1, 2, 82422, 1000);
INSERT INTO Shows VALUES (16, 1, 2, 82422, 1600);
INSERT INTO Shows VALUES (17, 1, 2, 82422, 2100);

INSERT INTO Shows VALUES (18, 1, 3, 81522, 830);
INSERT INTO Shows VALUES (19, 1, 3, 81522, 1000);
INSERT INTO Shows VALUES (20, 1, 3, 81522, 1200);
INSERT INTO Shows VALUES (21, 1, 3, 81522, 1300);
INSERT INTO Shows VALUES (22, 1, 3, 81722, 1000);
INSERT INTO Shows VALUES (23, 1, 3, 81722, 1400);
INSERT INTO Shows VALUES (24, 1, 3, 81722, 1630);
INSERT INTO Shows VALUES (25, 1, 3, 81722, 1930);


INSERT INTO Shows VALUES (26, 2, 3, 81522, 1400);
INSERT INTO Shows VALUES (27, 2, 3, 81522, 1800);
INSERT INTO Shows VALUES (28, 2, 3, 81522, 2000);
INSERT INTO Shows VALUES (29, 2, 3, 81922, 1230);
INSERT INTO Shows VALUES (30, 2, 3, 81922, 1530);
INSERT INTO Shows VALUES (31, 2, 3, 81922, 1700);

INSERT INTO Shows VALUES (32, 2, 4, 8222, 830);
INSERT INTO Shows VALUES (33, 2, 4, 8222, 1230);
INSERT INTO Shows VALUES (34, 2, 4, 8222, 1400);

INSERT INTO Shows VALUES (35, 2, 5, 82922, 2100);
INSERT INTO Shows VALUES (36, 2, 5, 83022, 1230);
INSERT INTO Shows VALUES (37, 2, 5, 83022, 1530);
INSERT INTO Shows VALUES (38, 2, 5, 83022, 1900);


INSERT INTO Shows VALUES (39, 3, 2, 81922, 1030);
INSERT INTO Shows VALUES (40, 3, 2, 81922, 1430);
INSERT INTO Shows VALUES (41, 3, 2, 82022, 1230);
INSERT INTO Shows VALUES (42, 3, 2, 82022, 1430);
INSERT INTO Shows VALUES (43, 3, 2, 82022, 1700);
INSERT INTO Shows VALUES (44, 3, 2, 82322, 830);
INSERT INTO Shows VALUES (45, 3, 2, 82322, 1030);
INSERT INTO Shows VALUES (46, 3, 2, 82322, 1430);
INSERT INTO Shows VALUES (47, 3, 2, 82422, 1300);
INSERT INTO Shows VALUES (48, 3, 2, 82422, 1500);

INSERT INTO Shows VALUES (49, 3, 4, 8222, 830);
INSERT INTO Shows VALUES (50, 3, 4, 8222, 1230);
INSERT INTO Shows VALUES (51, 3, 4, 8222, 1430);
INSERT INTO Shows VALUES (52, 3, 4, 8322, 930);
INSERT INTO Shows VALUES (53, 3, 4, 8322, 1030);
INSERT INTO Shows VALUES (54, 3, 4, 81522, 930);
INSERT INTO Shows VALUES (55, 3, 4, 81522, 1100);
INSERT INTO Shows VALUES (56, 3, 4, 81522, 1430);
INSERT INTO Shows VALUES (57, 3, 4, 81622, 1530);
INSERT INTO Shows VALUES (58, 3, 4, 82222, 1230);

INSERT INTO Shows VALUES (59, 3, 5, 82822, 900);
INSERT INTO Shows VALUES (60, 3, 5, 82822, 1030);
INSERT INTO Shows VALUES (61, 3, 5, 82822, 1230);
INSERT INTO Shows VALUES (62, 3, 5, 82922, 1800);
INSERT INTO Shows VALUES (63, 3, 5, 83022, 1030);
INSERT INTO Shows VALUES (64, 3, 5, 83022, 1230);
INSERT INTO Shows VALUES (65, 3, 5, 83022, 1400);
INSERT INTO Shows VALUES (67, 3, 5, 83022, 1530);
INSERT INTO Shows VALUES (68, 3, 5, 83022, 2030);


INSERT INTO Shows VALUES (69, 4, 1, 8522, 930);
INSERT INTO Shows VALUES (70, 4, 1, 8622, 930);
INSERT INTO Shows VALUES (71, 4, 1, 8622, 1130);
INSERT INTO Shows VALUES (72, 4, 1, 8622, 1630);
INSERT INTO Shows VALUES (73, 4, 1, 8622, 1800);
INSERT INTO Shows VALUES (74, 4, 1, 8622, 2030);
INSERT INTO Shows VALUES (75, 4, 1, 81222, 930);
INSERT INTO Shows VALUES (76, 4, 1, 81222, 1200);
INSERT INTO Shows VALUES (77, 4, 1, 81222, 1400);
INSERT INTO Shows VALUES (78, 4, 1, 81422, 1000);
INSERT INTO Shows VALUES (79, 4, 1, 81422, 2100);

INSERT INTO Shows VALUES (80, 4, 2, 81922, 1030);
INSERT INTO Shows VALUES (81, 4, 2, 81922, 1430);
INSERT INTO Shows VALUES (82, 4, 2, 82022, 830);
INSERT INTO Shows VALUES (83, 4, 2, 82022, 930);
INSERT INTO Shows VALUES (84, 4, 2, 82122, 1200);
INSERT INTO Shows VALUES (85, 4, 2, 82122, 1400);
INSERT INTO Shows VALUES (86, 4, 2, 82122, 1700);
INSERT INTO Shows VALUES (87, 4, 2, 82122, 1830);
INSERT INTO Shows VALUES (88, 4, 2, 82322, 1000);
INSERT INTO Shows VALUES (89, 4, 2, 82322, 1100);
INSERT INTO Shows VALUES (90, 4, 2, 82322, 1230);
INSERT INTO Shows VALUES (91, 4, 2, 82422, 1530);
INSERT INTO Shows VALUES (92, 4, 2, 82422, 1930);
INSERT INTO Shows VALUES (93, 4, 2, 82422, 2030);
INSERT INTO Shows VALUES (94, 4, 2, 82522, 1730);

INSERT INTO Shows VALUES (95, 4, 3, 81522, 1000);
INSERT INTO Shows VALUES (96, 4, 3, 81522, 1230);
INSERT INTO Shows VALUES (97, 4, 3, 81522, 1300);
INSERT INTO Shows VALUES (98, 4, 3, 81522, 1630);
INSERT INTO Shows VALUES (99, 4, 3, 81522, 2030);
INSERT INTO Shows VALUES (100, 4, 3, 81722, 930);
INSERT INTO Shows VALUES (101, 4, 3, 81722, 1000);
INSERT INTO Shows VALUES (102, 4, 3, 81722, 1100);
INSERT INTO Shows VALUES (103, 4, 3, 81922, 1530);
INSERT INTO Shows VALUES (104, 4, 3, 81922, 1800);
INSERT INTO Shows VALUES (105, 4, 3, 81922, 1930);
INSERT INTO Shows VALUES (106, 4, 3, 82022, 1530);
INSERT INTO Shows VALUES (107, 4, 3, 82022, 1700);

INSERT INTO Shows VALUES (108, 4, 4, 8222, 1130);
INSERT INTO Shows VALUES (109, 4, 4, 8322, 1230);
INSERT INTO Shows VALUES (110, 4, 4, 81522, 1000);
INSERT INTO Shows VALUES (111, 4, 4, 81622, 1700);


INSERT INTO Shows VALUES (112, 5, 1, 8622, 1000);
INSERT INTO Shows VALUES (113, 5, 1, 8622, 1200);
INSERT INTO Shows VALUES (114, 5, 1, 8622, 1400);
INSERT INTO Shows VALUES (115, 5, 1, 8622, 1730);
INSERT INTO Shows VALUES (116, 5, 1, 8622, 2100);
INSERT INTO Shows VALUES (117, 5, 1, 81222, 1030);
INSERT INTO Shows VALUES (118, 5, 1, 81222, 1230);
INSERT INTO Shows VALUES (119, 5, 1, 81222, 1330);
INSERT INTO Shows VALUES (120, 5, 1, 81322, 1430);
INSERT INTO Shows VALUES (121, 5, 1, 81322, 1800);
INSERT INTO Shows VALUES (122, 5, 1, 81322, 1930);
INSERT INTO Shows VALUES (123, 5, 1, 81322, 2030);

INSERT INTO Shows VALUES (124, 5, 3, 81522, 830);
INSERT INTO Shows VALUES (125, 5, 3, 81522, 930);
INSERT INTO Shows VALUES (126, 5, 3, 81522, 1030);
INSERT INTO Shows VALUES (127, 5, 3, 81522, 1600);
INSERT INTO Shows VALUES (128, 5, 3, 81522, 1900);
INSERT INTO Shows VALUES (129, 5, 3, 81522, 2030);
INSERT INTO Shows VALUES (130, 5, 3, 81722, 900);
INSERT INTO Shows VALUES (131, 5, 3, 81722, 1100);
INSERT INTO Shows VALUES (132, 5, 3, 81722, 1300);
INSERT INTO Shows VALUES (133, 5, 3, 81922, 930);
INSERT INTO Shows VALUES (134, 5, 3, 81922, 1030);
INSERT INTO Shows VALUES (135, 5, 3, 81922, 1500);
INSERT INTO Shows VALUES (136, 5, 3, 81922, 2000);

INSERT INTO Shows VALUES (137, 5, 4, 8222, 830);
INSERT INTO Shows VALUES (138, 5, 4, 8222, 900);
INSERT INTO Shows VALUES (139, 5, 4, 8222, 1230);
INSERT INTO Shows VALUES (140, 5, 4, 8222, 1330);
INSERT INTO Shows VALUES (141, 5, 4, 8322, 2000);
INSERT INTO Shows VALUES (142, 5, 4, 8322, 2100);
INSERT INTO Shows VALUES (143, 5, 4, 81522, 1000);
INSERT INTO Shows VALUES (144, 5, 4, 81522, 1200);
INSERT INTO Shows VALUES (145, 5, 4, 81522, 1400);
INSERT INTO Shows VALUES (146, 5, 4, 81622, 900);
INSERT INTO Shows VALUES (147, 5, 4, 82222, 1030);
INSERT INTO Shows VALUES (148, 5, 4, 82222, 1530);
INSERT INTO Shows VALUES (149, 5, 4, 82222, 1700);


INSERT INTO Shows VALUES (150, 6, 2, 81222, 900);
INSERT INTO Shows VALUES (151, 6, 2, 81222, 1100);
INSERT INTO Shows VALUES (152, 6, 2, 81222, 1200);
INSERT INTO Shows VALUES (153, 6, 2, 81322, 1330);
INSERT INTO Shows VALUES (154, 6, 2, 81322, 1700);
INSERT INTO Shows VALUES (155, 6, 2, 81322, 1900);
INSERT INTO Shows VALUES (156, 6, 2, 81622, 900);
INSERT INTO Shows VALUES (157, 6, 2, 81622, 1200);
INSERT INTO Shows VALUES (158, 6, 2, 81622, 1430);
INSERT INTO Shows VALUES (159, 6, 2, 81622, 1700);

INSERT INTO Shows VALUES (160, 6, 5, 8222, 1200);
INSERT INTO Shows VALUES (161, 6, 5, 8222, 1500);
INSERT INTO Shows VALUES (162, 6, 5, 8222, 1700);
INSERT INTO Shows VALUES (163, 6, 5, 8622, 1000);
INSERT INTO Shows VALUES (164, 6, 5, 8622, 1200);
INSERT INTO Shows VALUES (165, 6, 5, 8622, 1430);
INSERT INTO Shows VALUES (166, 6, 5, 8622, 1800);
INSERT INTO Shows VALUES (167, 6, 5, 81122, 1000);
INSERT INTO Shows VALUES (168, 6, 5, 81122, 1200);
INSERT INTO Shows VALUES (169, 6, 5, 81122, 1330);
INSERT INTO Shows VALUES (170, 6, 5, 81122, 1630);


INSERT INTO Shows VALUES (171, 7, 1, 81522, 900);
INSERT INTO Shows VALUES (172, 7, 1, 81522, 1030);
INSERT INTO Shows VALUES (173, 7, 1, 81522, 1100);
INSERT INTO Shows VALUES (174, 7, 1, 81522, 1500);
INSERT INTO Shows VALUES (175, 7, 1, 81922, 1100);
INSERT INTO Shows VALUES (176, 7, 1, 81922, 1300);
INSERT INTO Shows VALUES (177, 7, 1, 81922, 1700);
INSERT INTO Shows VALUES (178, 7, 1, 82222, 1500);
INSERT INTO Shows VALUES (179, 7, 1, 82222, 1700);
INSERT INTO Shows VALUES (180, 7, 1, 82222, 1930);

INSERT INTO Shows VALUES (181, 7, 3, 82522, 1130);
INSERT INTO Shows VALUES (182, 7, 3, 82522, 1330);
INSERT INTO Shows VALUES (183, 7, 3, 82522, 1900);
INSERT INTO Shows VALUES (184, 7, 3, 82522, 2030);
INSERT INTO Shows VALUES (185, 7, 3, 82622, 1230);
INSERT INTO Shows VALUES (186, 7, 3, 82622, 1400);
INSERT INTO Shows VALUES (187, 7, 3, 82622, 1730);
INSERT INTO Shows VALUES (188, 7, 3, 82622, 1900);

INSERT INTO Shows VALUES (189, 7, 4, 82322, 1130);
INSERT INTO Shows VALUES (190, 7, 4, 82322, 1400);
INSERT INTO Shows VALUES (191, 7, 4, 82322, 1630);

INSERT INTO Shows VALUES (192, 7, 5, 82822, 1030);
INSERT INTO Shows VALUES (193, 7, 5, 82822, 1200);
INSERT INTO Shows VALUES (194, 7, 5, 82822, 1330);
INSERT INTO Shows VALUES (195, 7, 5, 82922, 1000);
INSERT INTO Shows VALUES (196, 7, 5, 82922, 1530);
INSERT INTO Shows VALUES (197, 7, 5, 82922, 1600);
INSERT INTO Shows VALUES (198, 7, 5, 83022, 1700);
INSERT INTO Shows VALUES (199, 7, 5, 83022, 2100);

INSERT INTO Shows VALUES (200, 8, 2, 81222, 900);
INSERT INTO Shows VALUES (201, 8, 2, 81222, 1130);
INSERT INTO Shows VALUES (202, 8, 2, 81222, 1400);
INSERT INTO Shows VALUES (203, 8, 2, 81522, 1030);
INSERT INTO Shows VALUES (204, 8, 2, 81522, 1230);
INSERT INTO Shows VALUES (205, 8, 2, 81522, 1730);
INSERT INTO Shows VALUES (206, 8, 2, 81722, 1600);
INSERT INTO Shows VALUES (207, 8, 2, 81722, 1700);
INSERT INTO Shows VALUES (208, 8, 2, 81722, 2100);

INSERT INTO Shows VALUES (209, 8, 3, 8222, 930);
INSERT INTO Shows VALUES (210, 8, 3, 8222, 1000);
INSERT INTO Shows VALUES (211, 8, 3, 8222, 1230);
INSERT INTO Shows VALUES (212, 8, 3, 8722, 1100);
INSERT INTO Shows VALUES (213, 8, 3, 8722, 1330);
INSERT INTO Shows VALUES (214, 8, 3, 8722, 1500);
INSERT INTO Shows VALUES (215, 8, 3, 8722, 1630);
INSERT INTO Shows VALUES (216, 8, 3, 8722, 1900);
INSERT INTO Shows VALUES (217, 8, 3, 8822, 1130);
INSERT INTO Shows VALUES (218, 8, 3, 8822, 1300);
INSERT INTO Shows VALUES (219, 8, 3, 8822, 2000);

INSERT INTO Shows VALUES (220, 8, 4, 81722, 900);
INSERT INTO Shows VALUES (221, 8, 4, 81722, 1000);
INSERT INTO Shows VALUES (222, 8, 4, 81722, 1100);
INSERT INTO Shows VALUES (223, 8, 4, 81922, 1300);
INSERT INTO Shows VALUES (224, 8, 4, 81922, 1430);
INSERT INTO Shows VALUES (225, 8, 4, 82122, 1130);
INSERT INTO Shows VALUES (226, 8, 4, 82122, 1330);
INSERT INTO Shows VALUES (227, 8, 4, 82122, 1600);
INSERT INTO Shows VALUES (228, 8, 4, 82222, 1300);
INSERT INTO Shows VALUES (229, 8, 4, 82222, 1500);
INSERT INTO Shows VALUES (230, 8, 4, 82222, 2000);



INSERT INTO Shows VALUES (231, 9, 1, 81522, 830);
INSERT INTO Shows VALUES (232, 9, 1, 81522, 900);
INSERT INTO Shows VALUES (233, 9, 1, 81522, 1030);
INSERT INTO Shows VALUES (234, 9, 1, 81622, 1300);
INSERT INTO Shows VALUES (235, 9, 1, 81622, 1730);
INSERT INTO Shows VALUES (236, 9, 1, 81622, 1800);
INSERT INTO Shows VALUES (237, 9, 1, 81622, 1930);
INSERT INTO Shows VALUES (238, 9, 1, 81722, 1000);
INSERT INTO Shows VALUES (239, 9, 1, 81722, 1130);
INSERT INTO Shows VALUES (240, 9, 1, 81722, 1230);
INSERT INTO Shows VALUES (241, 9, 1, 81822, 1300);
INSERT INTO Shows VALUES (242, 9, 1, 81822, 1430);
INSERT INTO Shows VALUES (243, 9, 1, 81822, 1530);
INSERT INTO Shows VALUES (244, 9, 1, 81922, 1100);
INSERT INTO Shows VALUES (245, 9, 1, 81922, 1200);
INSERT INTO Shows VALUES (246, 9, 1, 81922, 1400);
INSERT INTO Shows VALUES (247, 9, 1, 82022, 1800);

INSERT INTO Shows VALUES (248, 9, 5, 82122, 1200);
INSERT INTO Shows VALUES (249, 9, 5, 82122, 1230);
INSERT INTO Shows VALUES (250, 9, 5, 82122, 1400);
INSERT INTO Shows VALUES (251, 9, 5, 82222, 1100);
INSERT INTO Shows VALUES (252, 9, 5, 82222, 1200);
INSERT INTO Shows VALUES (253, 9, 5, 82222, 1330);
INSERT INTO Shows VALUES (254, 9, 5, 82422, 1030);
INSERT INTO Shows VALUES (255, 9, 5, 82422, 1200);
INSERT INTO Shows VALUES (256, 9, 5, 82422, 1430);
INSERT INTO Shows VALUES (257, 9, 5, 82522, 1230);
INSERT INTO Shows VALUES (258, 9, 5, 82522, 1500);
INSERT INTO Shows VALUES (259, 9, 5, 82522, 1730);
INSERT INTO Shows VALUES (260, 9, 5, 82522, 1900);



INSERT INTO Shows VALUES (261, 10, 1, 82922, 900);
INSERT INTO Shows VALUES (262, 10, 1, 82922, 1030);
INSERT INTO Shows VALUES (263, 10, 1, 82922, 1800);
INSERT INTO Shows VALUES (264, 10, 1, 83022, 1500);
INSERT INTO Shows VALUES (265, 10, 1, 83022, 1730);

INSERT INTO Shows VALUES (266, 10, 2, 81122, 1030);
INSERT INTO Shows VALUES (267, 10, 2, 81122, 1230);
INSERT INTO Shows VALUES (268, 10, 2, 81122, 1330);
INSERT INTO Shows VALUES (269, 10, 2, 81222, 1100);
INSERT INTO Shows VALUES (270, 10, 2, 81222, 1400);
INSERT INTO Shows VALUES (271, 10, 2, 81222, 1900);

INSERT INTO Shows VALUES (272, 10, 3, 8922, 1100);
INSERT INTO Shows VALUES (273, 10, 3, 8922, 1230);
INSERT INTO Shows VALUES (274, 10, 3, 8922, 1300);
INSERT INTO Shows VALUES (275, 10, 3, 81022, 1130);
INSERT INTO Shows VALUES (276, 10, 3, 81022, 1230);
INSERT INTO Shows VALUES (277, 10, 3, 81022, 1500);
INSERT INTO Shows VALUES (278, 10, 3, 81122, 1100);
INSERT INTO Shows VALUES (279, 10, 3, 81122, 1230);
INSERT INTO Shows VALUES (280, 10, 3, 81122, 1330);
INSERT INTO Shows VALUES (281, 10, 3, 81222, 1730);

INSERT INTO Shows VALUES (282, 10, 4, 8522, 1100);
INSERT INTO Shows VALUES (283, 10, 4, 8522, 1230);
INSERT INTO Shows VALUES (284, 10, 4, 8522, 1330);
INSERT INTO Shows VALUES (285, 10, 4, 8622, 900);
INSERT INTO Shows VALUES (286, 10, 4, 8622, 1200);
INSERT INTO Shows VALUES (287, 10, 4, 8622, 1330);

INSERT INTO Shows VALUES (288, 10, 5, 82322, 900);
INSERT INTO Shows VALUES (289, 10, 5, 82322, 1030);
INSERT INTO Shows VALUES (290, 10, 5, 82322, 1400);
INSERT INTO Shows VALUES (291, 10, 5, 82722, 1000);
INSERT INTO Shows VALUES (292, 10, 5, 82722, 1230);
INSERT INTO Shows VALUES (293, 10, 5, 82722, 1500);
INSERT INTO Shows VALUES (294, 10, 5, 82722, 1930);

