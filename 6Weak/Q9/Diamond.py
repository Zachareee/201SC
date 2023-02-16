class A:
    def sayHello(self):
        print('A')

class B:
    def sayHello(self):
        print('B')

class C:
    def sayHello(self):
        print('C')

class D(B,C):
    pass

obj = D()
obj.sayHello()
print(D.mro())
