create table goodstype
(
   goodstypeId char(32),
   goodstypeName varchar(30) not null unique,
   goodsbigtypeId char(32) not null,
   primary key(goodstypeId),
   foreign key(goodsbigtypeId) references goodsbigtype(goodstypeId)
)

create table goodsbigtype
(
   goodstypeId char(32),
   goodstypeName varchar(30) not null unique,
   goodsDescription varchar(20),
   goodstypeImage varchar(50) ,
   goodsTypeBackImage varchar(50),
   primary key(goodstypeId)
)