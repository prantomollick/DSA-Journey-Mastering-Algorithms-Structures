// Beginner human approach - exactly mimicking manual process

function uniquePathsBeginner(m, n) {
    const table = [];

    for (let i = 0; i < m; i++) {
        table[i] = [];

        for (let j = 0; j < n; j++) {
            table[i][j] = 0;
        }
    }

    for (let i = 0; i < m; i++) table[i][0] = 1;
    for (let j = 0; j < n; j++) table[0][j] = 1;


    // Fill the rest using my discovery
    for (let i = 1; i < m; i++) {
        
        for(let j = 1; j < n; j++) {
            table[i][j] = table[i - 1][j] + table[i][j - 1];
        }
        
    }

    return table[m-1][n-1];
}


console.log(uniquePathsBeginner(3, 2));
