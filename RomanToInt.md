# 12. Integer to Roman

## Problem Statement

Given an integer `num`, convert it to a Roman numeral.

### Roman Numeral Values

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

### Special Cases

| Number | Roman |
|--------|-------|
| 4      | IV    |
| 9      | IX    |
| 40     | XL    |
| 90     | XC    |
| 400    | CD    |
| 900    | CM    |

## Examples

### Example 1

**Input:**

```text
3749
````

 **Output:**

```
MMMDCCXLIX
```

 **Explanation:**

```
3000 = MMM
700  = DCC
40   = XL
9    = IX

3749 = MMM + DCC + XL + IX
     = MMMDCCXLIX
```

 ### Example 2

 **Input:**

```
58
```

 **Output:**

```
LVIII
```

 **Explanation:**

```
50 = L
8  = VIII

58 = L + VIII
   = LVIII
```

 ### Example 3

 **Input:**

```
1994
```

 **Output:**

```
MCMXCIV
```

 **Explanation:**

```
1000 = M
900  = CM
90   = XC
4    = IV

1994 = M + CM + XC + IV
     = MCMXCIV
```

 ## Approach

 Use a **greedy approach**.

 Store the Roman numeral values from largest to smallest, including the subtractive cases:

```
1000 -> M
900  -> CM
500  -> D
400  -> CD
100  -> C
90   -> XC
50   -> L
40   -> XL
10   -> X
9    -> IX
5    -> V
4    -> IV
1    -> I
```

 For each value:

 1. Check if `num >= value`.
2. If yes, append the corresponding Roman symbol.
3. Subtract the value from `num`.
4. Repeat until `num` becomes `0`.

 ### Why Greedy Works

 We always choose the **largest possible value** first.

 For example, for `3749`:

```
3749 >= 1000 → M
2749 >= 1000 → M
1749 >= 1000 → M
749  >= 500  → D
249  >= 100  → C
149  >= 100  → C
49   >= 40   → XL
9    >= 9    → IX
```

 This produces:

```
MMMDCCXLIX
```

 ## Example

 For `1994`:

```
1994 >= 1000 → M
994  >= 900  → CM
94   >= 90   → XC
4    >= 4    → IV
```

 Therefore:

```
1994 = MCMXCIV
```

 ## Java 8 Solution

```
class Solution {
    public String intToRoman(int num) {
        int[] values = {
            1000, 900, 500, 400,
            100, 90, 50, 40,
            10, 9, 5, 4, 1
        };

        String[] symbols = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }

        return result.toString();
    }
}
```

 ## Dry Run

 For `num = 3749`:

```
3749 - 1000 = 2749 → M
2749 - 1000 = 1749 → M
1749 - 1000 = 749  → M

749 - 500 = 249 → D

249 - 100 = 149 → C
149 - 100 = 49  → C

49 - 40 = 9 → XL

9 - 9 = 0 → IX
```

 Result:

```
MMMDCCXLIX
```

 ## Complexity

 - **Time:** `O(1)`
- **Space:** `O(1)`

 Since `1 <= num <= 3999`, the number of operations is bounded.

 ## Key Point

 The main trick is to include the six subtractive cases:

```
900 → CM
400 → CD
90  → XC
40  → XL
9   → IX
4   → IV
```

 This makes the greedy solution simple and handles all valid Roman numeral representations.

```
