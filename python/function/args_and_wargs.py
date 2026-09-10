def add(*args):
    total = 0
    for numbers in args:
        total += numbers

    return total;

print(add(2,3,1,45,4))#tuple used for taking multiple parameter and gives multiple arguments *args


def display(**kwargs):
    print(kwargs)

display(name = "mujjamil",age = 23 , city = "Pune")


# *args allows function to store variables as tuple and **kwargs allows functio to store variables in dictionary