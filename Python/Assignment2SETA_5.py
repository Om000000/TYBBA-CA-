""" Write a Python program to get a string from a given string where all occurrences of its first char have 
been changed to '$', except the first char itself. Sample String: 'restart' Expected  Result  : 'resta$t """

a="madam"
b=list(a)

size=len(a)
char=b[0]
for i in range(size):
    if i > 0:
        if a[i]==char:
            b[i]="$"
s="".join(b)
print(s)