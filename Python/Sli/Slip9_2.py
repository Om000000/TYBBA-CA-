""" Write a Python class which has two methods get_String and print_String. 
get_String accept a string from the user and print_String print the string in upper 
case. Further modify the program to reverse a string word by word and print it in 
lower case. """

class model:
    def __init__(self):
        self.str=""
        self.word=""
        

    def getString(self,str):
        self.str=str
        print(str)

    def print_String(self):
        word=self.str.split()
        reverse_word=reversed(word)
        result=' '.join(reverse_word).lower()
        print(result)

    

m=model()
m.getString("Hello how are you".upper())
m.print_String()