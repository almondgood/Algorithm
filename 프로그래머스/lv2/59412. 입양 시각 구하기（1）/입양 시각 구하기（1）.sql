-- 코드를 입력하세요
SELECT HOUR(datetime), count(*)
FROM animal_outs
WHERE 9 <= hour(datetime) AND hour(datetime) < 20
GROUP BY hour(datetime)
ORDER BY hour(datetime);