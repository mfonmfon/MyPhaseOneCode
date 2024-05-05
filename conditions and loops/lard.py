first_num = int(input("Enter first number: "))

second_num = int(input("Enter second number: "))

third_num = int(input("Enter third number: "))



sum = first_num + second_num + third_num

product = first_num * second_num * third_num

average = sum / 3

print(sum, product)



if first_num > second_num and second_num > third_num:
	print ("the largest number is ", first_num )


if second_num < first_num and third_num < first_num:
	print("the smallest number is ", third_num,)