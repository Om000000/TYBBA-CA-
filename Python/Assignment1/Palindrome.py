#pàlindrome
a=int(input("Enter a number to check palindrome"))
rev=0
num=a
while num>0:
            rem=num%10
            rev=rev*10+rem;
            num=num//10
            
if a==rev:
          print("It is palindrome")
else:
     print("It is not palindrome")