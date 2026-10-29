""" Generate customer ratings using random numbers and analyze average rating, 
median, standard deviation, rating frequency and satisfaction percentage.  
Tasks:  
1. Generate ratings of 100 customers.  
2. Calculate:  
● Mean rating  
● Median rating  
3. Create a bar chart showing rating distribution.   """
import numpy as np
import random
import matplotlib.pyplot as plt

arr=np.random.choice([1,2,3,4,5],size=100,p=[0.1,0.1,0.1,0.4,0.3])


print(np.std(arr))
print(np.mean(arr))
print(np.median(arr))
Customer_statistified=np.count_nonzero(arr<=4)
Customer_statistified_percentage= (Customer_statistified/100) * 100
print("Satistified Rating Frequency:",Customer_statistified)
print("Satistified Rating percentage:",Customer_statistified_percentage)
stars,count=np.unique(arr,return_counts=True)
plt.title("Ratings")
plt.xlabel("Stars")
plt.ylabel("Customer_rating")
plt.bar(stars,count,color="skyblue")
plt.show()
