/**
 * Find and print the largest of three numbers.
 *
 * @param {number} a - The first number.
 * @param {number} b - The second number.
 * @param {number} c - The third number.
 */
function findMax(a, b, c) {
	if (a > b && a > c) {
		console.log(`The maximum number is: ${a}`);
	} else if (b > c) {
		console.log(`The maximum number is: ${b}`);
	} else {
		console.log(`The maximum number is: ${c}`);
	}
}

// Example usage:
let num1 = 3;
let num2 = 5;
let num3 = 1;

console.log(`Finding the maximum among ${num1}, ${num2}, and ${num3}:`);
findMax(num1, num2, num3);
