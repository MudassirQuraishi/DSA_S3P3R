/**
 * Determine and print whether a candidate has passed or failed based on their marks.
 *
 * @param {number} marks - The marks for which pass/fail status needs to be determined.
 */
function hasPassed(marks) {
	let result = marks >= 40 ? "pass" : "fail";
	console.log(`Determining pass/fail status for marks: ${marks}`);
	console.log(result);
}

// Example usage:
let marks = 52;
hasPassed(marks);
