try:
    age=int(input("how old you are?"))
    print("your age is ",age)
    l=['a','b','c']
    print(l[2])
except ValueError:
    print("invalid age is entered ")
except IndexError:
    print("invalid index is entered ")
except:
    print("unknown exception is occured ")
print("end of the program ")