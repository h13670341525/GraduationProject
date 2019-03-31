create table goodstype
(
   goodstypeId char(32),
   goodstypeName varchar(30) not null unique,
   primary key(goodstypeId)
)