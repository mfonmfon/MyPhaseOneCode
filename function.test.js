const add = require("./handa.js");

test("add two numbers " , () => {
	let numberOne = 2;
	let numberTwo = 5;
	
	let ans = add(numberOne, numberTwo)
	expect(ans).toBe(7);


});

const subtract = require("./handa.js");
test ("subtract two numbers " , () => {;
	let firstNumber = 2;
	let secondNumber = 2;

	let result = subtract(firstNumber, secondNumber);
	expect(result).toBe(4);



});