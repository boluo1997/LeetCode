/*      197.上升的温度

给定一个 Weather 表，编写一个SQL查询，来查找与之前（昨天的）日期相比温度更高的所有日期的Id。

+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+
例如，根据上述给定的 Weather 表格，返回如下 Id:

+----+
| Id |
+----+
|  2 |
|  4 |
+----+

*/

select w1.Id
from Weather w1, Weather w2
where w1.Temperature > w2.Temperature and DATEDIFF(w1.RecordDate, w2.RecordDate) = 1

/*      596. 超过5名学生的课

有一个courses 表 ，有: student (学生) 和 class (课程)。
请列出所有超过或等于5名学生的课。

例如,表:

+---------+------------+
| student | class      |
+---------+------------+
| A       | Math       |
| B       | English    |
| C       | Math       |
| D       | Biology    |
| E       | Math       |
| F       | Computer   |
| G       | Math       |
| H       | Math       |
| I       | Math       |
+---------+------------+
应该输出:

+---------+
| class   |
+---------+
| Math    |
+---------+
Note:
学生在每个课中不应被重复计算。
*/

/*先统计每门课程的学生数量，再从中选择超过 5 名学生的课程。*/
select class
from courses
group by class
having count(distinct student)>5;



















