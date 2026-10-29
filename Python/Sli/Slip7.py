"""  Write python script using package to calculate area and volume of cube and 
sphere """
from calculation import area as a

radius=int(input("Enter the radius of the spear"))
side=int(input("Enter the length of one side"))

area_c,volume_c=a.areanvolume_of_cube(side)
area_s,volume_s=a.areanvolume_of_spear(radius)
print("The volume and area of cube is as follows",volume_c,area_c)
print("The volume and area of spear is as ollows",area_s,volume_s)

