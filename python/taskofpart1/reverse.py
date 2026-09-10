#Q14. Write a program to reverse a string without using [::-1].

name = "Mujjamil";
reverse = ""

for char in name:
    reverse = char + reverse

print("The reverse of string is:",reverse)


for i in range(-1 , -len(name)-1,-1):
    reverse += name[i]

print("The reverse by this",reverse)