import math
def area(radius,height):
     surface_area = 2 * math.pi * radius * (radius + height)
     print("Area of cylander is:",surface_area)

def volume(radius,height):
     volume = math.pi * (radius ** 2) * height
     print("Volume of cylander is:",volume)