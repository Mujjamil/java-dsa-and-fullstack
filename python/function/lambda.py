def square(x):
    return x*x


print(square(5))

triangle = lambda x: x*x*x #lambda is small anonymous function 

print(triangle(5))



# numbers = [1,2,3,4,5]
# squares = []

# for x in numbers:
#     squares.append(x * x)

# print(squares)


numbers = [1,2,3,4]
squares = list(map(lambda x:x*x,numbers))

print(square)

even = list(filter(lambda x : x % 2 ==0 , numbers))
print(even)