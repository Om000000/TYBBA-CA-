"""  
1. Write a recursive function which print string in reverse order.  """
s=""
def reversersestr(str):
  if len(str)==0:
    return "" 
  return str[-1]+reversersestr(str[:-1])


str="Hello"

s=reversersestr(str)
print(s)