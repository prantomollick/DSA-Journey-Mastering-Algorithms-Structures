function bubbleSort(arr) {
  // 1. Loop through the array from the beginning to the end.
  for (let i = 0; i < arr.length - 1; i++) {
    //2. Loop through the array again, but this time comparing adjacent elements
    for (let j = 0; j < arr.length - i - 1; j++) {
      //3. Compare the current element with the next one
      if (arr[j] > arr[j + 1]) {
        //4. swap the elements if they're in the wrong order
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }

  return arr;
}

// Example usage:
let numbers = [5, 2, 9, 1, 7];
let sortedNumbers = bubbleSort(numbers);
console.log(sortedNumbers); // Output: [1, 2, 5, 7, 9]
