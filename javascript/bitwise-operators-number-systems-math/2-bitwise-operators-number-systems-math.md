Yes! Let’s dive into **real-world style coding problems** based on the power-of-2 check using the famous bitwise formula:

$$
\text{if } (n > 0) \text{ and } (n \,\&\, (n - 1)) == 0
$$

I’ll provide each problem with:

1. **Problem statement (English + Bengali)**
2. **Step-by-step explanation**
3. **Clean code solution**
4. **Time complexity**

---

## ✅ Problem 1: Check if a number is a power of 2

### 📄 English:

Write a function to check whether a given number is a power of 2.

### 📄 বাংলা:

একটি ফাংশন লিখো যা চেক করবে কোনো সংখ্যা ২ এর ঘাত কিনা।

### ✅ Solution:

```python
def is_power_of_two(n):
    return n > 0 and (n & (n - 1)) == 0
```

### 🧠 Why it works?

Because power-of-2 numbers have exactly **one 1 in binary**, and this trick clears that bit.

### ⏱ Time Complexity: O(1)

---

## ✅ Problem 2: Count how many numbers in a list are powers of 2

### 📄 English:

Given a list of integers, count how many are powers of 2.

### 📄 বাংলা:

একটি সংখ্যার তালিকা দেওয়া আছে। চেক করো কয়টি সংখ্যা ২ এর ঘাত।

### ✅ Example:

```python
arr = [1, 2, 3, 4, 5, 8, 9]
# Output: 4 (1, 2, 4, 8 are powers of 2)
```

### ✅ Solution:

```python
def count_powers_of_two(arr):
    def is_power(n):
        return n > 0 and (n & (n - 1)) == 0
    return sum(1 for x in arr if is_power(x))
```

### ⏱ Time Complexity: O(n)

---

## ✅ Problem 3: Next Power of 2 Greater Than or Equal to N

### 📄 English:

Given a number `n`, find the next power of 2 that is **greater than or equal to** `n`.

### 📄 বাংলা:

একটি সংখ্যা দেওয়া আছে। এর সমান বা তার চেয়ে বড় **সবচেয়ে ছোট ২ এর ঘাত** খুঁজে বের করো।

### ✅ Example:

* Input: 5 → Output: 8
* Input: 16 → Output: 16

### ✅ Solution (Python):

```python
def next_power_of_two(n):
    if n == 0:
        return 1
    power = 1
    while power < n:
        power *= 2
    return power
```

### ⏱ Time Complexity: O(log n)

---

## ✅ Problem 4: Is Only One Bit Set?

### 📄 English:

Check if a number has **only one bit set** in its binary representation.

This is the same as checking if it’s a power of 2, but includes **bit-level explanation**.

### 📄 বাংলা:

দেখো একটি সংখ্যার বাইনারি রূপে **একটিই 1 আছে** কিনা।

### ✅ Solution:

```python
def has_only_one_bit_set(n):
    return n > 0 and (n & (n - 1)) == 0
```

### ✅ Binary Example:

* 8 = `1000` ✅
* 6 = `0110` ❌

---

## ✅ Problem 5: Power of 4 Check (Advanced)

### 📄 English:

Check if a number is not only a power of 2, but also a power of **4**
(i.e., 1, 4, 16, 64, ...)

### 📄 বাংলা:

চেক করো কোনো সংখ্যা ২ এর ঘাত এবং **একই সাথে ৪ এর ঘাত** কিনা।

### ✅ Solution:

```python
def is_power_of_four(n):
    return n > 0 and (n & (n - 1)) == 0 and (n % 3 == 1)
```

#### 🧠 Why `% 3 == 1`?

Because **only powers of 4** among the powers of 2 leave a remainder 1 when divided by 3.

| Number | Power of 2? | Power of 4? | n % 3 |
| ------ | ----------- | ----------- | ----- |
| 4      | ✅           | ✅           | 1     |
| 8      | ✅           | ❌           | 2     |
| 16     | ✅           | ✅           | 1     |

