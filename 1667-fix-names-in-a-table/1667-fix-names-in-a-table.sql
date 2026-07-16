# Write your MySQL query statement below
Select user_id,Concat(Upper(left(name,1)),Lower(Substring(name,2))) as name from Users order by user_id;
