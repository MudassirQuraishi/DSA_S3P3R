/**
 * Swap two integers a and b.
 *
 * @param {number} a - The first integer.
 * @param {number} b - The second integer.
 * @returns {Array} An array containing the swapped values of a and b.
 */
function swap(a, b) {
	let temp = a;
	a = b;
	b = temp;
	return [a, b];
}

// Example usage:
let a = 3;
let b = 4;
console.log("Before swapping:");
console.log("a = " + a);
console.log("b = " + b);

[a, b] = swap(a, b);

console.log("After swapping:");
console.log("a = " + a);
console.log("b = " + b);
