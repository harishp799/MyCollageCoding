n=int(input("enter the number : "))
def new_sqrt(n):
    a=0.5*n
    b=0.5*(a+n/a)
    while b!=a:
        a=b
        b=0.5*(a+n/a)
    return a
print("squroot is ",new_sqrt(n))