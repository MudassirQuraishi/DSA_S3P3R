/**
 * Print the cost based on the given distance.
 *
 * @param {number} distance - The distance for which cost needs to be calculated.
 */
function printCost(distance) {
	if (distance <= 100) {
		console.log("Cost: 5");
	} else if (distance > 100 && distance <= 500) {
		console.log("Cost: 8");
	} else if (distance > 500 && distance <= 1000) {
		console.log("Cost: 10");
	} else if (distance > 1000) {
		console.log("Cost: 12");
	}
}

// Example usage:
let distance = 700;
console.log("Calculating cost for distance: " + distance);
printCost(distance);
