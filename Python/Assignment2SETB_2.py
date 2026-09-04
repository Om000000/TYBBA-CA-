""" Write a Python program to get a single string from two given strings, separated by a space and swap the 
first two characters of each string. 
Sample String : 'abc', 'xyz' Expected 
Result : 'xycabz'  """

str="abc"
str1="xyz"

newstr=str1[:2]+str[2:]  # Take x-y-c #
newstr1=str[:2]+str1[2:] # Take a-b-z #
result=newstr+' '+newstr1



print(newstr)
