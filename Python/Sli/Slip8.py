
class addition_complex:
   
    
    def __init__(self,x,y):
        self.x=x
        self.y=y

    def __add__(self,other):
        if isinstance(other,addition_complex):
             return addition_complex(self.x+other.x,self.y+other.y)
        return NotImplemented
        


a=addition_complex(-5,-6)
b=addition_complex(-6,-5)
c=a+b
print("Result x:",c.x," y:",c.y)

