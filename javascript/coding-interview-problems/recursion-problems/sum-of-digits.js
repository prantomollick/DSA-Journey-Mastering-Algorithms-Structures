function sumOfDigit(n) {
  if (n === 0) return 0;
  return (n % 10) + sumOfDigit(parseInt(n / 10));
}

console.log(sumOfDigit(12345));
