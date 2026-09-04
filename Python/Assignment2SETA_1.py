""" Write a python script which accepts 5 integer values and prints “DUPLICATES” if any of the values 
entered are duplicates otherwise it prints “ALL UNIQUE”. Example: Let 5 integers are (32, 45, 90, 45, 
6) then output “DUPLICATES” to be printed.  """



set= set()

for i in range(5):
    a=int(input(f"Enter {i} Element in set"))
    set.add(a)

if len(set)<5:
    print("Duplicates")
    print(set)

else:
    print("All unique")
    print(set)