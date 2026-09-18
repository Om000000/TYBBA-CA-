import calendar
import cmath
from datetime import date as dt_date
from datetime import datetime as dt_datetime
from datetime import time as dt_time
python_time = __import__("time")  # Avoids conflict with datetime.time
from decimal import Decimal
from fractions import Fraction
from math import factorial, pow, sqrt
from statistics import mean, mode, median

print(sqrt(16))  # 4.0
print(pow(2, 2))  # 4.0
print(factorial(5))  # 120

num = 3 + 4j
print("==Built in for CMATH==")
print(cmath.sqrt(-16))  # 4j
print(cmath.phase(num))  # 0.9272952180016122

print("==Built in for Decimal==")
print(Decimal("0.1") + Decimal("0.2"))  # 0.3 (Use strings to avoid float inaccuracies)

print("==Built in for Fraction==")
print(Fraction(2, 3))  # 2/3

marks = [10, 20, 30, 40, 50]
print("==Built in for Statistics mean==")
print(mean(marks))  # 30
print("==Mean==")
print(median(marks))  # 30
print("==mode==")
print(mode(marks))  # 10 (Returns first item if all counts are equal)

print("==Built in for Time==")
print(python_time.time())  # Seconds from Epoch
print(python_time.gmtime())  # Readable UTC time tuple
print(python_time.asctime())  # Current day/date/time string
print(python_time.ctime())  # Current day/date/time string
python_time.sleep(2)  # Pauses execution for 2 seconds (returns None)

# Timezone adjustment (Note: os.environ['TZ'] behavior depends on the OS)
import os

os.environ["TZ"] = "Asia/Kolkata"
if hasattr(python_time, "tzset"):
    python_time.tzset()
print(python_time.tzname)
print(python_time.localtime())

print("==Built in for DATETIME==")
X = dt_datetime.now()  # Fixed namespace
print(X)
print(X.year)
print(X.strftime("%A"))

print("==Built in for DATETIME Creators==")
print(dt_datetime(2025, 9, 1, 10, 30, 15))
print(dt_date(2012, 8, 25))
print(dt_time(10, 30, 15))

print("==Built in for Calendar==")
print(calendar.month(2026, 12))
