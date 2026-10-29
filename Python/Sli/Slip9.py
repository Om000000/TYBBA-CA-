""" Write a python script to find the repeated items of a tuple 
 """

a=(10,9,9,5,5,7)
repeated=()
for i in a:
    if a.count(i)>1:
        repeated=repeated+(i,)
print(repeated)

