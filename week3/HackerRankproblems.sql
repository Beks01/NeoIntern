# 1)# SELECT * FROM CITY; #Select All
#
# 2)# SELECT Name FROM CITY #Revising the Select Query II
# # WHERE CountryCode = 'USA' and Population > 120000;
#
# 3)# SELECT * FROM CITY #Japanese Cities' Attributes
# # WHERE COUNTRYCODE = 'JPN';
#
# 4)# SELECT NAME FROM CITY # Japanese Cities' Names
# # WHERE CountryCode = 'JPN';
#
# 5)# SELECT CITY, STATE FROM STATION; #Weather Observation Station 1
#
# 6)# SELECT DISTINCT CITY FROM STATION #Weather Observation Station 3
# # WHERE MOD(ID,2)=0
# # ORDER BY CITY;
#
#
# 7)# SELECT TOP 1 CITY, LEN(CITY) FROM STATION #Weather Observation Station 5
# # ORDER BY LEN(CITY), CITY;
# # SELECT TOP 1 CITY, LEN(CITY) FROM STATION
# # ORDER BY LEN(CITY)DESC;
#
# 8)# SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY, LENGTH(CITY),1) IN ('a', 'e', 'i', 'o', 'u'); #Weather Observation Station 7
#
# 9)# SELECT NAME FROM STUDENTS #Higher Than 75 Marks
# # WHERE MARKS > 75
# # ORDER BY RIGHT(NAME,3), ID;
#
# 10)# SELECT Name FROM Employee #Employee Salaries
# # WHERE Salary > 2000 AND Months < 10
# # ORDER BY Employee_id;

