""" 1. Write a python script to generate Fibonacci terms using generator function. """

def fibo():
    a,b=0,1
    while True:
        yield a
        a,b=b,a+b

fib=fibo()
for _ in range(10):
   
    print("fiboneses num:",next(fib))