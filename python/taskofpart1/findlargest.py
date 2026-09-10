# Q13. Write a program to find the largest of three numbers.
a = int(input("Enter the first number:"))
b = int(input("Enter the second number:"))
c = int(input("Enter the third number:"))


if a>=b and a>=c:
    largest = a
elif b>=a and b>=c:
    largest = b
else:
    largest = c


print("The largest number among this is:",largest)