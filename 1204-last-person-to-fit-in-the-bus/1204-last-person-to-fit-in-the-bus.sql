# Write your MySQL query statement below
select person_name from (select person_name,sum(weight) over(order by turn) as total_Weight from Queue) t 
where total_Weight<=1000 order by total_weight desc limit 1;