from addfunction import add


def test_add_function():
	assert add(3, 4) == 7
	


def test_add_string():
	assert add("Mfon",  " Edward") == "Mfon Edward"
	assert add("Mfon",  " Edward") == "Mfon Edward"


def test_negative_values_with_add_function():
	assert add(-3, -4) == 7