/**
 * Find and print the maximum between two numbers.
 *
 * @param {number} a - The first number.
 * @param {number} b - The second number.
 */
function findMax(a, b) {
	let result = a > b ? a : b;
	console.log(`Finding the maximum between ${a} and ${b}:`);
	console.log(`Maximum: ${result}`);
}

// Example usage:
let a = 3;
let b = 5;
findMax(a, b);
