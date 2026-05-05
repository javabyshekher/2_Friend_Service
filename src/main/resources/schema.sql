CREATE TABLE IF NOT EXISTS friend (
    id int primary key auto_increment,
    phone_number long not null,
    friend_number long not null,
    friend_name varchar(50) not null
);