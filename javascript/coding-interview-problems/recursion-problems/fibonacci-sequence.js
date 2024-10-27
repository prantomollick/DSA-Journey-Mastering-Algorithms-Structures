function fibonacciSequence(n) {
  if (n === 0) {
    return 0;
  } else if (n == 1) {
    return 1;
  } else {
    return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
  }
}

const n = 7;
for (let i = 0; i < n; i++) {
  console.log(fibonacciSequence(i));
}
