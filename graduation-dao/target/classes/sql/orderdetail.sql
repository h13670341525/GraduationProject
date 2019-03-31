create table orderdetail
(
    orderdetailId char(32),
    orderId char(32) not null,
    goodsId char(32) not null,
    goodsNum int not null,
    primary key(orderdetailId),
    foreign key(orderId) references gorder(orderId),
    foreign key(goodsId) references goods(goodsId)
)