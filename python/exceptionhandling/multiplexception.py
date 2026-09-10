try :
    number = int(input("Enter the number"))
    result = 10/0
except ValueError:
    print("The number is invalid")
except ZeroDivisionError:
    print("The 10 is not divisible by 0")


try :
    result = 10/0
except :
    print("erroe")
else :
    print(result)

