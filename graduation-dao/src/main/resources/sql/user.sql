create table user
(
   userId char(30) comment '用户id',
   userName varchar(30) not null comment '用户姓名',
   userPhone varchar(11) unique  comment '用户电话',
   userEmail varchar(30) unique not null comment '用户邮箱',
   userPassword varchar(50) not null comment '用户密码',
   userImage varchar(50) not null comment '用户头像地址',
   userType int not null comment '用户身份 1代表普通用户，2代表商家  3代表管理员',
   userAccount double(10,2) not null comment '账户余额',
   userAddress varchar(50) comment '用户地址 只有商家才有',
   primary key(userId)
)