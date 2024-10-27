//approach 2: Reverse method;

function rotate(nums, k) {
  let n = nums.length;
  k = k % n;

  //Helper function to reverse a portion of the array
  function reverse(start, end) {
    while (start < end) {
      [nums[start], nums[end]] = [nums[end], nums[start]];
      start++;
      end--;
    }
  }

  reverse(0, n - 1);
  reverse(0, k - 1);
  reverse(k, n - 1);
}
