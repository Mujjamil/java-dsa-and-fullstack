class A:
    def show_a(self):
        print("A")

class B:
    def show_b(self):
        print("B")

class C(A,B):
    def show_c(self):
        pass

c = C()

print(c.show_a())
print(c.show_b())
print(c.__mro__)#method resolution order
