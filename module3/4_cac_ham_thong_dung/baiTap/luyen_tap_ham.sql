use quanlysinhvien;

select su.SubID, su.SubName, max(su.Credit) from `subject` as su;
select * from mark;
select * from class;
select * from student;
select * from subject;

