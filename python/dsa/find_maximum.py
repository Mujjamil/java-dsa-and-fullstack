

def find_max(numbers):
    maximum = numbers[0]

    for number in numbers:
        if number > maximum:
            maximum = number

    return maximum


def find_min(numbers):
    minimum = numbers[0]
    for number in numbers:
        if number < minimum:
            minimum = number

    return minimum


def reverse(numbers):
    result = []
    for i in range(len(numbers)-1,-1,-1):
        result.append(numbers[i])

    return result 

def sec_largest(numbers):
    second_largest = numbers[0]
    largest = numbers[0]

    for num in numbers:
        if num > largest:
            second_largest = largest
            largest = num
        elif num > second_largest and num != largest:
            second_largest = num

    return second_largest


print(reverse([1,2,3,4,5,6,7]))
print(find_max([1,2,3,4,5,6]))
print(find_min([1,2,3,4,5,6]))
print(sec_largest([1,2,3,4,5,6]))




       

   




        
       