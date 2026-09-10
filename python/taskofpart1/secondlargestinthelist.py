# Q15. Write a program to find the second-largest number in a list.
numbers = [1,2,3,4,5]
largest = numbers[0]
secondLargest = numbers[0]

for num in numbers:
    if num > largest:
        secondLargest = largest
        largest = num
    elif num > secondLargest and num != largest:
        secondLargest = num

print("The second largest number is:",secondLargest)