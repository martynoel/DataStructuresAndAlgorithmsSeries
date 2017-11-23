# Big-O Time Complexity

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/big_o.jpg)

[Original Post](http://asianbarbie.com/big-o-time-complexity/)

**I know what you’re thinking –“Big-O Time Complexity” sounds like the punchline of some nerdy that’s-what-she-said joke.**

(I’m That Kid who snickered loudly at the term “Big-O notation” when it was first introduced sophomore year, so I won’t judge if you do the same.)

Big-O is actually one way to measure the amount of resources needed for an algorithm to run (also known as an algorithm’s complexity). “Resources” usually refers to time or space in memory. For simplicity’s sake, I’m going to be writing about time complexity only, so for the duration of this post, you can think of Big-O as a way to measure the amount of time an algorithm needs to run, depending on the size of its input.

If this all sounds hella confusing but also slightly interesting, good! Keep reading. Information sticks way better when you’re curious.  

## A little context would be nice…

Before I delve into how to find the Big-O of an algorithm, let’s back up a little and get some context. An algorithm is just a clear set of step-by-step instructions. An algorithm for getting ready in the morning may look like this:

1. Get out of bed
2. Brush teeth
3. Take shower
4. Put on clothes for the day
5. Put on makeup
6. Eat breakfast
7. Here’s my personal algorithm for picking out outfits.

In CS, we’re more interested in algorithms that perform computations, such as sorting a list of numbers in order from lowest to highest. (Sorts are their own class of algorithms, and I’ll be covering a few different sorting algorithms in later posts).

There are lots of practical uses for various algorithms, so it’s in our best interest to determine how fast algorithms can run. The faster (and thus more efficient) an algorithm is, the better.

An algorithm’s time complexity is how long an algorithm takes to run, depending on the size of its input. For example, that algorithm that sorts the list of numbers from highest to lowest will behave differently based on the list (input) it’s given. If the list is already sorted, the algorithm may take more or less time to run than if the list contained numbers in random order.

Each algorithm has a best, average, and worst case. Like the cautious pessimists we are, computer scientists often refer to algorithms by their worst cases. Hey, if you’re prepared for the worst, everything else is good news, right? That’s where Big-O comes in — it’s used to denote the worst-case runtime of an algorithm.

## The different flavors of Big-O’s

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/big_o_complexity_graph.jpg)

It’s common sense to assume that, the bigger an input you give an algorithm, the longer the algorithm will take to run. Big-O is used to denote worst-case runtimes, but some algorithms’ worst-case runtimes are much faster than others’.

There are seven common complexities for an algorithm to have. In the order of best to worst, they are:

1. O(1) — Constant runtime — amazing
2. O(log n) — Logarithmic runtime — good
3. O(n) — Linear runtime — alright
4. O(n log n) — Linearithmic runtime — bad
5. O(n^2) — Quadratic runtime — TERRIBLE
6. O(2^n) — Exponential runtime — TERRIBLE
7. O(n!) — Factorial runtime — TERRIBLE

As you can see from the graph above, O(1) is the best — no matter what size input you give it, it’ll still take the same time to run. On the other hand, O(n!) is fugly. And awful. A larger input will slow an O(n!) algorithm down significantly.

## How to find the Big-O time complexity of an algorithm

Now that we’ve talked the talk, it’s time to walk the walk. How do we find the Big-O time complexity of an algorithm, anyway?

Sadly — and this tripped me up a lot when I was first learning about complexity analysis — there is no One True Way to find an algorithm’s Big-O. You can’t plug-and-chug complexity analysis because *hello*, it’s an analysis.*

Most people find the Big-O by looking at the algorithm itself and using common sense. I’m not going to explain how to find Big-O by looking at code, because there’s already a ton of good resources out there (I like [this one](https://www.interviewcake.com/article/java/big-o-notation-time-and-space-complexity) and [this one](https://stackoverflow.com/a/4852666) the most) that you could use. Instead, I’ll illustrate the approach you should take to find the Big-O time complexity of any algorithm.

Consider this example. Let’s say that you’re in a crowded room. You have an extra ticket for a concert, and you’d like to sell it to someone in the room with you. Assuming that you’ll sell the ticket to the first person who wishes to buy it, you quickly come up with two algorithms to determine how to sell the ticket:

**Algorithm 1:**

1. Announce to the room that you have a ticket for sale, and ask whether anyone would like to buy it
2. If someone wants to buy the ticket, they say “yes.”

You’re asking one question to the entire room, so this algorithm’s complexity is O(1). It doesn’t take you any longer to get a response if more people come into the room.

**Algorithm 2:**

1. You go around the room, telling the first person that you have a ticket for sale, and ask whether they would like to buy it.
2. If they say no, you tell the second person that you have a ticket for sale, and ask if they would like to buy it, and so on until you either find a buyer or run out of people to ask (sad!).

Yeah, the first person you ask could want to buy the ticket, but Big-O is all about worst cases, remember? You’ve gotta assume that you’re freakishly unpopular. In the worst case, everyone you ask says “no”, and you have to ask every single person, so this algorithm’s complexity is O(n). It increases by the same amount (the time it takes to ask a question and get a response) each time someone comes into the room.

## And there you have it!

Congratulations! You now know what an algorithm is, what Big-O is used for and why, common Big-O time complexities of algorithms and how good/okay/bad/awful they are, and how to find the Big-O time complexity of an algorithm.

I had a lot of fun (and learned a lot) while writing this, and I hope you enjoyed following along! If you know someone who could benefit from this post, please pass it on.

I hope you have better luck selling concert tickets in real life.

## Sources

Like any good software engineer would do, I put together this project by Googling the shit out of everything. Many of these articles venture outside the scope of this post — they would make for great further reading if you’re interested in learning more about Big-O and complexity theory.

- [Big O Notation (Interview Cake)](https://www.interviewcake.com/article/java/big-o-notation-time-and-space-complexity)

- [Big O, how do you calculate/approximate it? (Stack Overflow)](https://stackoverflow.com/questions/3255/big-o-how-do-you-calculate-approximate-it)

- [Analysis of algorithms (Wikipedia)](https://en.wikipedia.org/wiki/Analysis_of_algorithms)

- [Best, worst and average case (Wikipedia)](https://en.wikipedia.org/wiki/Best,_worst_and_average_case)

- [Big-O notation (Khan Academy)](https://www.khanacademy.org/computing/computer-science/algorithms/asymptotic-notation/a/big-o-notation)

- [Complexity and Big-O Notation (University of Wisconsin-Madison)](http://pages.cs.wisc.edu/~vernon/cs367/notes/3.COMPLEXITY.html)

- [Big-O Cheat Sheet](http://bigocheatsheet.com/)

## Article debugging

Any misinformation or other bugs in this article are unintentional. If you spot any, please contact me and I’ll fix it right away. Thanks for helping me get better!

* I lied, there are some procedures you can use, but they’re pretty complex and math-heavy, and I haven’t learned them yet myself. Maybe I’ll cover them in a future blog post 😉*
