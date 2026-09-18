class stack:
            
            def push(self,data,s):
                print("Pushed Moron to the stack")
                s.append(data)
            def pop(self,s):
                    if len(s)>0:
                            ans=s.pop()
                            print("Removed Element: ",ans)
                    else:
                            print("Stack is empty")

            def top(self,s):
                    if len(s)>0:
                            return s[len(s)-1]

            def is_empty(self,s):
                    if len(s)==0:
                            return True
                    else:
                            return False

            def size(self,s):
                    return len(s)

st= stack()
s = ["Lokesh", "Diwakar", "Aniket", "Ritik"]

print(s)
print(st.size(s))

print("Top of the stack:",st.top(s))

print("Check Stack is Empty or not:",st.is_empty(s))

print("Pushing Moran in Stack")
st.push("Moron",s)
print(s)

print("Poping Moran in Stack")
st.pop(s)
print(s)



