/**
 * Find and print the maximum between two numbers.
 *
 * @param {number} a - The first number.
 * @param {number} b - The second number.
 */
function findMax(a, b) {
	if (a > b) {
		console.log(`The maximum number is: ${a}`);
	} else {
		console.log(`The maximum number is: ${b}`);
	}
}

// Example usage:
let num1 = 7;
let num2 = 12;

console.log(`Finding the maximum between ${num1} and ${num2}:`);
findMax(num1, num2);
