""" 3. Define a function that accept two strings as input and find union and intersection of them. """




def unionintersection(A,B):
    union=set(A) | set(B)
    intersection_set= set(A) & set(B)

    print("Union:",union, end="")
    print("Intersection:",intersection_set, end="")

A="Omkar"
B="Hadawale"
unionintersection(A,B)