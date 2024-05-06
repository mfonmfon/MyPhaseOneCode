const prompt = require("prompt-sync")();

//let login = false;
//let message = login ? console.log("user successfully login") : console.log("failed to login")

//let password = true;



let left_operand = prompt("Enter the left operand ")
let right_operand = prompt("Enter the right operand ")

let operator;

let add = left_operand + right_operand
let subtract;
let multiply;
let divide;


let operator = add ? console.log("the sum of the left operand and the right operand is: " + add) : console.log("you got a wrong answer")

operator = subtract ? console.log("The differnce of the left and right operand is: ",  subtract) : console.log("you got the wrong answer")

operator = multiply ? console.log("The product of the left and the right operand is: ", multiply) : console.log("you got the wrong answer")

operator = divide ? console.log("The division of the left and the right operand is: ", divide) : console.log("you got the wrong answer")

 

