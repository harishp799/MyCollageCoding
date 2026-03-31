l=[]
n=int(input("enter the num of elements in list : "))
for i in range(n):
    e=int(input("enter the element "))
    l.append(e)
print(l)
for i in range(n-1):
    mini=i
    for j in range (mini+1,n):
        if(l[j]<l[mini]):
            mini=j
    l[i],l[mini]=l[mini],l[i]
print("after sorting ")
print(l)