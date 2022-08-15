-- 코드를 입력하세요
SELECT animal_id, name, (case 
                         when sex_upon_intake LIKE 'Intact%' then 'X'
                         else 'O' end)
FROM animal_ins
ORDER BY animal_id;