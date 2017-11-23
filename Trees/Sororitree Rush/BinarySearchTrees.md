# Sororitree Rush: Binary Search Trees

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/bst_cover.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/1_2.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/2-3.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/3-2.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/4-2.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/5-2.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/6-3.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/7-2.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/8-3.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/9-3.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/10-1.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/11.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/12.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/13.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/14.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/15-1.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/16.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/17.jpg)
![pic](http://asianbarbie.com/wp-content/uploads/2017/11/18.jpg)

[Original Post](http://asianbarbie.com/binary-search-trees/)

**Binary search trees (BSTs) are simply binary trees with one additional caveat: all the nodes with values smaller than the root go on the left, and all the nodes with values bigger than the root go on the right.**

Insertion is easy: start at the root, and keep doing node value comparisons until you reach a leaf node. Above, we see that a new member who has been assigned the value 11. To insert herself as a node in the sororitree, she starts at the root node, makes a comparison (is 11 bigger than 7?), goes right to Node 9 as a result of that comparison, makes another comparison (is 11 bigger than 9?), and goes right again. Since Node 9 has no right little, Node 11 becomes the right little of Node 9.

The sorority metaphor can get a little confusing sometimes (especially if you’re not in a Greek organization — my school doesn’t have Greek life, so I’ve been doing a lot of research). Let’s go through a simple example to further clarify how to insert into a BST.

## Inserting into a BST

You always start with a list of data you would like to enter (this data is often integers or characters in examples, but it can be anything that’s comparable), and a root node. Here, we’ll use the list of numbers **19, 2, 34, 5, 11, 90,** and **8**.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/IMG_1784.jpg)

Each item is inserted in the order that it’s listed. 19 becomes our root node.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/19.jpg)

2 is next. We start at the node again and make our first comparison:

**Is 2 bigger than 19?**  No, so we go left.

Since 19 has no left child (or left little, in sororitree terms), 2 becomes its new left child.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/20.jpg)

Then comes 34. We start at the node and compare:

**Is 34 bigger than 19?** Yes, so we go right.

Since 19 has no right child, 34 becomes its new right child.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/21.jpg)

5 is up! Once again starting at the node:

**Is 5 bigger than 19?** No, so we go left.

**Is 5 bigger than 2?** Yes, so we go right.

2 has no right child, so 5 becomes its new right child.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/22.jpg)

It’s 11’s turn.

**Is 11 bigger than 19?** No, so we go left.

**Is 11 bigger than 2?** Yes, so we go right.

**Is 11 bigger than 5?** Yes, so we go right.

5 has no right child, so 11 becomes its new right child.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/23.jpg)

Almost there! Next up is 90.

**Is 90 bigger than 19?** Yes, so we go right.

**Is 90 bigger than 34?** Yes, so we go right.

34 has no right child, so 90 becomes its new right child.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/24.jpg)

Finally! 8 is our last value to insert into the binary search tree.

**Is 8 bigger than 19?** No, so we go left.

**Is 8 bigger than 2?** Yes, so we go right.

**Is 8 bigger than 5?** Yes, so we go right.

**Is 8 bigger than 11?** No, so we go left.

11 has no left child, so 8 becomes its new left child.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/25.jpg)

And that’s it! You have your binary search tree fully constructed (at least until the next insert comes along).

Your final tree should look like this:

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/26.jpg)

As you can see, this particular BST is kind of ugly. Unlike the pretty versions used in the comic, this one is very unbalanced. It turns out that unbalanced BSTs are ugly both functionally and aesthetically — it takes much longer to search for elements in unbalanced binary search trees! A balanced binary tree, or a binary tree with no more than one layer of nodes’ difference in each of its subtrees, has a time complexity of O(log n), whereas an unbalanced one has a time complexity of O(n).

But why?

## Efficiency of a BST Search

Like Root Node 7 mentioned above, it’s extremely efficient to search for a value in a BST. Searching works much like inserting: we start by comparing the value we are searching for (the “target”) to the value of the root node. If the target is less than the root node, we know that it’ll be in the left subtree, and if the target is greater than the root node, we know that it’ll be in the right subtree.

This means that once we know which side the target is on, we can narrow down ours search to just the subtree on that side. Essentially, we keep doing this (either going left or right and making comparisons at each one of those nodes) until we find the target value/determine that the target value isn’t in the tree.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/IMG_1782.jpg)

Beautiful. Thank you, strict BST standards!

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/28-1.jpg)

The more balanced the tree is, the more we can cut off with each searching iteration — we’ll usually end up cutting off half the tree! As seen in the example above, this would give us an O(log n) time complexity in the worse case.

However, with unbalanced trees, there’s often a lopsided subtree or two (those damn degenerate binary trees!). We can’t cut off half of the tree if there is no other half. Thus, with unbalanced trees, our worst-case runtime is O(n), because in the worst case, we’ll have a degenerate binary tree, end up not being able to cut any side off at all, and have to search through our elements one by one, as we would an array or linked list.

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/29-1.jpg)

The above is a bit of an extreme example — but unbalanced binary trees really are inefficient IRL.

## Other Types of Binary Search Trees

If the fact that binary search trees aren’t always balanced rustles your jimmies, fear not — binary search trees have been hella optimized (some even for specific problems!). In further articles in this series, we’ll go through some of the fancier BSTs that can self-balance, thanks to even stricter rules.

## Do Try This at Home

Now you know how to conceptually insert and search a BST! How would these numbers look like in a binary search tree structure?

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/30.jpg)

How about these letters?

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/31.jpg)

Here’s what I got:

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/32.jpg)

![pic](http://asianbarbie.com/wp-content/uploads/2017/11/33.jpg)

Congratulations! You’ve successfully been to BST’s open house. I hope you’ve learned something useful, because you’ll need this BST knowledge for the other houses we’ll visit.

## Why is that frat bro in a dress?

All of the characters in my series live in a world where code controls their reality and gender roles don’t exist. Dresses are the main article of clothing because they’re easy to put on and run around in, duh. Why *wouldn’t* the frat bro wear a dress?

## Sources

- [Leaf It Up To Binary Trees, Basecs](https://medium.com/basecs/leaf-it-up-to-binary-trees-11001aaf746d)
- [Difference between binary tree and binary search tree](https://stackoverflow.com/a/11347688)
- [Binary Search Tree | Set 1 (Search and Insertion)](http://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/)
- [Binary Search, Chegg](https://www.chegg.com/homework-help/definitions/binary-search-3)
- [Binary Trees](https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/trees.html)
- [What is the time complexity of searching in a binary search tree if the tree is balanced?, Stack Overflow](https://stackoverflow.com/questions/41054981/what-is-the-time-complexity-of-searching-in-a-binary-search-tree-if-the-tree-is)

## Article debugging

Any misinformation or other bugs in this article are unintentional. If you spot any, please [contact me](http://asianbarbie.com/contact/) and I’ll fix it right away. Thanks for helping me get better!
