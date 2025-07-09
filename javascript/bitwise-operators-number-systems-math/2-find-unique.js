// Find the unique number in an array where every element appears twice except for one.

const array = [2, 3, 3, 4, 2, 6, 4];


function findUnique(arr) {
    let unique = 0;
    for (let i = 0; i < arr.length; i++) {
        unique ^= arr[i]; // XOR operation
    }
    return unique;
}

console.log(findUnique(array)); // Output: 6
