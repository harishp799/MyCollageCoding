started,stoped=False,False
while True:
    ch=input("enter choice :  ").lower()
    match ch:
        case 'start':
            if(started):
                stoped=False
                print("car is already started ")
            else:
                started=True
                print("car is started")
        case 'stop':
            if(stoped):
                started=False
                print("car is already stoped ")
            else:
                stoped=True
                print("car is stoped ")
        case 'quit':break
        case other:
            print("i don't understand ")
            
    