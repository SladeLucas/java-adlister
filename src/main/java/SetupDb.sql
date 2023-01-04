USE adlister_db;

        CREATE TABLE IF NOT EXISTS ads(
        id int UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
        user_id int UNSIGNED,
        title varchar(50),
        description varchar(255)
        );

        CREATE TABLE IF NOT EXISTS users(
        id int UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
        username varchar(50),
        email varchar(50),
        password varchar(50)
        );

        INSERT INTO users(username, email, password)
        VALUES
        ('lslade', 'lslade@gmail.com', 'oooo'),
        ('slade', 'slade@gmail.com', 'hkjh'),
        ('sslade', 'sslade@gmail.com', '999');

        INSERT INTO ads(id, user_id, title, description)
        VALUES
        (1, 1, 'Custom Website', 'Super custom super website.'),
        (2,1,'Hotdog Vendor', 'Getcha hot dawgs'),
        (3, 2, 'compute', 'computing'),
        (4, 3, 'logic', 'this makes sense');