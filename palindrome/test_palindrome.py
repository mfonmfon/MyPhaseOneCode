from palindrome import check_palindrome
from max_value import maximum_number

def test_for_check_palindrome_returns_true():
	assert check_palindrome('dad') == True
	assert check_palindrome('12121') == True
	assert check_palindrome('neveroddoreven') == True


def test_for_check_palindrome_returns_false():
	assert is_check_palidrome('ball') == false
	assert check_palindrome('10111') == false


def test_for_check_palindrome_returns_false():
	assert check_palindrome(10) == false
	assert check_palindrome(10.5) == false



def test_for_maximum_number_returns_maximum():
	assert maximum_number(2) == 4
	



