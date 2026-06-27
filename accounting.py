class account:
    def __init__(self,balance,name,acno):
        self.balance=balance
        self.name=name
        self.acno=acno
        print("welcome to money withdraw and deposite machine ")
        print(balance ,":", name ,":",acno)
    def deposit(self):
        am=float(input("enter the deposite amount : "))
        self.balance=self.balance+am
        print(am,"is deposited succussfully")
    def withdraw(self):
        am=float(input("enter the withdraw amount : "))
        if(self.balance >= am):
            print(am,"is succussfully withdraw ")
            self.balance=self.balance-am
        else:
            print("insufficent balance ")
    def disply(self):
        print("balane of your account is ",self.balance)
s=account(5000,"harish",51042100)
s.disply()
s.deposit()
s.disply()
s.withdraw()
s.disply()