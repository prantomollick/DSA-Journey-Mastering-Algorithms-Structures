function recurSum(n) {
  if (n <= 1) return n;
  return n + recurSum(n - 1);
}

console.log(recurSum(6));
