use education;
select institution.name as 'INSTITUTION NAME',course.name as 'COURSE NAME', COUNT(student.course) as 'NUMBER OF STUDENTS'
from
institution
INNER JOIN course ON course.institution=institution.institutionid
INNER JOIN student ON student.course=course.courseid
group BY institution.name;