# Brainsweets
i want to program but i don't know what for, so solving little problems seems good too

## The Havel-Hakimi algorithm
```
You got a murder, N witnesses and a compiler.
You ask each witness how many people they have met, and you mark the results down in such manner.
  [5, 3, 0, 2, 6, 2, 0, 7, 2, 5]
How do you know if they are telling the truth?  Havel-Hakimi algorithm works wonders.
Here's the first pass through the algorithm using the original example:
[5, 3, 0, 2, 6, 2, 0, 7, 2, 5] - Starting sequence
[5, 3, 2, 6, 2, 7, 2, 5] - After step 1, removing 0's.
Step 2: This sequence is not empty, so go on to step 3.
[7, 6, 5, 5, 3, 2, 2, 2] - After step 3, sorting in descending order.
[6, 5, 5, 3, 2, 2, 2] - After step 4, removing the first answer N = 7.
Step 5: N (7) is less than or equal to the number of answers remaining in the sequence (7), so go on to step 6.
[5, 4, 4, 2, 1, 1, 1] - After step 6, subtracting 1 from each of the first 7 answers (which is all of them in this case).
At this point you would start over at step 1
```
