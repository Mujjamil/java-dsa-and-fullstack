x = 10 #global variable 
def scope():
    x = "test"# local variable 
    print(x)

print(x)
scope()