l=[]
n=int(input("enter the how many no of elements do you enter :"))
for k in range(n):
    e=int(input())
    l.append(e)
print(l)
c=0
a=int(input("enter the number that you need to search :"))
for i in range(n):
    if(a==l[i]):
        c+=1
        print('element is found at index ',i)
if(c==0):
    print('element is not found ')
    