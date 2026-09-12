# Palindrome Number

 ## Problem Statement

 Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.

 A **palindrome number** reads the same from left to right and right to left.

 ### Examples

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from both directions.
```

 ## Approach

 We can solve this using **mathematical operations** instead of converting the number to a string.

 The idea is to reverse the number and compare it with the original number.

 For example:

```
x = 121

Reverse:
121 % 10 = 1
12 % 10  = 2
1 % 10   = 1

Reversed number = 121

Original = 121
Reversed = 121

Therefore, it is a palindrome.
```

 ### Important Cases

 - Negative numbers are **never** palindromes.
- Numbers ending in `0` are not palindromes, except `0` itself.
  - Example: `10 → 01`, so it is not a palindrome.

---

 ## Java 8 Solution

```
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int original = x;
        int reverse = 0;

        while (x != 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        return original == reverse;
    }
}
```

 ## Logic Step-by-Step

 For `x = 121`:

 ### Step 1

```
original = 121
reverse = 0
```

 ### Step 2

 Get the last digit:

```
digit = 121 % 10 = 1
reverse = 0 * 10 + 1 = 1
x = 121 / 10 = 12
```

 ### Step 3

```
digit = 12 % 10 = 2
reverse = 1 * 10 + 2 = 12
x = 12 / 10 = 1
```

 ### Step 4

```
digit = 1 % 10 = 1
reverse = 12 * 10 + 1 = 121
x = 1 / 10 = 0
```

 The loop ends.

```
original = 121
reverse  = 121
```

 Therefore:

```
return true;
```

---

 ## Example: `x = 10`

```
original = 10

digit = 10 % 10 = 0
reverse = 0
x = 1

digit = 1 % 10 = 1
reverse = 1
x = 0
```

 Now:

```
original = 10
reverse  = 1
```

 They are different, so:

```
return false;
```

---

 ## Complexity

 Let `n` be the number of digits in `x`.

 - **Time:** `O(n)`
- **Space:** `O(1)`

 The solution does not use a string and uses only constant extra space.
