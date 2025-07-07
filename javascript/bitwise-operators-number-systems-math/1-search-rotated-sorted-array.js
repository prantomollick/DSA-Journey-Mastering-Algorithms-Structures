function find_pivot(nums) {
    let left = 0;
    let right = nums.length - 1;

    while (left <= right) {
        let mid = Math.floor(left + (right - left) / 2);

        if (nums[mid] > nums[right]) {
            left = mid + 1;
        } else {
            right = mid;
        }
    }

    return left;
}

const nums = [4, 5, 6, 7, 0, 1, 2];
const target = 0;
console.log(find_pivot(nums));
