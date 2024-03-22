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
select * from board where seq=1;
-- �ε��� ��
-- hidden column - rownum
select * from
(select rownum rn, tt.* from 
(select * from imageboard order by seq desc) tt)
where rn>=6 and rn<=10;

-- �����ϱ�
delete imageboard where seq=1;
-- �� �ۼ� ������
select count(*) from imageboard;
-- �� �����ϱ�
update imageboard set imageName='�����', imageContent='��������?' where seq=2;










