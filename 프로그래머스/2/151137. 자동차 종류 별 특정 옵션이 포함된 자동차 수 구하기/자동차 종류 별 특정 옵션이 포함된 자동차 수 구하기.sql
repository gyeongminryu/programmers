-- 코드를 입력하세요
-- 옵션이 통ㅇ풍시트, 열선시트,가죽시트 하나 이상의 옵션 포함
-- 자동차 종류별로 몇 대인지 
-- 종류로 오름차순 

SELECT CAR_TYPE, COUNT(*) AS CARS FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS LIKE '%통풍시트%' 
OR OPTIONS LIKE '%열선시트%' 
OR OPTIONS LIKE'%가죽시트%'
GROUP BY CAR_TYPE 
ORDER BY CAR_TYPE;