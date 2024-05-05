
customer_name = input("What is the customer's Name")

items = input("What did the user buy")

quantity = int(input("How muc per unit: "))

price = int(input("How many pieces?  "))



user_response = input("Do you want to add more items to your cart");

if user_response == str("yes"):
	items = input("What did the user buy  ")

	quantity = int(input("How muc per unit  "))

	price = int(input("How many pieces?  "))	



elif user_response == str("no"):
 
	cashier_name = input("What is your name (cashier's name)  ")
	dicount = int(input("How much discount will the customer get  "))

	print("SEMICOLON STORE")
	print("MAIN BRANCH")
	print("LOCATION" + "HERBERT MACAULY WAY, SABO YABA, LAGOS")
	print("TEL: ")
	#print("DATE: " + date)
	print("Cashier name: " + cashier_name)
	print("==================================================")
	print("        ITEM   \t   QTY   \t    PRICE  \t  TOTAL ")
	print("--------------------------------------------------")

	numbers = 0
	subTotal = 0
	vat = 0
	discount = 0
	for numbers in range(2):
		total = quantity * price / 100
		subTotal = total - discount + vat
		

		print("\t  " + items, "\t  ", quantity, "\t  ", price ,"\t  ", float(total) )
		print("subTotal: " + total)
		print(f"Discount: " + float(discount))
		#print("Vat @17.5" + vat)
	


	


