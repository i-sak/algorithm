create table score (
	score_num number not null,			-- �й�
	score_name varchar2(20) not null,	-- �̸�
	score_kor number not null,			-- ����
	score_eng number not null,			-- ����
	score_mat number not null,			-- ����
	score_tot number not null,			-- ����
	score_avg number not null,			-- ���
	primary key(score_num, score_name)
);
-- table ����
drop table score purge;
-- insert
insert into score values
('2018001', 'ȫ�浿','95','80','100','275','92.5');
-- db���� 
commit;
-- table ���� Ȯ��
desc score;
-- select
select * from score;

select * from score where score_num='2018001';

select * from (select rownum rn, tt.* from "  
		+ "(select * from score order by score_avg desc) tt) "  
		+ "where rn>=1 and rn<=10;
-- ���� ����
select count(*) from score;
