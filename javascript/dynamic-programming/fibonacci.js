function fibo(n, memo) {
    if (n === 0 || n === 1) return 1;
    if (memo[n] !== -1) return memo[n];
    memo[n] = fibo(n - 1, memo) + fibo(n - 2, memo);
    return memo[n];
}

const n = 10;
const memo = Array(n + 1).fill(-1);
console.log(memo);

console.log(fibo(n, memo));
console.log(memo);
