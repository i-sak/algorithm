select * from tab;
-- ���̺� ����
create table member (
	name varchar2(30) not null,
	id varchar2(30) primary key, -- �⺻Ű, unique, not null ���Ἲ ���� ����
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
insert into member values ('����', 'gogal', '1234', '��', 'gogal', 'gmail.com',
	'010', '1234','5678','��⵵ �Ⱦ��', sysdate);
-- ������ �˻�
select * from member;
select * from member where id='gogal' and pwd='1234';

-- ������ ����
update member set tel2='2345' where id='gogal';

-- ������ ����
commit;
