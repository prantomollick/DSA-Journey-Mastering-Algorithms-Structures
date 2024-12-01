function fibonacci(n, memo) {
    if (n === 0 || n === 1) return 1;
    if (memo[n] !== -1) return memo[n];
    memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
    return memo[n];
}

const n = 10;
const memo = Array(n + 1).fill(-1);
console.log(memo);

console.log(fibonacci(n, memo));
console.log(memo);
