l=[]
n=int(input("enter the how many no of elements do you enter :"))
for k in range(n):
    e=int(input())
    l.append(e)
print(l)
for j in range(n-1):
    for i in range(n-1):
        if(l[i]>l[i+1]):
            l[i],l[i+1]=l[i+1],l[i]
print("after sorting ")
print(l)
            
