# LeetCode 66 — Plus One

## Easy Java 8 Solution

```java
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
````

 ## Simple Logic

 1. Start from the **last digit**.
2. If the digit is **less than 9** → add `1` and return.
3. If the digit is **9** → make it `0` and continue to the left.
4. If **all digits are 9** → create a new array with `1` at the beginning.

 ## Example 1

 For:

```
[1, 2, 3]
      ↑
```

 `3 < 9` → `3 + 1 = 4`

 Result:

```
[1, 2, 4]
```

 ## Example 2

 For:

```
[1, 2, 9]
```

```
9 → 0
2 → 3
```

 Result:

```
[1, 3, 0]
```

 ## Example 3 — All Digits Are 9

 For:

```
[9, 9]
```

```
9 → 0
9 → 0
```

 All digits were `9`, so create a new array with `1` at the beginning:

```
[1, 0, 0]
```

 ## Complexity

 - **Time:** `O(n)`
- **Space:** `O(1)` normally
- **Extra Space:** `O(n)` only when all digits are `9`

```
