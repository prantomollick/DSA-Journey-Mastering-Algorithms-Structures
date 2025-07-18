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






// Approach 2: Space Optimization (Intermediate)

// Intermediate optimization - human discovers space saving
function uniquePathsOptimized_1(m, n) {
    let previousRow = new Array(n).fill(1);
    let currentRow = new Array(n);

    console.log("ROW 0: ", currentRow);

    for (let i = 1; i < m; i++) {
        currentRow[0] = 1;

        for (j = 1; j < n; j++) {
            // Current cell = cell above + cell to left
            currentRow[j] = previousRow[j] + currentRow[j - 1];
            console.log(`Row ${i}, Col ${j}: ${previousRow[j]} + ${currentRow[j-1]}`)
        }

        console.log(`Row ${i}: `, currentRow);

        // Swap arrays for next iteration
        [previousRow, currentRow] = [currentRow, previousRow];
    }


    return previousRow[n - 1];

}

// console.log(uniquePathsOptimized(3, 4));

function uniquePathsOptimized_2(m, n) {
     // Single array approach - most space efficient
    // একক অ্যারে পদ্ধতি - সবচেয়ে স্থান সাশ্রয়ী
    let dp = new Array(n).fill(1);
    console.log("Initial:", dp); // [1, 1, 1]

    for (let i = 1; i < m; i++) {
        for (let j = 1; j < n; j++) {
            // CRITICAL: dp[j] currently holds value from row above
            // গুরুত্বপূর্ণ: dp[j] বর্তমানে উপরের সারির মান ধরে আছে
            
            // dp[j-1] holds the left value (already updated for current row)
            // dp[j-1] বাম মান ধরে আছে (ইতিমধ্যে বর্তমান সারির জন্য আপডেটেড)

            const oldValue = dp[j];// Value from above (for debugging)
            const leftValue = dp[j - 1];// Value from left
            dp[j] = dp[j] + dp[j - 1]// above + left

            console.log(`Row ${i}, Col ${j}: ${oldValue} + ${leftValue} = ${dp[j]}`);

        }
        console.log(`After Row ${i}:`, dp);
    }

    return dp[n - 1];

}


console.log(uniquePathsOptimized_2(3, 4));
