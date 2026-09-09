age = 25;
if age <= 12:
    print("its a child")
elif age <= 19:
    print("its a teenager")
elif age <= 35:
    print("its a younger")
else:
    print("its a aged person")


age = 20
s = "Adult" if age >= 18 else "Minor"#turnary operator
print(s);

numbers = 2

match numbers:
    case 1:
        print("One")
    case 2 | 3:
        print("two or three")
    case _:
        print("Other Number")