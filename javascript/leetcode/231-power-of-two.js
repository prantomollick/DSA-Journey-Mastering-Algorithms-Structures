//  Approach 1: "The Division Detective"

function isPowerOfTwo(n) {
    //edge case
    if (n <= 0) return false;
    if (n === 1) return true; // 2^0 = 1

    let isPowerOfTwo = false;
    while (n > 0) {
        n = n / 2

        if (n === 1) {
            isPowerOfTwo = true;
        }
    }

    return isPowerOfTwo;
}

// console.log(isPowerOfTwo(2));


function isPowerOfTwo2(n) {
    //edge case
    if (n <= 0) return false;
    if (n === 1) return true; // 2^0 = 1
    
    while (n > 1) {
        
        if (n % 2 !== 0) {
            return false;
        }
        n = n / 2
    }
    return isPowerOfTwo;
}

console.log(isPowerOfTwo(127));


// The Math Wizard