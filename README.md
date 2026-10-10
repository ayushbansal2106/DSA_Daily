# DSA Daily

> A personal, growing notebook of daily problem-solving practice across **LeetCode**, **GeeksforGeeks**, and **SQL**.

This repository records the problems I solve, the approaches I try, and the implementations I keep for revision. It is intentionally practical rather than a polished problem set: some questions have more than one Java solution, a few have Python equivalents, and the SQL section preserves database-focused practice separately from algorithmic code.

## At a glance

| What is here | Current count |
| --- | ---: |
| Problem folders | **96** |
| Solution files | **117** |
| LeetCode problem folders | **91** |
| GeeksforGeeks problem folders | **5** |
| Java solution files | **101** |
| Python solution files | **10** |
| SQL solution files | **6** |
| Problem statements / folder READMEs | **96** |

The language totals are intentionally not additive: the same problem can have Java and Python solutions, and every SQL problem also has a problem README.

## Platforms

### LeetCode

The main collection contains numbered LeetCode problems, from fundamentals such as [Two Sum](./0001-two-sum/), [Valid Parentheses](./0020-valid-parentheses/), and [Binary Search](./0704-binary-search/) to more involved array, sliding-window, and binary-search problems such as [Koko Eating Bananas](./0875-koko-eating-bananas/) and [Capacity to Ship Packages Within D Days](./1011-capacity-to-ship-packages-within-d-days/).

LeetCode SQL practice is kept in the same numbered problem-folder convention:

- [Customers Who Never Order](./0183-customers-who-never-order/)
- [Find Customer Referee](./0584-find-customer-referee/)
- [Big Countries](./0595-big-countries/)
- [Product Sales Analysis I](./1068-product-sales-analysis-i/)
- [Replace Employee ID With the Unique Identifier](./1378-replace-employee-id-with-the-unique-identifier/)
- [Customer Who Visited but Did Not Make Any Transactions](./1581-customer-who-visited-but-did-not-make-any-transactions/)

### GeeksforGeeks

GFG exercises are explicitly marked with `-GFG` so they can be distinguished from LeetCode folders at a glance:

- [Reverse Array in Groups](./701191-reverse-array-in-groups-GFG/)
- [Wave Array](./701198-wave-array-GFG/)
- [Missing in Array](./701889-missing-in-array-GFG/)
- [Largest in Array](./703297-largest-in-array-GFG/)
- [Rotate Array by One](./703298-rotate-array-by-one-GFG/)

## Languages and implementation style

### Java

Java is the primary implementation language in this archive. Most Java files follow the platform submission format (`class Solution` and the required method signature), making them easy to paste into the relevant judge. Repeated files with timestamps represent alternative attempts, refinements, or resubmissions rather than unrelated problems.

Examples:

- [Two Sum Java solutions](./0001-two-sum/)
- [Valid Anagram alternatives](./0242-valid-anagram/)
- [Valid Palindrome II alternatives](./0680-valid-palindrome-ii/)
- [Add Binary alternatives](./0067-add-binary/)

### Python

Python solutions are used for selected problems to compare concise implementations and revisit the same idea in another language. Current cross-language examples include [Valid Parentheses](./0020-valid-parentheses/), [Valid Palindrome](./0125-valid-palindrome/), [Happy Number](./0202-happy-number/), [First Unique Character in a String](./0387-first-unique-character-in-a-string/), and [Maximum Nesting Depth of the Parentheses](./1614-maximum-nesting-depth-of-the-parentheses/).

### SQL

SQL files focus on relational reasoning rather than data structures: filtering, joins, `NULL` handling, grouping, and identifying records that are absent from a related table. They live beside their LeetCode problem statement so the prompt and query can be reviewed together.

## Patterns covered so far

The repository is strongest in the following recurring patterns.

