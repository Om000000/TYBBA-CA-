print("Enter one side of cube in cm")
side=int(input())
print("Enter radius of spear")
radius=int(input())
areaofspear=4*3.14*radius*radius
volumeofspear=(4/3)*3.14*(radius**3)
areaofoneside=side*side
areaofallsides=areaofoneside*6
print("Area of cube ",areaofoneside,"cm²")
print("Volume of cube",side**3,"cm³")
print("Area of spear ",areaofspear,"cm²")
print("Volume of spear",volumeofspear,"cm³")