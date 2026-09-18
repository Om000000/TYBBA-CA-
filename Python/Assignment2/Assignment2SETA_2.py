""" Write a python script to count the number of characters (character frequency) in a string. Sample String 
: google.com'. Expected Result : {'o': 3, 'g': 2, '.': 1, 'e': 1, 'l': 1, 'm': 1, 'c': 1} 
 """

a="HHllo"
listy=list(a)
dict={ }

size=len(listy)
for i in range(size):
    dict[listy[i]]=listy.count(listy[i])

print(dict)

