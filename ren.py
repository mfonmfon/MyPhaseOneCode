
grade = int(input("Enter your grade "))

if grade >= 80 and  100:
	print("A")

elif grade >= 65 and 79:
	print("B")

elif grade >= 50 and 64:
	print("C")

elif grade >= 40 and 49:
	print("D")

elif grade > 100:
	print("you are a thief")
else: print("failed")