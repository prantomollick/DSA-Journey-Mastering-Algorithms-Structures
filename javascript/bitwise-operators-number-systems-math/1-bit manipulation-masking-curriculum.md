# 🧠 Bit Manipulation & Masking Curriculum for Beginners to Pro

### 👨‍🏫 Curated by a DSA Mentor (Inspired by 17+ years of teaching)

> ✅ Designed for Computer Science students, DSA learners, and software engineers
> ✅ Explained with real-life uses, visuals, and bitwise logic
> ✅ Perfect for interviews, competitive coding, and low-level system logic

---

## 📘 **Phase 1: Foundation of Binary & Bits**

| # | Topic                              | What You’ll Learn                                                      |                                                |
| - | ---------------------------------- | ---------------------------------------------------------------------- | ---------------------------------------------- |
| 1 | **What is a Bit?**                 | Binary system (0s & 1s), memory structure, how computers store numbers |                                                |
| 2 | **Bit Positions & Number System**  | Bit positions from right to left, place value of bits (2⁰, 2¹, 2²...)  |                                                |
| 3 | **Binary to Decimal & Vice Versa** | Manual conversion and mental math                                      |                                                |
| 4 | **Bitwise Operators Intro**        | `AND (&)`, \`OR (                                                      | )`, `XOR (^)`, `NOT (\~)\` — with truth tables |

---

## 🔧 **Phase 2: Left & Right Shift Operators**

| # | Topic                           | What You’ll Learn                                           |
| - | ------------------------------- | ----------------------------------------------------------- |
| 5 | **Left Shift (`<<`)**           | Multiply by 2ⁿ, visualize bit movement, real-life use cases |
| 6 | **Right Shift (`>>`, `>>>`)**   | Divide by 2ⁿ, signed vs. unsigned shifts                    |
| 7 | **Use Cases of Shifts**         | Data compression, hash codes, optimization                  |
| 8 | **Visual Animation & Practice** | Exercises to simulate shifting with bit boxes               |

---

## 🎯 **Phase 3: Understanding Bit Masks**

| #  | Topic                     | What You’ll Learn                                            |                                     |
| -- | ------------------------- | ------------------------------------------------------------ | ----------------------------------- |
| 9  | **What is a Bitmask?**    | Binary mask patterns for selecting, modifying bits           |                                     |
| 10 | **Set a Bit**             | \`n                                                          | (1 << k)\` — turn on a specific bit |
| 11 | **Clear a Bit**           | `n & ~(1 << k)` — turn off a specific bit                    |                                     |
| 12 | **Toggle a Bit**          | `n ^ (1 << k)` — flip a specific bit                         |                                     |
| 13 | **Check a Bit**           | `n & (1 << k)` — check ON/OFF status of a bit                |                                     |
| 14 | **Hands-on Bit Practice** | Real-life coding tasks like toggling bulbs, permission flags |                                     |

---

## 🧮 **Phase 4: XOR and Unique Element Problems**

| #  | Topic                          | What You’ll Learn                                     |
| -- | ------------------------------ | ----------------------------------------------------- |
| 15 | **How XOR Works**              | Properties: `x ^ x = 0`, `x ^ 0 = x`                  |
| 16 | **Find Single Unique Number**  | Use XOR to find the number that appears once          |
| 17 | **Find Two Unique Numbers**    | Bit mask + partition strategy using rightmost set bit |
| 18 | **Use of XOR in Cryptography** | Secure hashing, checksum, encoding                    |

---

## 💡 **Phase 5: Power of Two & Optimization**

| #  | Topic                          | What You’ll Learn                                 |
| -- | ------------------------------ | ------------------------------------------------- |
| 19 | **What is Power of Two?**      | Binary format of powers of 2: `1, 2, 4, 8, 16...` |
| 20 | **Check Power of Two**         | `(n & (n-1)) === 0` trick                         |
| 21 | **Generate All Powers of Two** | Loop or bit shift to generate list                |
| 22 | **Use in Memory & OS**         | File sizes, RAM blocks, permission systems        |

---

## 🧰 **Phase 6: Masking-Based Problems & Real-World**

| #  | Topic                               | What You’ll Learn                             |
| -- | ----------------------------------- | --------------------------------------------- |
| 23 | **Subset Generation (Bitmasking)**  | Use `1 << n` to generate all subsets          |
| 24 | **Permissions System with Bitmask** | Read/write/admin flags using masks            |
| 25 | **LED On/Off Simulation**           | Light bulbs ON/OFF using toggle/set/check     |
| 26 | **Bit Count (Hamming Weight)**      | Count set bits in `n` using `n & (n - 1)`     |
| 27 | **Binary Palindromes / Patterns**   | Special pattern-based bit logic               |
| 28 | **Advanced Practice Challenges**    | Toggle toggles, odd one out, encryption ideas |

---

## 💼 **Phase 7: Interview Preparation**

| #  | Topic                                 | What You’ll Learn                                                |
| -- | ------------------------------------- | ---------------------------------------------------------------- |
| 29 | **Top 10 Bit Manipulation Questions** | From LeetCode, HackerRank, Codeforces                            |
| 30 | **Pattern Recognition**               | When to use XOR, AND, shift in real problems                     |
| 31 | **Mock Interview Round**              | Case-based questions + code challenge                            |
| 32 | **Build a Portfolio Project**         | Simple Bitmask-based mini-system (flag manager or subset viewer) |
