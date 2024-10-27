function sumOfArrayElements(arr, index) {
  if (index <= 0) {
    return 0;
  }
  return sumOfArrayElements(arr, index - 1) + arr[index - 1];
}

arr = [15, 12, 13, 10];
// Output : 50
console.log(sumOfArrayElements(arr, arr.length));
