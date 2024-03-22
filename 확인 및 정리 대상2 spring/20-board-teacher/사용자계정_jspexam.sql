create table board2 (
	board_num number,						-- �۹�ȣ
	board_name varchar2(20) not null,		-- ���ۼ���
	board_pass varchar2(15) not null,		-- �ۺ�й�ȣ
	board_subject varchar2(50) not null,	-- ������
	board_content varchar2(2000) not null,	-- �۳���
	board_file varchar2(50) not null,		-- ÷������
	board_re_ref number not null,			-- ���ñ۹�ȣ
	board_re_lev number not null,			-- ��۷���
	board_re_seq number not null,			-- ���ñ�����¼���
	board_readcount number default 0,		-- ��ȸ��	
	board_date date,						-- �ۼ���
	primary key(board_num)
);
-- table ����
drop table board2 purge;

-- ������
create sequence seq_num nocycle nocache;
drop sequence seq_num;

-- insert
insert into board2 values
(seq_num.nextval, 'ȫ�浿', '1234', '������','������', 'aa.png', 
 seq_num.currval, 0, 0, 0, sysdate);
-- select
select * from board2;

select * from
(select rownum rn, tt.* from 
(select * from board2 order by board_num desc) tt)
where rn>=1 and rn<=10;
-- delete
delete board2 where board_num=1;
-- db ����
commit;
-- �Ѱ��� ���ϱ�
select count(*) from board2;

-----------------------------------
-- ���̺� ����
create table imageboard (
	seq number not null,					-- �۹�ȣ
	imageId varchar2(20) not null, 			-- ��ǰ�ڵ�
	imageName varchar2(40) not null,		-- ��ǰ��
	imagePrice number not null,				-- �ܰ�
	imageQty number not null, 				-- ����
	imageContent varchar2(4000) not null,	-- ��ǰ ����
	image1 varchar2(200),					-- ���ϸ�
	logtime date default sysdate			-- �ۼ���
);
-- table ���ֱ�
drop table imageboard purge;
-- table ���� Ȯ��
desc imageboard;

-- ������ ��ü ����
create sequence seq_imageboard nocache nocycle;
-- ������ ��ü ����
drop sequence seq_imageboard;

-- ������ �����ϱ�
insert into imageboard values (seq_imageboard.nextval, 
	'img_cupra', '�Ŷ��', 1000, 5, '���ִ� �Ŷ��','cupra.jpg', sysdate);
-- DB �����ϱ�
commit;	
-- table ���� Ȯ��
select * from imageboard;
select * from imageboard where seq=2;
-- �ε��� ��
-- hidden column - rownum
select * from
(select rownum rn, tt.* from 
(select * from imageboard order by seq desc) tt)
where rn>=1 and rn<=5;

-- �����ϱ�
delete imageboard where seq=2;
-- �� �ۼ� ������
select count(*) from imageboard;
-- �� �����ϱ�
update imageboard set imageName='�����', imageContent='��������?' where seq=2;
-----------------------------------------------
-- ���̺� ����
create table board (
	seq number not null,				--�۹�ȣ
	id varchar2(20) not null,			--���̵�
	name varchar2(40) not null,			--�̸�
	subject varchar2(255) not null,		--����
	content varchar2(4000) not null,	--���� 
	hit number default 0,				--��ȸ��
	logtime date default sysdate		--�ۼ���
);
-- table ���ֱ�
drop table board purge;
-- table ���� Ȯ��
desc board;
-- ������ ��ü ����
create sequence seq_board nocache nocycle;
-- ������ ��ü ����
drop sequence seq_board;
-- table ���� Ȯ��
select * from board;
-- ������ �����ϱ�
insert into board values (seq_board.nextval, 
	'num1', 'ȫ�浿', '������', '������', 0, sysdate);
-- DB �����ϱ�
commit;	

select * from board where seq=1;
-- �ε��� ��
-- hidden column - rownum
select * from board order by seq desc;
select rownum rn, tt.* from 
(select * from board order by seq desc) tt;

select * from
(select rownum rn, tt.* from 
(select * from board order by seq desc) tt)
where rn>=6 and rn<=10;


select seq, id, name, subject, content, hit, to_char(logtime, 'YYYY.MM.DD') as logtime 
from
(select rownum rn, tt.* from 
(select * from board order by seq desc) tt)
where rn>=1 and rn<=5;
-- ��ȸ�� ������Ű��
update board set hit = hit+1 where seq=54;
-- �����ϱ�
delete board where seq=53;
-- �� �ۼ� ������
select count(*) from board;
-- �� �����ϱ�
update board set subject='���õ�', content='������ ��Ҵ�...' where seq=54;
--------------------------------------
select * from tab;
-- ���̺� ����
create table member (
  name varchar2(30) not null,
  id varchar2(30) primary key,  --�⺻Ű, unique, not null - ���Ἲ ���� ����
  pwd varchar2(30) not null,
  gender varchar2(3),
  email1 varchar2(20),
  email2 varchar2(20),
  tel1 varchar2(10),
  tel2 varchar2(10),
  tel3 varchar2(10),
  addr varchar2(100),
  logtime date
);
-- ���̺� ���� Ȯ��
desc member;
-- ���̺� ����
drop table member purge;

-- ������ �߰�
insert into member values ('ȫ�浿', 'hong','1234','��','hong','naver.com',
      '010','1234','5678','��⵵ ������', sysdate);
-- ������ �˻�
select * from member;
select * from member where id='num1' and pwd='1234';
select * from member where id='num1';

-- ������ ����
update member set tel2='2345' where id = 'hong';

-- ������ ����
delete member where id='hong';

-- ������ ����
commit;

