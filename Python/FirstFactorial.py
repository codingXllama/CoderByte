#creating the method for finding the factorial for a number
#we take in the number and return it's factorial


def FirstFactorial(num):

    # code goes here
    #this is the base case num=1
    if num == 1:
        return 1

    #using recursive approach for determining Factorial for a given number
    else:
        return num * FirstFactorial(num - 1)


# keep this function call here
print(FirstFactorial())
