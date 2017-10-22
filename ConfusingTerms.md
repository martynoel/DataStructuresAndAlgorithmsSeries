# Confusing Terms in Algorithms

Ever wondered WTF an "inner loop", "invariant", "cost model", and other things mean? (Hint: an inner loop is not a loop nested in another loop). You're in luck! Here are the terms I've found to be confusing:

## Inner loop
The "inner loop" of an algorithm consists of the instructions that are executed the most frequently, and thus the ones that actually play a role in the final total. Runtimes of many algorithms only depend on a small set of their instructions, after all.

## Cost model
A cost model is a model that defines the basic operations used by an algorithm (such as the number of **array accesses**, or number of times an array is accessed for read or for write, it has). Cost models allow us to make precies statements about algorithms themselves, without getting caught up in particular implementations.

## (Loop) invariant
A loop invariant is a condition that holds true for every iteration of the loop. For example: 

```
int j = 9;
for (int i = 0; i < 10; i++) 
  j--;
```
Here, **i + j = 0** is an invariant, because it's true for every iteration of the loop. 
([Source](https://stackoverflow.com/a/3221583))
