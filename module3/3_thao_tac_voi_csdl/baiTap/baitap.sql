use quanlysinhvien;
select * from class ;
select * from student ;
select * from subject ;

-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student 
where StudentName like 'H%';
-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12
select S.StudentName, S.Phone ,C.StartDate from student as S
join class as C on S.ClassID = C.ClassID
where StartDate like '%-12-%';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * from subject 
where Credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.

update student set ClassID = 3 where StudentName = 'Hung';

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select S.StudentName , S.SubName , M.Mark from mark as M
join student as S on M.StudentID = S.StudentID
order by 
