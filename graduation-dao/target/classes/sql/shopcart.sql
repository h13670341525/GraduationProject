create table shopcart
(
   shopcartId char(32),
   goodsId char(32),
   userId char(32),
   goodsNum int,
   primary key(shopcartId),
   foreign key (goodsId) references goods(goodsId),
   foreign key (userId) references user(userId)
)