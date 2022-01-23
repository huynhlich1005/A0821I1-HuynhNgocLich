use quanglysinhvien;
-- Hiển thị danh sách tất cả học viên 
SELECT * FROM student;
-- Hiển thị danh sách học viên đang theo học 
SELECT * FROM student
where `status` = true;
-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ 
select * from subject 
where Credit < 10;
-- Hiển thị danh sách học viên lớp A1
SELECT S.StudentId, S.StudentName, C.ClassName
FROM Student S join Class C on S.ClassId = C.ClassID
WHERE C.ClassName = 'A1';

SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';
