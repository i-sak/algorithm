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