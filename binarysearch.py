l=[]
n=int(input("enter the num of elements in list : "))
for i in range(n):
    e=int(input("enter the element "))
    l.append(e)
print(l)
a=int(input("enter the searching element :"))
low,high,c=0,n-1,0
while(high>=low):
    mid=(high+low)//2
    if(l[mid]==a):
        print("element is found at index :",mid)
        c+=1
        break
    elif(l[mid]<a):
        low=mid+1
    else:
        high=mid-1
if(c==4):
    print("element is not found ")