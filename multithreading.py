from time import sleep
from threading import *
class hello(Thread):
    def run(self):
        for i in range(5):
            print("Hello")
            sleep(1)
class hi(Thread):
    def run(self):
        for i in range(5):
            print("Hi")
            sleep(1)
obj1=hello()
obj2=hi()
obj1.start()
sleep(0.2)
obj2.start()
obj1.join()
obj2.join()
print("bye")
                        