| Pattern | Representative folders | What the practice reinforces |
| --- | --- | --- |
| Arrays and in-place updates | [Remove Element](./0027-remove-element/), [Move Zeroes](./0283-move-zeroes/), [Apply Operations to an Array](./2460-apply-operations-to-an-array/) | Index management, stable compaction, and controlled mutation |
| Hash maps and frequency counting | [Two Sum](./0001-two-sum/), [Group Anagrams](./0049-group-anagrams/), [Top K Frequent Elements](./0347-top-k-frequent-elements/) | Constant-time lookup, counting, and grouping |
| Two pointers and sorting | [Container With Most Water](./0011-container-with-most-water/), [3Sum](./0015-3sum/), [Squares of a Sorted Array](./0977-squares-of-a-sorted-array/) | Ordered search spaces, duplicate handling, and linear scans |
| Sliding window | [Longest Substring Without Repeating Characters](./0003-longest-substring-without-repeating-characters/), [Longest Repeating Character Replacement](./0424-longest-repeating-character-replacement/), [Max Consecutive Ones III](./1004-max-consecutive-ones-iii/) | Expanding and shrinking a valid range |
| Prefix sums and running state | [Find Pivot Index](./0724-find-pivot-index/), [Find the Highest Altitude](./1732-find-the-highest-altitude/), [Minimum Operations to Make Array Sum Divisible by K](./3512-minimum-operations-to-make-array-sum-divisible-by-k/) | Turning repeated range work into one-pass arithmetic |
| Binary search and search on answer | [Sqrt(x)](./0069-sqrtx/), [Koko Eating Bananas](./0875-koko-eating-bananas/), [Split Array Largest Sum](./0410-split-array-largest-sum/) | Monotonic predicates, bounds, and overflow-safe midpoints |
| Greedy decisions | [Best Time to Buy and Sell Stock](./0121-best-time-to-buy-and-sell-stock/), [Gas Station](./0134-gas-station/), [Array Partition](./0561-array-partition/) | Choosing the locally useful state while preserving a global result |
| Strings and character processing | [Valid Anagram](./0242-valid-anagram/), [Isomorphic Strings](./0205-isomorphic-strings/), [Merge Strings Alternately](./1768-merge-strings-alternately/) | Character counts, mappings, traversal, and normalization |
| Parentheses and stack-style scans | [Valid Parentheses](./0020-valid-parentheses/), [Minimum Add to Make Parentheses Valid](./0921-minimum-add-to-make-parentheses-valid/), [Maximum Nesting Depth](./1614-maximum-nesting-depth-of-the-parentheses/) | Balance tracking, stack invariants, and nested structure |
| Matrix traversal | [Set Matrix Zeroes](./0073-set-matrix-zeroes/), [Transpose Matrix](./0867-transpose-matrix/), [Matrix Diagonal Sum](./1572-matrix-diagonal-sum/) | Coordinate reasoning, boundaries, and space optimization |
| Math and simulation | [Happy Number](./0202-happy-number/), [Add Digits](./0258-add-digits/), [Count the Digits That Divide a Number](./2520-count-the-digits-that-divide-a-number/) | Digit manipulation, cycle detection, and direct simulation |
| SQL filtering and joins | [Customers Who Never Order](./0183-customers-who-never-order/), [Product Sales Analysis I](./1068-product-sales-analysis-i/), [Replace Employee ID](./1378-replace-employee-id-with-the-unique-identifier/) | Relational joins, anti-joins, projections, and precise predicates |

## Suggested revision path

The folders are stored primarily by platform problem number and are not a perfectly linear course. For a more deliberate study order, use this progression:

1. **Foundations:** arrays, strings, arithmetic, and direct simulation.
2. **Core lookups:** hash tables, sets, counting, and mappings.
3. **Linear techniques:** two pointers, prefix sums, and sliding windows.
4. **Search and optimization:** binary search, greedy reasoning, and monotonic predicates.
5. **Structured traversal:** matrices, parentheses, and stack-like state.
6. **Database practice:** SQL filtering, joins, `NULL` behavior, and relationship-based queries.
7. **Repetition:** compare the timestamped attempts in a folder and keep the clearest implementation as the reference solution.

## Repository conventions

```text
<problem-id>-<problem-slug>/
├── README.md                         # Platform prompt and constraints
├── <problem-slug>.java               # Main Java submission, when present
├── <problem-slug>-<date-time>.java   # Dated attempt or alternate solution
├── <problem-slug>.py                 # Python implementation, when present
└── <problem-slug>-<date-time>.sql    # SQL submission, when present
```

- Numeric prefixes normally identify the original platform problem.
- `-GFG` identifies a GeeksforGeeks folder.
- A folder may contain multiple attempts when an idea was revisited or optimized.
- Timestamps in filenames preserve the practice timeline; they are not guaranteed to mean that every problem was solved exactly once on that date.
- A small number of older folders use a legacy name such as `0009. Palindrome Number` or `1464. Maximum Product of Two Elements in an Array`. These are retained so the original work is not lost.

## How to use this repository

1. Open a problem folder and read its local `README.md`.
2. Identify the intended pattern before looking at the implementation.
3. Compare alternate timestamped solutions when they exist.
4. Check the time and space complexity of the chosen approach.
5. Re-solve the problem without copying the code, then use the stored solution for comparison.

This is a living record of consistency over perfection: new daily solutions, alternate languages, and additional patterns will be added as the practice continues.
