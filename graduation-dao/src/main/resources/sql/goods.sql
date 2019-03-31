create table goods
(
    goodsId char(32),
    goodsName varchar(30) not null,
    salerId char(32) not null,
    goodsPrice double(10,2) not null,
    goodstypeId char(32) not null,
    produceDate date,
    qualityPeriod int not null,
    goodsImage varchar(30) not null,
    goodsDescription varchar(200) not null,
    primary key(goodsId),
    foreign key (salerId) references user(userId),
    foreign key (goodstypeId) references goodstype(goodstypeId)
)