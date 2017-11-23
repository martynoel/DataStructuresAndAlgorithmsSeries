# Trees

[Original post](http://asianbarbie.com/trees/)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/trees.jpg)

**Trees — they’re all around us in real life, providing us with fresh oxygen, giving us comfortable places to sit under and read, and acting as cool backgrounds to pose by.**

(Okay, maybe that last one’s a me thing.)

As it turns out, trees are also all around us in the digital world. They’re the underlying data structures behind most file systems, library catalogs, 3D video games, network routers, music compression algorithms, and more. We just can’t see them, so we often don’t know that they’re there.


Like in real life, data structure trees (which I’ll call “trees” from here on out) come in many shapes, sizes, and specifications. Some are balanced, others are not. Some are tall, others are short. Some are efficient and have widespread applications, others are incredibly inefficient and are used for teaching purposes only.

## Recognizing a tree in the wild

Even though there are many different variations of trees, they all have a few things in common. They look something like this:

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9280.jpg)

They’re kind of like real-life trees, only turned upside-down:

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_7668.jpg)

(Does that picture bother you as much as it bothers me?)

## Tree Fundamentals: Nodes and Links/Edges

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9281.jpg)

Let’s look at this in closer detail. Keep that mental model of trees being real-life trees turned upside down in your head, because a lot of the names for the parts of a tree actually line up really well with it.

Each circle in the tree is called a node. Nodes can hold data, which can range from a single character, like I have listed here, to numbers, to words, to complex objects. Each arrow coming out of a node is called a link or an edge (“Link” makes more visual sense to me than “edge” does, but I’ll be using the two terms interchangeably throughout this series to get you familiarized with both of them).

## Family matters: Nodes have parents and children and siblings

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9282.jpg)

Trees are hierarchical data structures — one node at the top (called the root node) spawns the next layer, which in turn spawns the next … kind of like humans do. A tree is like one big happy family of parent, child, and sibling nodes linked together.

Here, Node A has two children, Node B and Node C. Node A is the parent of Node B and Node C. Node B and Node C are the children of Node A. Since they are both children of Node A, Node B and Node C are also siblings.

Node B and Node C may be children, but they are parents as well — Node B is the parent of Node D and Node E, and Node C is the parent of Node F and Node G. Thus, Node B and Node C are known as internal nodes because they are both parents and children — they have links both to and from nodes directly above and directly below them in the tree.

Node D and Node E are siblings because they are both children of Node B, but they are not siblings with Node F and Node G. Sadly, “cousin nodes” are not a thing with trees.

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9283.jpg)

A node’s degree is how many children it has. Here, Nodes A, B, and C all have a degree of 2, respectively, while Nodes D, E, F, and G have a degree of 0 because they are leaf nodes and therefore do not have any children.

## Data structure trees have roots and leaves, too

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9284.jpg)

Like I mentioned above, we also use real-life tree analogies when naming our tree nodes. Every tree has a root node, which is the one node that spawns all the other nodes in the tree. The root node has no parent. In this tree, Node A is the root node.

Every tree also has leaf nodes, which are the nodes at the very bottom of the tree with no children. Nodes D, E, F, and G are all leaf nodes, respectively.

There can be only one root node per tree, but many leaf nodes may exist at the same time.

## Getting Edgy

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9285.jpg)

The fact that each tree only has one root leads to an interesting phenomenon — if a tree with N nodes, it will always have N-1 edges. For example, this tree here has 7 nodes, but 6 edges (count them!). The reason is because every node here has a link to its parent … except for the root node, which has no parent, and therefore has no link to it.

## Level with me

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9305.jpg)

Each layer of a tree is known as a level. This tree here has three levels.

## Trees are Recursive and Nonlinear Data Structures

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9287.jpg)

Trees are *nonlinear* data structures, which means that the data doesn’t have to follow a specific order. This is pretty obvious, if you think about it — a tree doesn’t look like a straight line.

(In some implementations, trees are represented with arrays, which are linear data structures, but let’s not get ahead of ourselves right now.)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9288.jpg)

Trees are also recursive data structures, which means that each tree is made up of smaller trees. Node A is the root of the overall tree, but its children, Node B and Node C, are also technically roots of their own subtrees. Subtrees whose root nodes have the same parent node are called sibling subtrees.

## Follow the Path

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9289.jpg)

Since the nodes in trees are linked together, you can go from one node to another by following a path. The length of a path is the number of nodes in the path. Here, the path that goes from Node A to Node C to Node F has a length of 3.

## Tall, Deep, and Handsome

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9290.jpg)

When it comes to classifying trees, we’re like stereotypical people swiping on Tinder — we care about height, and we care about depth. Specifically, we care about the heights and depths of specific nodes in the tree.

Height and depth are both numbers that can be found by counting the numbers of nodes and/or edges in a path.

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9291.jpg)

The *height* of a node is the longest path from that node to a leaf node, or amount of nodes and links from the node in question to the leaf node that is furthest away. Here, the height of Node B is 2, even though there are two paths from Node B to a leaf node. The key is that we want the *longest* path, because the taller you are, the better. 😉

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9292.jpg)

BTW, because of the way height works, the height of the entire tree is the height of the root node.

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9293.jpg)

The *depth* of a node is the number of links it has in its path from the root. We’re not counting maximums here — when it comes to depth, it is what it is. Like in real life, you can’t fake how deep you are. Here, Node B has a depth of 1, because there’s 1 link in the path from the root (Node A) to it. Similarly, Node H has a depth of 3, because there are 3 links in the path from the root to it.

## Are you Balanced?

Trees can either be balanced or unbalanced. A good way of telling whether a tree is balanced or not is to look at the subtrees coming out of the root node. If any of them have more than one level’s difference with their sibling subtrees, the entire tree is unbalanced.

Here are some examples:

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9294-1200x1456.jpg)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9295.jpg)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9296.jpg)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9297.jpg)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9298.jpg)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9299.jpg)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/IMG_9300.jpg)

“What?” you say. “But some of these trees look like they’d straight-up topple over if they existed in real life! How can they possibly be balanced?”

They’re balanced because the definition said so, duh. Observe how the balanced trees’ subtrees don’t differ from their sibling subtrees by more than one level.

## Types of Trees: Binary or Otherwise

So far, all of the examples in this article have been using binary trees, or trees with nodes that have at most two children (a left child and a right child) . Binary trees are the most basic types of trees (they were the first ones in line when the Unicorn Frappucino came out), but there are many other types of trees that exist. I’ll be covering specific types of trees and their implementations in later articles. Stay tuned!

## Sources

[What are the applications of binary trees?, Stack Overflow](https://stackoverflow.com/a/2200588)
[What are the types of trees in data structures?, Quora](https://www.quora.com/What-are-the-types-of-trees-in-data-structures)
[How To Not Be Stumped By Trees, Basecs](https://medium.com/basecs/how-to-not-be-stumped-by-trees-5f36208f68a7)
[Data Structure and Algorithms – Tree](https://www.tutorialspoint.com/data_structures_algorithms/tree_data_structure.htm)
[Tree Terminology](http://btechsmartclass.com/DS/U3_T1.html)
[Data Structures in Java](http://www1.cs.columbia.edu/~bert/courses/3134/slides/Lecture7.pdf)
[Problem 5: Binary Tree Levels](https://www.eecis.udel.edu/~breech/contest.inet.fall.01/problems/bin-tree-level.html)

## Article debugging

Any misinformation or other bugs in this article are unintentional. If you spot any, please [contact me](http://asianbarbie.com/contact/) and I’ll fix it right away. Thanks for helping me get better!
