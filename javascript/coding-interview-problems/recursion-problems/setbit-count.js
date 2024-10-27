function countSetBits(n) {
  //Base case: no set bits in 0
  if (n === 0) {
    return 0;
  }

  if (n & 1) {
    // If set, count this bit and recursively count the remaining bits
    return 1 + countSetBits(n >> 1);
  } else {
    // If not set, just recursively count the remaining bits
    return countSetBits(n >> 1);
  }
}

console.log(countSetBits(21));
