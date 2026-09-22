# Pascal's Triangle — Java 8 Solution

## Problem Statement
Given an integer `numRows`, return the first `numRows` of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

### Example 1
**Input:** `numRows = 5`  
**Output:**  
```
[[1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]]
```

### Example 2
**Input:** `numRows = 1`  
**Output:**  
```
[[1]]
```
## Solution Approach

Pascal’s Triangle builds row by row:
- The **first row** is always `[1]`.
- Each subsequent row starts and ends with `1`.
- Any middle element is the sum of the two elements directly above it from the previous row.

**Logic with Example (`numRows = 5`):**
1. Row 1 → `[1]`
2. Row 2 → `[1, 1]`
3. Row 3 → Previous row `[1, 1]` → middle element = `1+1 = 2` → `[1, 2, 1]`
4. Row 4 → Previous row `[1, 2, 1]` → middle elements = `1+2=3`, `2+1=3` → `[1, 3, 3, 1]`
5. Row 5 → Previous row `[1, 3, 3, 1]` → middle elements = `1+3=4`, `3+3=6`, `3+1=4` → `[1, 4, 6, 4, 1]`

---
# Pascal's Triangle — Java 8 Solution

## Problem Statement
Given an integer `numRows`, return the first `numRows` of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

---

## Java 8 Code

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        // Base case: first row is always [1]
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Build each row from the previous one
        for (int row = 1; row < numRows; row++) {
            List<Integer> prevRow = triangle.get(row - 1);
            List<Integer> newRow = new ArrayList<>();

            // First element is always 1
            newRow.add(1);

            // Middle elements are sum of two above
            for (int j = 1; j < row; j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element is always 1
            newRow.add(1);

            triangle.add(newRow);
        }

        return triangle;
    }

    // Demo
    public static void main(String[] args) {
        Solution sol = new Solution();
        int numRows = 5;
        List<List<Integer>> result = sol.generate(numRows);
        System.out.println(result);
    }
}


## Complexity Analysis
- **Time Complexity:** `O(numRows²)` — each row is built element by element.  
- **Space Complexity:** `O(numRows²)` — we store all rows in a list.

---
```

Would you like me to also add an **ASCII pyramid diagram** of Pascal’s Triangle (like a visual triangle of numbers) to make the README more engaging for GitHub viewers?
