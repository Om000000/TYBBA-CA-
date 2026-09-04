""" Write a Python program to get a string made of the first 2 and the last 2 chars from a given a string. If 
the string length is less than 2, return instead of the empty string. 
Sample String : 'General12' Expected 
Result : 'Ge12' Sample String : 'Ka' 
Expected Result : 'KaKa' Sample 
String : ' K' 
Expected Result : Empty String """

def getFirstAndlast(str):
    if len(str)<2:
        return "Empty String"
    return str[:2]+str[-2:]

textcase=['Ge12','Ka','K']

for test in textcase:
    result=getFirstAndlast(test)
    print(f"Sample String {test} Expected Result {result}")
