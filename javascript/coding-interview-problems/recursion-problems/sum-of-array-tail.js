// function sumOfArray(arr, n) {
//   if (n == 1) return arr[0];

//   return arr[n - 1] + sumOfArray(arr, n - 1);
// }

// const arr = [2, 55, 1, 7];

// console.log(sumOfArray(arr, arr.length));

function sumOfArray(arr, n) {
  if (n == 1) return arr[0];
  return arr[n - 1] + sumOfArray(arr, n - 1);
}

const arr = [2, 55, 1, 7];

console.log(sumOfArray(arr, arr.length));
