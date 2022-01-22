
select * from tab;	-- 테이블 목록
select * from seq;	-- 시퀀스 목록
select * from customer;
desc customer;	-- 테이블의 컬럼, 구조 출력(이클립스에서 작동이 안될수도 있음)
-- 안될시 cmd에서 출력

delete from customer;	-- 테이블의 데이터 삭제
drop sequence customer_no_seq;


-- 예1.
-- primary key(기본키) : 반드시 중복되지 않는 값을 저장 해야된다는 의미
create table customer( 
				no number(4)  primary key, 
		        name varchar2(20),
		       	email varchar2(20),
		       	tel varchar2(20));


alter table customer add(address varchar2(50));	-- 컬럼 추가
alter table customer add(reg_date timestamp);	-- 컬럼 추가

create sequence customer_no_seq	-- 번호 자동으로 증가
	start with 1	-- 1부터 시작
	increment by 1;	-- 1씩 증가
	nocache; -- 숫자 증가시 점핑이 되는 경우가 있는데 점핑을 막아줌
	-- 1씩 제대로 증가
	
	
-- 예4.
create table member(name varchar2(20),
		    gender varchar2(10),
		    jumin1 varchar2(6),
            jumin2 varchar2(7),
		    address varchar2(100),
		    buseo  varchar2(20),
            sports varchar2(20),
            music varchar2(20),
            movie varchar2(20),
		    computer varchar2(20),
		    intro varchar2(1000)
		  );

select * from member;		

-- 예5.
create  table  mem02(id  varchar2(20)  primary key,
		  passwd  varchar2(20),
		  name  varchar2(20),
		  reg_date  date);
		  
select * from mem02;


-- 게시판

create table board(
	no number primary key,
	writer varchar2(20) not null,
    passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );

create sequence board_seq
	start with 1
	increment by 1;
--	nocache;

--글작성 : Insertboard.java
--글목록 : Selectboard.java
--글수정 : Updateboard.java
--글삭제 : Deleteboard.java

select * from tab;
select * from board;
select * from seq;

		  