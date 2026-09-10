# Q1. What is the difference between a parameter and an argument?
# A parameter is a variable defined in the function definition, 
# while an argument is the actual value passed to the function when calling the function.

# Q2. What is the difference between return and print()?
# return sends a value back to the caller.
# print() only displays the value.

# Q3. What happens if a Python function has no return statement?
#If a function doesn’t explicitly return a value, Python implicitly returns None.

# Q4. What is *args?
#“*args allows a function to accept a variable number of positional arguments.
#Inside the function, those arguments are available as a tuple.”

# Q5. What is **kwargs?
# **kwargs allows a function to accept a variable number of keyword arguments, and Python stores them as a dictionary.”

# Q6. What data type does *args store?
# it gives tuple datatype

# Q7. What data type does **kwargs store?
# it gives dictionary data type

# Q8. What is a lambda function?
# “A lambda function is a small anonymous function that can contain a single expression.”

# Q9. Difference between map() and filter()?
# “map() applies a function to every element and transforms the values, 
# while filter() keeps only the elements for which the condition is true.”

# Q10. What is a module?
#“A module is a Python file containing reusable code such as functions, classes, and variables that can be imported into another Python program.”

# Q11. Difference between a module and package?
# “A module is typically a single Python file containing reusable code, 
# while a package is a directory structure used to organize related modules.”

# Q12. Why do we use exception handling?
# “Exception handling allows us to handle runtime errors gracefully so that the program can respond appropriately instead of terminating unexpectedly.”

# # Q13. Difference between except, else, and finally?
# “except handles an exception, else executes when no exception occurs,
#  and finally executes regardless of whether an exception occurred.”

# Q14. What does raise do?
# “raise is used to explicitly raise an exception when a particular condition occurs.”



# Q15. Write a function that accepts any number of numbers using *args and returns their sum.
def sum(*args):
   total = 0
   for numbers in args:
      total += numbers

   return total

print(sum(2,3,4,5))

# Q16. Write a function using **kwargs that prints all key-value pairs.
def allValues(**kwargs):
   print(kwargs)

allValues(name="Mujjamil",age=23)

# Q17. Given:
# numbers = [1, 2, 3, 4, 5, 6]
# Use list comprehension to create:
# [1, 4, 9, 16, 25, 36]
numbers = [1,2,3,4,5,6]
multiply = []
multiply = [x*x for x in numbers]
print(multiply)

# Q18. Using list comprehension, create a list containing only even numbers.
numbersss = [1, 4, 9, 16, 25, 36]
even = []
even = [x for x in numbers if x%2 == 0]
print(even)

# Q19. Use filter() to get even numbers.
numberrrr = [1, 4, 9, 16, 25, 36]
even = list(filter(lambda x : x%2 ==0 , numberrrr))
print(even)

# Q20. Write a program that safely divides two numbers using try/except.
num1 = int(input("Enter the first number:"))
num2 = int(input("Enter the second number:"))
try:
    result = num1 / num2
    print(result)

except ZeroDivisionError:
    print("Cannot divide by zero")

finally:
    print("Division operation completed")
# Output question
# What will this produce?
def test(*args, **kwargs):
    print(args)
    print(kwargs)

test(10, 20, 30, name="MJ", age=24)

#it will give
[10,20,30]
{name : "Mj",age : 24}
