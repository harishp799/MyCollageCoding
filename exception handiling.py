a=5
b=0
try:
    print("resourse open")
    print(a/b)
    k=int(input("enter the value "))
    print(k)
except ZeroDivisionError as e:
    print("division is not posible with zero ",e)
except ValueError as e:
    print("invalid input ",e)
except Exception as e:
    print("something is worng....",e)
finally:
    print("resourse close")
print("bye")
    