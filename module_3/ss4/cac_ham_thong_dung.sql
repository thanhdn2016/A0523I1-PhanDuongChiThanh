USE QuanLySinhVien;
-- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
SELECT 
    Address, COUNT(StudentId) AS 'Số lượng học viên'
FROM
    Student
GROUP BY Address;
--  Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
SELECT 
    S.StudentId, S.StudentName, AVG(Mark)
FROM
    Student S
        JOIN
    Mark M ON S.StudentId = M.StudentId
GROUP BY S.StudentId , S.StudentName;
-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15 
SELECT 
    S.StudentId, S.StudentName, AVG(Mark)
FROM
    Student S
        JOIN
    Mark M ON S.StudentId = M.StudentId
GROUP BY S.StudentId , S.StudentName;

SELECT 
    S.StudentId, S.StudentName, AVG(Mark)
FROM
    Student S
        JOIN
    Mark M ON S.StudentId = M.StudentId
GROUP BY S.StudentId , S.StudentName
HAVING AVG(Mark) > 15;

SELECT 
    S.StudentId, S.StudentName, AVG(Mark)
FROM
    Student S
        JOIN
    Mark M ON S.StudentId = M.StudentId
GROUP BY S.StudentId , S.StudentName;

SELECT 
    S.StudentId, S.StudentName, AVG(Mark)
FROM
    Student S
        JOIN
    Mark M ON S.StudentId = M.StudentId
GROUP BY S.StudentId , S.StudentName
HAVING AVG(Mark) >= ALL (SELECT 
        AVG(Mark)
    FROM
        Mark
    GROUP BY Mark.StudentId);
--------------------------
SELECT 
    *
FROM
    `subject`
WHERE
    credit = (SELECT 
            MAX(credit)
        FROM
            `subject`);

SELECT 
    s.*, m.Mark
FROM
    `subject` s
        JOIN
    (SELECT 
        subID, Mark
    FROM
        Mark
    WHERE
        Mark = (SELECT 
                MAX(Mark)
            FROM
                Mark)) AS m USING (subID);
                
    SELECT 
    s.*, AVG(m.mark) AS average_mark
FROM
    student s
        JOIN
    mark m USING (studentid)
GROUP BY studentid
ORDER BY average_mark DESC;