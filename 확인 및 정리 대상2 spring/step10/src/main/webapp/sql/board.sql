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