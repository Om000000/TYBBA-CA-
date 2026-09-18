""" 2. Write python script using package to calculate area and volume of cylinder and cuboids.  
 """

from shapes import cuboid,cylander

shape=input("Enter cy for cylander and cu for cuboid")

if shape=="cu":
    l=int(input("Enter length"))
    b=int(input("Enter breath"))
    h=int(input("Enter heigth"))
    action=input("Enter v for volume and a for area")
    if action=="v":

        cuboid.volume(l,b,h)

    if action=="a":
        cuboid.area(l,b,h)

if shape=="cy":
    r=int(input("Enter radius"))
   
    h=int(input("Enter heigth"))
    action=input("Enter v for volume and a for area")
    if action=="v":

        cylander.volume(r,h)

    if action=="a":
        cylander.area(r,h)

    