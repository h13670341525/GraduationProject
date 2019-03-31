create table gorder
(
    orderId char(32),
    customerId char(32) not null,
    orderTime datetime not null,
    primary key(orderId),
    foreign key(customerId) references user(userId)
)