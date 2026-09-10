from abc import ABC , abstractmethod
class Vehicle(ABC):
    @abstractmethod
    def start(self):
        pass

class Car(Vehicle):
    def start(self):
        print("Car is started")

car = Car()
vehicle = Vehicle()

print(car.start())
print(vehicle.start())