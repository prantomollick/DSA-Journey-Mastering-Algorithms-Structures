function isMagic(n) {
    let sum = 0;

    while (n > 0 || sum > 9 ) {
        if (n === 0) {
            n = sum;
            sum = 0;
        }
        sum += n % 10;
        n = Math.floor(n / 10);
    }

    return sum === 1;
}

console.log(isMagic(50113)); // true
console.log(isMagic(12345)); // false