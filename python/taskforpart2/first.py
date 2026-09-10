# Q1. What is the difference between a parameter and an argument?
#  we pass the variables in function declration that is parameter
#  while when we pass actual values for getting result is argumetns

# Q2. What is the difference between return and print()?
# return gives value to the function in return
# print give the value and print while its callable()

# Q3. What happens if a Python function has no return statement?
# then the values will be not return to the function as result it will not print or call that values while execution

# Q4. What is *args?
# if we want to pass multiple numbers to arguments then we use *args and its gives result in tuple

# Q5. What is **kwargs?
# if we want to pass multiple key value pairs to
#  the arguments we can use **kwargs as result it give dictionary

# Q6. What data type does *args store?
# it gives tuple datatype

# Q7. What data type does **kwargs store?
# it gives dictionary data type

# Q8. What is a lambda function?
# it small way to write anonymous function 

# Q9. Difference between map() and filter()?
# map() used to run function or method on every element
# while filter 

# Q10. What is a module?
# module is used to resuse the code like its resuable code file

# Q11. Difference between a module and package?
# module is single file which resuable code file and package which handle multiple files and folders structure

# Q12. Why do we use exception handling?
# to ensure and run the code with exceptioins

# # Q13. Difference between except, else, and finally?
# except takes the error arguments and we can define theer what will be the error
# else give the result or anything we else
# finally gives the result no matter what will be the erro and all

# Q14. What does raise do?
# raise is used to write error messages in short



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
   print("cannot divided by zero")
finally:
   print("The result is this :",result)

# Output question
# What will this produce?
def test(*args, **kwargs):
    print(args)
    print(kwargs)

test(10, 20, 30, name="MJ", age=24)

#it will give
[10,20,30]
{name : "Mj",age : 24}
