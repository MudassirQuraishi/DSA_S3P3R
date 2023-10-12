/**
 * Print the lowercase weekday name based on the weekday number using a switch statement.
 *
 * @param {number} n - The weekday number (1 to 7, where 1 is Monday and 7 is Sunday).
 */
function weekdayName(n) {
	switch (n) {
		case 1:
			console.log("monday");
			break;
		case 2:
			console.log("tuesday");
			break;
		case 3:
			console.log("wednesday");
			break;
		case 4:
			console.log("thursday");
			break;
		case 5:
			console.log("friday");
			break;
		case 6:
			console.log("saturday");
			break;
		case 7:
			console.log("sunday");
			break;
		default:
			console.log("invalid");
	}
}

// Example usage:
let dayNumber = 3;
console.log(`Determining weekday name for day number: ${dayNumber}`);
weekdayName(dayNumber);
