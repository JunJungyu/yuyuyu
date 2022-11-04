drop database if exists jspweb;
create database jspweb;
use jspweb;

drop table if exists porder;
create table porder(
	ono int , -- 주문번호
    oname varchar(100) , -- 받는사람 성명
	ophon varchar(100) , -- 받는사람 연락처
    oaddress varchar(100) , -- 받는사람 주소
    orequest varchar(100) , -- 주문 요청사항
    odate datetime default now() , -- 주문 날짜
    mno int ,-- 회원 번호 [ 주문한 사람 ]  
	constraint orderno_pk primary key (orderno) , 
    constraint orderno_mno_fk foreign key (mno) references member(mno)
);
select * from porder;

drop table if exists porderdetail;
create table porderdetail(
	odno int auto_increment , -- 주문상세번호
    odamount int , -- 재고번호
    odprice int , -- 수량
    odactive int , -- 주문액 [ 결제변동가능성때매? ]
    pstno int ,  -- 주문상태
    pstno int ,  -- 재고번호
    ono int ,  -- 주문번호
    constraint odno_pk primary key (odno) ,
    constraint od_pstno_fk foreign key (pstno) references productstock (pstno) ,
    constraint od_ono_fk foreign key (ono) references porder (ono)
);
select * from porderdetail;

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
select * from member;

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
select * from board order by bdate desc;
update board set bview=bview+100;
select * from board where bcontent='_첫번째_';

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
	pcno 		int auto_increment,	-- 카테고리 번호
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
	psno int auto_increment ,		-- 사이즈 식별 번호
    psize varchar(100) ,			-- 사이즈명
    pno int ,						-- 제춤번호?
    constraint psno_pk primary key ( psno ) ,
    constraint pno_fk foreign key ( pno ) references product ( pno )
);
select * from productsize;

-- 사이즈별 색상재고 테이블 : 사이즈별 [psno] 색상 [pcolor] 재고[pstick] 저장
drop table if exists productstock;
create table productstock(
	pstno int auto_increment ,		-- 재고식별번호
    pcolor varchar(100) ,			-- 제품 컬러
    pstock int ,					-- 제품재고
    psno int ,						-- 사이즈 식별번호
    constraint pstno_pk primary key ( pstno ) ,
    constraint psno_fk foreign key ( psno ) references productsize ( psno )
);
select * from productstock;

select  psize , pcolor , pstock from productstock , productsize;

-- 제품 재고 등록 sql 
insert into productsize( psize , pno ) values( ? , ? );
-- 색상재고 등록
insert into productctock( pcolor , pstock , psno ) values ( ? ,? , ? );
-- 제품별 재고 출력

-- 별칭 productsize -> ps 별칭 productstock -> pst
select ps.psno , ps.psize , pst.pstno , pst.pcolor , pst.pstock
from productsize ps, productstock pst 
where ps.psno = pst.psno order by ps.psize desc;

select ps.psno , ps.psize , pst.pstno , pst.pcolor , pst.pstock
from productsize ps, productstock pst
where ps.psno = pst.psno and ps.pno = 5 order by ps.psize desc;

select  psize , pcolor , pstock from productstock , productsize;

-- where ps.psno = pst.psno 이걸 안쓰면 테이블이 두개라 중복돼서 여러개 나옴! 

drop table if exists plike;
create table plike(	-- sns <!---> 친추
	plikeno	int auto_increment ,
    mno int ,
    pno int ,
    constraint plike_pk primary key (plikeno) ,
    constraint plike_mno_pk foreign key (mno) references member (mno) ,
    constraint plike_pno_pk foreign key (pno) references product (pno)
);
select * from plike;

drop table if exists cart;
create table cart(
	cartno int auto_increment primary key,	-- 식별번호
	amount int ,				-- 옵션 (개수)
    pstno int ,					-- 재고정보 / 재고번호만 가져오면 사이즈, 색상, 재고 다 넘어오기 때문에 하나만 가져와도 됨
	mno int ,					-- 회원번호
	constraint pstno_fk foreign key (pstno) references productstock (pstno) ,
    constraint mno foreign key (mno) references member (mno)
);
select * from cart;

delete from plike where pno = 1 and mno = 1;
insert into plike ( pno , mno ) values( 3 , 4 );

-- 1. 재고번호 찾기 [ join ]
select * from productstock;		-- 재고 테이블 선택
select * from productstock where pno = 4;		-- 재고에는 pno가 없다.
select * from productsize where pno = 4;
select * from productsize where pno = 4 and psize = '20';
select * from productsize ps , productstock pst where ps.psno = pst.psno;	-- 두개 이상 테이블 검색
select * from productsize ps , productstock pst
where ps.psno = pst.psno and pno = 4 and psize='20' and pcolor='green';

-- 1. 서브쿼리 [ select 안에 select ]
select pstno from productsize where pno = 4 and psize = 20;
select pstno
from productstock pst , (select pstno from productsize where pno = 4 and psize = 20) sub
where pst.psno = sub.psno and pcolor = 'green';

-- --------------------
insert into cart( amount , pstno , mno)
values( 1 , (select psno
from productstock pst , (select pstno from productsize where pno = 4 and psize = 20) sub
where pst.psno = sub.psno and pcolor = 'green') , 3 );

select * from cart;

-- ------------------------
-- 로그인된 회원의 장바구니 호출 [ mno -> 재고번호 , 제품명 , 재고사진 , 가격 , 할인율 , 선택한옵션색상/사이즈/수량 ]
select * from cart where mno = 4; 	-- 회원 장바구니
select * from cart c , productstock pst where c.pstno = pst.pstno = pst.pstno;	-- 카트 + 재고
select * from cart c , productstock pst , productsize ps
where c.pstno = pst.pstno and pst.psno = ps.psno;		-- 카트 + 재고 + 사이즈

-- joion [ 관계[pk-fk]있을경우에 2개 이상 테이블의 동일한 데이터 ]
-- 1. 테이블명 inner JOIN 테이블명 on pk필드 = fk필드
-- 2. 테이블명 ㅕnatural join 테이블명 [ 암묵적으로 pk와  fk를 조건으로 사용 ]

select
	c.cartno as 장바구니번호 ,c.pstno as 재고번호 ,
    p.pname as 제품명 , p.pimg as 제품사진 ,
    p.pprice as 가격 , p.pdiscount as 할인율 ,
    pst.pcolor 색상 , ps.psize as 사이즈 , c.amount as 구매예정수량 
from-- 테이블에서 별칭 사용 시 띄어쓰기 아님 as 명시적으로 써주거나
	cart c , productstock pst , 
	productsize ps , product p
where c.pstno = pst.pstno 
	and pst.psno = ps.psno 
    and ps.pno = p.pno;	-- 카트 + 재고 + 사이즈 + 제품



select
	c.cartno ,c.pstno ,
    p.pname , p.pimg ,
    p.pprice , p.pdiscount ,
    pst.pcolor , ps.psize , c.amount 
from
	cart c natural join productstock pst natural join 
	productsize ps natural join product p 
where c.mno = 4;
