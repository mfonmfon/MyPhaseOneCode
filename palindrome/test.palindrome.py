from palindrom import check_palindrome

def check_palindrome():
	assert check_palindrome(123432) == 234321
	assert check_palindrome("dallay") == "yallad"