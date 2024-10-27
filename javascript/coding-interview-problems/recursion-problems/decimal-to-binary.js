function decimalToBinary(n) {
  if (n === 0) return 0;
  return (n % 2) + 10 * decimalToBinary(parseInt(n / 2));
}

// Driver code
var decimal_number = 5;
console.log(decimalToBinary(decimal_number));
