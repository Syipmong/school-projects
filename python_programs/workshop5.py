#Define and call a function that takes two arguments and returns the average of those numbers in python?

def average(a, b):
    return (a + b) / 2

print(average(10, 20))

#Define and call a function named CelsiusToFaren that takes a temperature in Celsius and convert to it’s equivalent in Fahrenheit. The Celsius to Fahrenheit formula is: (Celsius * 9/5) + 32 = Fahrenheit?
def CelsToFaren(Celsius):
  Fahrenheit = (Celsius * 9/5) + 32
  return Fahrenheit

print(CelsToFaren(20))

#Write program that prints every alternate number from 1 to 20.Use for loop?
def alt_num():
    for i in range(1, 21, 2):
        print(i)

alt_num()


#Write a program that prints the following sequence of numbers.
def num_seq():
   for i in range(1, 11):
      for x in range(i):
        print(i, end=" ")
      print()
num_seq()