# LeetCode 7 — Reverse Integer

## Problem Statement

Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range:

```text
[-2^31, 2^31 - 1]
```

return `0`.

**Note:** The environment does not allow you to store 64-bit integers.

## Example

**Input:**

```text
x = 123
```

**Output:**

```text
321
```

**Explanation:**

```text
123 → 321
```

We take the digits from right to left:

```text
3 → ans = 3
2 → ans = 32
1 → ans = 321
```

## Logic

Use `% 10` to get the last digit:

```java
digit = x % 10;
```

Use `/ 10` to remove the last digit:

```java
x = x / 10;
```

Build the reversed number using:

```java
ans = ans * 10 + digit;
```

Before updating `ans`, check for overflow:

```java
if (ans > Integer.MAX_VALUE / 10 ||
    ans < Integer.MIN_VALUE / 10) {
    return 0;
}
```

### Java 8 Solution

```java
class Solution {

    public int reverse(int x) {

        int ans = 0;

        while (x != 0) {

            // Get last digit
            int digit = x % 10;

            // Remove last digit
            x = x / 10;

            // Check overflow
            if (ans > Integer.MAX_VALUE / 10 ||
                ans < Integer.MIN_VALUE / 10) {
                return 0;
            }

            // Add digit to reversed number
            ans = ans * 10 + digit;
        }

        return ans;
    }
}
```

## Complexity

- **Time:** `O(log |x|)`
- **Space:** `O(1)`
