# Q1. What is OOP and why do we use it?
# oops means object-oriented programming which is used 
# its programming approach where we arrange data between objects
# method/and behaviours of object

# Q2. What is the difference between a class and an object?
# class is blueprint/template which defines properties or methods of objects.
# object is instance of class which is created from blueprint or template as a class

# Q3. What is self in Python?
# self is refernce to current object of class

# Q4. What is __init__()?
# init is special method which automatically called when an object is created

# Q5. What is the difference between an instance variable and a class variable?
# instance variable belongs to specific object
# class variable belongs to class and shared by all objects

# Q6. What is the difference between instance method, class method and static method?
# instance method works with particular object
# class method works with class itself rather than perticular object
# static method dosoent need any self cls to work 

# Q7. Explain encapsulation with a Python example.
# Encapsulation means bundles data and methods into single class to work together. and restricting direct use to some of the objects data.object

# Q8. Explain inheritance.
# Inheritance means child class inhertis data from parent class.

# Q9. What is method overriding?
# method overriding means same interface same function name but behaviour is different that called overriding.

# Q10. Explain polymorphism with an example.
# Poly means many morph means form means its many forms just same interface different behaviour of object

# class Vehicle:
#     def start(self):
#         print("Vehicle started successfully")

# class Car(Vehicle):
#     def start(self):
#         print("Car started successfully")

# car = Car()

# car.start()
# vehicle = Vehicle()

# vehicle.start()


# Q11. What is abstraction?
# hiding unnecessary implementation and showing important implementation 

# Q12. What is super() used for?
# super is used to access method from parent class to child class

# Q13. Does Python support multiple inheritance?
# yes multiple inhertance means single class inherits more than one parent class

# Q14. What is MRO?
# it is the order in which Python searches for a method or attribute when using inheritance, especially multiple inheritance.

# Q15 — Employee
# class Employee:
   
#     def __init__(self,name,id,salary):
#         self.name = name
#         self.id = id
#         self.salary = salary

#     def display_details(self):
#         print("Name",self.name)
#         print("id",self.id)
#         print("salary",self.salary)


# e = Employee("Mujjamil",3,33000)

# e.display_details()

# Q16 — Inheritance Vehicle -> Car Vehicle should have: brand start() Car should have: model
# class Vehicle:
#     def __init__(self,brand):
#         self.brand = brand

#     def start(self):
#         print("Vehicle is started")

# class Car(Vehicle):
#     def __init__(self, brand,model):
#         super().__init__(brand)
#         self.model = model

# car = Car("Toyota","Fortuner")

# print("Brand:",car.brand)
# print("Model:",car.model)

# Q17 — Polymorphism Create:
# Car
# Bike

# Both should have:
# start() 

# but produce different output. Then store both objects in a list and call:
# vehicle.start()
# inside a loop.
# =
# class Car:
#     def start(self):
#         print("Car is started")

# class Bike:
#     def start(self):
#         print("Bike is started")

# vehicles = [Car(),Bike()]
 
# for vehicle in vehicles:
#     vehicle.start()

# Q18 — Encapsulation Create: BankAccount with: 
# private balance
# deposit()
# withdraw()
# get_balance()
# Don’t allow withdrawal if the amount is greater than the balance.

# class BankAccount:
#     def __init__(self,balance):
#         self.balance = balance

#     def deosit(self,amount):
#         self.balance += amount

#     def withdrwa(self,amount):
#         if amount <= self.balance:
#             self.balance -= amount

#     def get_balance(self):
#         return self.balance


# bank = BankAccount(50000)

# bank.deosit(2000)
# bank.withdrwa(3000)

# print("Balance=",bank.get_balance())

# Q19 — Class variable Create an Employee class where: company = "Thinkitive" is shared by all employees. Create two employees and demonstrate it.
# class Employee:
#     company = "Thinkative"

#     def __init__(self,name):
#         self.name = name


# e = Employee("Mujjamil")
# e1 = Employee("Tejas")

# print(e.name)
# print(e.company)

# print(e1.name)
# print(e1.company)

# Q20 — Interview coding challenge 
# Vehicle
#  ├── Car
#  ├── Bike
#  └── Bus
# Requirements:
# * Vehicle has brand
# * Each child has its own start() implementation
# * Use inheritance
# * Use method overriding
# * Use super()
# * Store all vehicles in a list
# * Loop through them and call start()
class Vehicle:
    def __init__(self , brand):
        self.brand = brand

    def start(self):
        print("Vehicle Started")

class Car(Vehicle):
    def __init__(self, brand , model):
        super().__init__(brand)
        self.model = model

    def start(self):
        print("Car Started")

class Bike(Vehicle,Car):
    def __init__(self, brand):
        super().__init__(brand)

        def start(self):
            print("Bike Started")



    