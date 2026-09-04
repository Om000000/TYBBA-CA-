
a=input("Enter a number to check armstrong:")
digitcount=0
for i in a:
    digitcount+=1
    
num=int(a)
numm=num
arm=0
while num>0:
    
     digit=num%10
     arm=arm+(digit ** digitcount)
     num=num//10
if numm==arm:
    print("armstrong")
else:
    print("Not armstrong",arm,numm)