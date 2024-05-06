print("Welcome to E-Store:")

name = input("Please enter customer name: ")

item_cost = int(input("Please enter cost for item: "))


discount = 10
counter = 1
original_amount = 0

while counter <= 9:

	item_cost = int(input("please enter cost for item: "))
	counter += 1

	discount_amount = original_amount *  discount / 100
	percentage = counter - discount_amount 


	if percentage >= 200:
		print(percentage)

		print("Customer Name: ", name)
		print("Original Cost: ", original_amount)
		print("discount cost ", ("no discount added"))
		print("Thanks for your patronage!")
		