from maximation import summation


def test_summation_func():
	assert summation(1, 2, 3, 4, 5) == 15
	assert summation(4, 5) == 9
	assert summation(5, 7, 9) == 21
	assert summation(2, 3, 6, 7, 7, 8, 10, 40, 20, 25) == 128