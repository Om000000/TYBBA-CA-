a=int(input("Enter a number to check perfect"))
sum=0
for i in range(1,a):
    if a%i==0:
        sum+=i
        
if sum==a:
    print("It is perfect number")
    
    
else:
    print("It is not perfect number",a,sum)