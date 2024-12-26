# Unexpected Collection Modification with removeIf in Kotlin

This repository demonstrates a common, yet subtle, issue in Kotlin when using the `removeIf` function with mutable collections (Lists, Maps, and Sets).

The `removeIf` function modifies the original collection directly, which might be unexpected for those familiar with immutable data structures or languages where collection modifications create new copies.

The example demonstrates this behavior with `List`, `Map`, and `Set`, highlighting the importance of understanding how `removeIf` alters the original collection.

## How to reproduce

1. Clone the repository.
2. Run the `Bug.kt` file.
3. Observe the output.  Notice how each collection is directly modified by `removeIf`, resulting in elements that meet the predicate being removed from the original collection, not a copy.

## Solution

Refer to `BugSolution.kt` for an alternative approach, showcasing different ways to achieve the same result without unexpectedly modifying the original collection.