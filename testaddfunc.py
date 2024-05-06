from add import addition


def test_addition_function():
	assert addition(3, 4) == 7
	


def test_addition_string():
	assert addition("Mfon",  " Edward") == "Mfon Edward"
	assert addition("Mfon",  " Edward") == "Mfon Edward"


def test_negative_values_with_addition_function():
	assert addition(-3, -4) == 7