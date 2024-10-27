function findMin(arr, n) {
  if (n === 1) return arr[0];

  return Math.min(arr[n - 1], findMin(arr, n - 1));
}

function findMax(arr, n) {
  if (n === 1) return arr[0];
  return Math.max(arr[n - 1], findMax(arr, n - 1));
}

const arr = [1, 4, 45, 6, -50, 10, 2];
const n = arr.length;

console.log(findMin(arr, n));
console.log(findMax(arr, n));
