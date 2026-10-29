""" Write python program to generate a random password with upper and lower 
case letters. """
import random
def passwordgenerator():
    i=0
    a=""
    while i<5:
        indexs=random.randint(97,122)
        indexc=random.randint(65,91)
        a+=str(chr(indexs))
        a+=str(chr(indexc))
        i=i+1
    print(a)
    




passwordgenerator()