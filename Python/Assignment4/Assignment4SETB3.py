""" 3. Write a python script to accept decimal number and convert it to binary and octal number  """
decimal_num=int(input("Enter a decimal num"))

binnum=bin(decimal_num)[2:]
octadecimal=bin(decimal_num)[:2]

print("Decimal number is:",decimal_num)
print("Binary number is:",binnum)
print("Octadecimal number is:",octadecimal)