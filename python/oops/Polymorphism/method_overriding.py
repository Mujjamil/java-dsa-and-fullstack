class Vehicle:
    def start(self):
        print("Vehicle Started")

class Car(Vehicle):
    def start(self):
        print("car Started")

car = Car()
print(car.start())