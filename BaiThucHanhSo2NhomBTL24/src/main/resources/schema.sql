use BTH2;
create table if not exists products (
id bigint NOT NULL AUTO_INCREMENT,
code nvarchar(50) not null,
description nvarchar(200) not null,
price double not null,
PRIMARY KEY (id)
);