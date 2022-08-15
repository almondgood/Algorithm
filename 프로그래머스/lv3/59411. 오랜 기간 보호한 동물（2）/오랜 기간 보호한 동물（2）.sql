-- 코드를 입력하세요
SELECT ins.animal_id, ins.name
FROM animal_ins ins
INNER JOIN animal_outs outs ON ins.animal_id = outs.animal_id
ORDER BY outs.datetime - ins.datetime desc
LIMIT 2