class Employee:
    company = "Thinkative"

    @classmethod
    def class_method(cls,name , id):
        cls.name = name
        cls.id = id

m1 = Employee("Mujjamil",2)
m2 = Employee("Tushar",3)

print(m1.name)
print(m2.name)