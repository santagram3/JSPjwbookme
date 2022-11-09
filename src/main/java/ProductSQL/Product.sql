

create table product (
	id varchar2(100) primary key ,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number(10) not null,
	regdate date not null
)

insert into product values('101','애플 사과폰 101','애플전자',1200000,'2020.12.12');
insert into product values('102','사과 애플폰 102','사과전자',1300000,'2020.12.13');
insert into product values('103','과자 삼성폰 103','삼상전자',1400000,'2020.12.14');

select * from product ;

