/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
  let i = 0;
  let j = 0;
  const arr = new Array(nums1.length);
  let k = 0;

  while (i < m && j < n) {
    if (nums1[i] <= nums2[j]) {
      arr[k] = nums1[i];
      k++;
      i++;
    } else {
      arr[k] = nums2[j];
      k++;
      j++;
    }
  }

  while (i < m) {
    arr[k] = nums1[i];
    k++;
    i++;
  }

  while (j < n) {
    arr[k] = nums2[j];
    k++;
    j++;
  }

  return arr;
};

let nums1 = [1, 2, 3, 0, 0, 0],
  m = 3,
  nums2 = [2, 5, 6],
  n = 3;

output = [1, 2, 2, 3, 5, 6];

// console.log(merge(nums1, m, nums2, n));

var merge2 = function (nums1, m, nums2, n) {
  let i = 0;
  let j = 0;

  while (i < m && j < n) {
    if (nums1[i] <= nums2[j]) {
      i++;
    } else {
      let temp = nums2[j];
      nums2[j] = nums1[i];
      nums1[i] = temp;
      i++;
    }
  }

  // while (i < m) {
  //     arr[k] = nums1[i];
  //     k++;
  //     i++;
  // }

  while (j < n) {
    nums1[i] = nums2[j];
    i++;
    j++;
  }

  // for(let i = 0; i < nums1.length; i++) {
  //     nums1[i] = arr[i];
  // }

  return nums1;
};
