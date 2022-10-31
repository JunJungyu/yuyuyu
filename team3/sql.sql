drop database if exists team3;
create database team3;
use team3;

drop table if exists emotion;
create table emotion(
	emo_no int auto_increment primary key,
    emotion varchar(20) , 
    emo_img longtext
);
select * from emotion;

drop table if exists diary;
create table diary(
	di_no int auto_increment primary key,	-- 이게 왜 안되지??
    di_date datetime default now() ,
    di_content text ,
    emo_no int ,
    constraint emo_no_fk foreign key (emo_no) references emotion (emo_no)
);
select * from diary;

drop table if exists calendar;
create table calendar(
	cal_no int auto_increment primary key ,
    emo_no int ,
    foreign key (emo_no) references emotion (emo_no)
);
select * from calendar;

drop table if exists member;
create table member(
	mno int auto_increment primary key,			-- 회원번호
    mid varchar(20) ,							-- 아이디
    mpassword varchar(50) ,						-- 비밀번호
    mnickname varchar(15) not null ,						-- 닉네임
    mfriendsno int default 0					-- 고유 mno 연결..
);
select * from member;

drop table if exists board;
create table board(
	bno int auto_increment primary key ,		-- 게시물 식별번호
    btitle varchar(50) ,						-- 게시물 제목
    bcontent varchar(1000) ,					-- 게시물 내용
    bfile longtext , 							-- 게시물 첨부파일
    bdate datetime default now() ,				-- 게시물 작성일
    bview int default 0
);
select * from board;

drop table if exists coment;
create table coment(
	bno int ,									-- 어떤 글인지 식별
    bcoment varchar(100) ,						-- 댓글 / a가 쓴 1번글이랑 b가 쓴 1번 글이랑 구별이 가능한가? 뭔가 추가해주어야하나?
    cdate datetime default now()				-- 댓글작성시간
);
select * from coment;

create table music(
	muno int auto_increment primary key ,		-- 노래 식별번호
    muname varchar (30)	,						-- 노래 몇개 넣어두고 사용자는 넘버만 받아서 사용..
    muuserno int ,								-- 가지고 있는 사용자 번호
    mufile longtext								-- 노래파일 저장
);
select * from music;

