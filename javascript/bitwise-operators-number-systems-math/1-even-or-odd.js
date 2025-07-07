function isEven(num) {
    // Using bitwise AND operator to check if the number is even
    return (num & 1) === 0;
}

console.log(isEven(4));  // true
console.log(isEven(5));  // false