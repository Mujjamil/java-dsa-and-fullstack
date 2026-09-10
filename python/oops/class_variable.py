class Employee:
    company = "Thinkative"

    def __init__(self,name,salary):
        self.name = name
        self.salary = salary

    

e1 = Employee("Mujjamil",2000)
e2 = Employee("Rahul",4343)

print(e1.company)
print(e1.salary)
print(e1.name)
print(e2.name)
print(e2.salary)