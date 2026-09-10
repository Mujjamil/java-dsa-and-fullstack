class Employee:
    def __init__(self, name, id, salary):
        self.name = name
        self.id = id
        self.salary = salary


employee = Employee("Mujjamil", 2, 33000)

print(employee.name)
print(employee.id)
print(employee.salary)