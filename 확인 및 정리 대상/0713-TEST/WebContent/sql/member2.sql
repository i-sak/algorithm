-- ���̺� ����
create table member2 (
  id varchar2(20) primary key, -- �⺻Ű, unique, not null - ���Ἲ ���� ����: ���̵�
  pwd varchar2(30) not null,  -- ��й�ȣ
  name varchar2(10) not null, -- �̸�
  birth number,               -- �������
  gender varchar2(10),       -- ����
  email1 varchar2(20),      -- �̸���1
  email2 varchar2(20),      -- �̸���2
  tel1 varchar2(10),    -- ����ó 1
  tel2 varchar2(10),    -- ����ó 2
  tel3 varchar2(10),    -- ����ó 3
  addr varchar2(100),   -- �ּ�
  logtime date        -- ������
);
-- table ����
drop table member2 purge;
-- db ����
commit;
-- table ���� Ȯ��
desc member2;
-- select
select * from member2;
-- insert ȸ������
insert into member2 values
('id', 'pwd', 'name', 911215, 'gender','email1', 'email2','tel1', 'tel2', 'tel3','addr', sysdate);
-- ID, PWD �� ���� ����
-- ������ �˻�
select * from member2;
select * from member2 where id='abc' and pwd='123';
select * from member2 where id='num1';