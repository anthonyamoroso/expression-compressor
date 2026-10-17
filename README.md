# Kata: Expression Compressor

The goal of this kata is to compress a string based on the principle of **RLE (*Run-Length Encoding*)**.

---

## 🎯 Step 1: Compress a string

Given an input string:
- Return the string by replacing each consecutive run of identical characters with the character itself, followed by the count of its consecutive occurrences.

### Example

```text
Input  : "aaaabbbcca"
Output : "a4b3c2a1"
```

---

## 🚀 Step 2: Remove unnecessary counters

If a character appears only once consecutively, do not display the counter.

### Example

```text
Input  : "aaaabbbccab"
Output : "a4b3c2ab"
```

---

## 🔄 Step 3: Decompress the string

Perform the reverse operation, applying the same rules in reverse.

### Example

```text
Input  : "a4b3c2a1b"
Output : "aaaabbbccab"
```
