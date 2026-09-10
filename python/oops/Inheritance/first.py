class Vehicle:
    def start(self):
        print("Vehicle started successfully")

class Car(Vehicle):
    def drive(self):
        print("Car started succesfully")


car = Car()

print(car.start())
print(car.drive())