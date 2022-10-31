drop database if exists jspweb;
create database jspweb;
use jspweb;
create table member(
	mno			int auto_increment primary key ,		-- 회원번호[pk , autokey ] 
	mid			varchar(50) , 							-- 회원아이디 
    mpassword	varchar(50) , 							-- 회원패스워드 
    mname		varchar(50) , 							-- 회원명
    mphone		varchar(15) , 							-- 회원 전화번호 
    memail		varchar(100) , 							-- 회원 이메일 
    maddress	varchar(100) ,							-- 회원 주소 [ 우편번호,도로명주소,지번주소,상세주소]
    mdate		datetime default now() ,				-- 회원 가입일 
	mpoint		int	default 0							-- 회원 포인트 
);

drop table if exists bcategory;
create table bcategory(
	cno int auto_increment primary key,
    cname varchar(100)
);

select * from bcategory;

drop table if exists board;
create table board(
	bno	int auto_increment primary key ,	-- 글번호
    btitle varchar(1000) ,					-- 제목
    bcontent longtext ,						-- 내용 [  ]
    bfile longtext ,						-- 파일
    bdate datetime default now() ,			-- 작성일
    bview int default 0 ,					-- 조회수
    cno int ,								-- 카테고리번호 fk
    mno int , 								-- 작성자
    constraint bcno_fk foreign key (cno) references bcategory(cno) ,
	constraint bmno_fk foreign key (mno) references member(mno)
);
select * from board;

-- 1. 두개 이상의 테이블 검색 [ 1번 테이블 레코드수 * 2번테이블 레코드 수 ]
select * from member board;

-- 2. 조건 [ pk와 fk가 일치한 경우만 표시 ]
select * from member , board where member.mno = board.mno;

-- 3. 조건 필드 검색 별칭 지어준거임~
select b.bno , b.btitle , b.bcontent , b.bfile , b.bdate , b.bview , b.cno , b.mno , m.mid from member m , board b where m.mno = b.mno;

-- 4. 모든 글 출력
select * from member m , board b where m.mno = b.mno;

-- 5. 개별 글 출력
select * from member m , board b where m.mno = b.mno and bno = ?;

-- default 레코드 추가시 기본으로 들어가는 값 설정 
-- datetime default now() : 현재 시스템(DB)의 자동날짜

-- insert 문법
	-- 특정필드만 삽입 :  insert into 테이블명( 필드명 , 필드명 , 필드명 ) values( 값1, 값2 , 값3 );
	-- 모든필드 삽입 :   insert into 테이블명 values( 값1, 값2, 값3 );

select * from member;

	-- 존재하면 레코드 1개 검색 
	-- 존재하지 않으면 레코드 x 
select * from member;

drop table if exists pcategory;
create table pcategory(	-- 제품 카테고리 테이블
	pcno 		int auto_increment,				-- 카테고리 번호
    pcname		varchar(100) ,		-- 카테고리 이름
    constraint pcno_pk primary key( pcno )
);
select * from pcategory;

select pcname from pcategory;

drop table if exists product;
create table product( -- 제품 테이블
	pno	int auto_increment ,					-- 제품번호 		
    pname	varchar(100) , 						-- 제품가격
    pcoment varchar(1000) ,						-- 제품설명
    pprice	int unsigned ,						-- 제품가격 +-20억
    pdiscount float ,							-- 제품할인율
    pactive	tinyint default 0 ,							-- 제품상태
    pimg varchar(1000) ,						-- 제품이미지	
    pdate datetime default now() ,							-- 등록날짜		
    pcno int ,									-- 제품 카테고리의 fk
    constraint pno_pk primary key ( pno ) ,
    constraint pcno_fk foreign key ( pcno ) references pcategory( pcno )
);
select * from  product;

/* 제품별 사이즈 테이블 : 제품별[pno] 사이즈[psize] 저장 */
drop table if exists productsize;
create table productsize(
	psno int auto_increment ,
    psize varchar(100) ,
    pno int ,
    constraint psno_pk primary key ( psno ) ,
    constraint pno_fk foreign key ( pno ) references product ( pno )
);
select * from productsize;

-- 사이즈별 색상재고 테이블 : 사이즈별 [psno] 색상 [pcolor] 재고[pstick] 저장
drop table if exists productstock;
create table productstock(
	pstno int auto_increment ,
    pcolor varchar(100) ,
    pstock int ,
    psno int ,
    constraint pstno_pk primary key ( pstno ) ,
    constraint psno_fk foreign key ( psno ) references productsize ( psno )
);
select * from productstock;

-- 제품 재고 등록 sql 
insert into productsize( psize , pno ) values( ? , ? );
-- 색상재고 등록
insert into productctock( pcolor , pstock , psno ) values ( ? ,? , ? );
-- 제품별 재고 출력

select ps.psno , ps.psize , pst.pstno , pst.pcolor , pst.pstock
from productsize ps, productstock pst -- 별칭 productsize -> ps 별칭 productstock -> pst
where ps.psno = pst.psno order by ps.psize desc;
