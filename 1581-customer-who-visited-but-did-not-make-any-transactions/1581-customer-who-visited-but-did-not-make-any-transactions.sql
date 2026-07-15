# Write your MySQL query statement below
select v.customer_id,count(*) as count_no_trans from Visits v Left join Transactions t using (visit_id) where t.transaction_id is null group by customer_id;