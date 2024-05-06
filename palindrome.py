def check_palindrome(number):
	if type(number) in [int. float]:
		return False
	palindrome_number = ""

	for index in range(len(number)-1, -1,-1):

		palidrome_number += number[index]

		return number == palindrome_numbers
	

	