function binary_search(arr, target) {
    let low = 0, high = arr.length - 1;
    while (low <= high) {
        let mid = low + Math.floor((high - low) / 2);
        if (arr[mid] === target) return mid;
        else if (arr[mid] < target) low = mid + 1;
        else high = mid - 1;
    }
    return -1;
}


const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


console.log(binary_search(arr, 6));