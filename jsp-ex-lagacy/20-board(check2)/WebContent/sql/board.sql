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
dorp sequence seq_num;

-- insert
insert into board2 values
(seq_num.nextval, 'ȫ�浿', '1234', '������','������', 'aa.png', 
 seq_num.currval, 0, 0, 0, sysdate);
-- select
select * from board2;
select * from board2 where board_num=1;
-- delete
delete board2 where number=1;
-- db ����
commit;
-- �Ѱ��� ���ϱ�
select count(*) from board2;















