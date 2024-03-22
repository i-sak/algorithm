-- ��ü ���̺� ����
select * from tab;
-- Table name : guestbook
create table guestbook (
  guest_num number,                     -- �� ��ȣ
  guest_writer varchar2(20) not null,   -- �ۼ���
  guest_email varchar2(30),             -- �̸���
  guest_subject varchar2(20) not null,  -- ������
  guest_content varchar2(60) not null,  -- �۳���
	logtime date default sysdate		      -- �ۼ��� 
);

-- CRUD / �۾���, ��Ϻ��� ��
-- ���̺� ����
drop table guestbook purge;
-- ������	��ü
create sequence guest_num nocycle nocache;
drop sequence guest_num;  -- ������ ����
-- insert
insert into guestbook values
(guest_num.nextval, 'ȫ�浿', 'hong@naver.com', '������', '�౸�ϴ� ��', sysdate);
-- select
select * from guestbook;
select * from guestbook where guest_num=1;
-- delete
delete guestbook where guest_num=1;
-- db ����
commit;
-- �Ѱ��� ���ϱ�
select count(*) from guestbook;

-- �ε��� ��
-- hidden column - rownum
select * from
(select rownum rn, tt.* from 
(select * from guestbook order by guest_num desc) tt)
where rn>=1 and rn<=10;

-- column ũ�� ����
column guest_content format a70;