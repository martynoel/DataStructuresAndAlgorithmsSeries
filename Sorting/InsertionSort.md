# Insertion Sort

-[Original post](http://asianbarbie.com/insertion-sort/)

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/insertion-sort.jpg)

**When was the last time that you sorted something?**

Maybe you accidentally dropped your freshly printed Parisian Art History final paper all over the floor and had to put it back in order according to the page numbers on the upper right-hand corners. Maybe you were making door signs for all the members of your sorority, and decided to put them in alphabetical order. The last time I sorted something by hand, I was organizing all of the dresses in my closet by color.

Take a step back and recall your last sorting memory. How would you explain your process to an intelligent alien? (“Umm, I just started picking things up and putting them in order” won’t cut it, sorry not sorry).

When you really take the time to think about it, sorting becomes pretty complex and hard to put into words. And there are so many ways to do it.

Welcome to the world of sorting algorithms.

On a high level, they literally are that simple — you’re trying to figure out how to put a bunch of things into order, according to a certain established order (if those things have a natural order, you could sort them from smallest to largest or from A to Z; if they don’t, you could make up a rule, like “purple dresses go before red dresses, which go before white ones”). It’s only when we think about how to go about sorting that things start to get a little more complicated.

Let’s take a look at one of the more basic sorts, Insertion Sort, to get a concrete idea of what I’m talking about.

## Insertion Sort

Insertion sort divides the array up into two portions, the sorted portion and the unsorted portion. It sorts the elements by going through the array and inserting each element in the unsorted portion into its correct place in the sorted portion, and when it’s done, the entire array is sorted.

I know, I know — that explanation sounds incredibly convoluted. It’s easier to see with an example:

Let’s say we have an array of integers with the values **15, 8, 5, 14, 25, 1, and 3,** and that we want to sort them in order from largest to smallest.

[ | 15,  8,  5,  14,  25,  1,  3 ]

The | represents the divider between the sorted and the unsorted portions of the array — everything to the left of the divider is sorted, and everything to its right is unsorted. We haven’t started sorting yet, so the divider is at the very left.

[ `15` | 8, 5, 14, 25, 1, 3 ]

We don’t have anything to compare the first item in the array to, so we can move it over to the sorted portion and leave it there without doing any comparisons. Now, the sorted portion contains a single element: 15.

[ 15, `8` | 5, 14, 25, 1, 3 ]

Once other elements join the party in the sorted portion, things start to get interesting. The actual “sorting” actually happens *after* an element is moved over to the sorted portion, and it’s done through a series of comparisons. Here, 15 is clearly bigger than 8. Since everything in the sorted portion must be in order from smallest to largest, we have a violation! Yikes!

So what do we do?

We have 8 and 15 trade places, of course. Now the sorted portion is back to being, well, sorted, and all is well and good:

[ `8`, 15 | 5, 14, 25, 1, 3 ]

… Until 5 ruins it again.

[ 8, 15, `5` | 14, 25, 1, 3 ]

Hmm, this is interesting. When there were only two out-of-order elements in the sorted portion, we just had them switch places. But what happens when there are three?

It turns out that it’s no different: switching places is the name of the game. You just do it as many times as needed with neighboring elements until everything is sorted again.

First, we compare 5 and 15. Are they out of order? Yes, so we have them switch places.

[ 8, `5`, 15 | 14, 25, 1, 3 ]

Next, we compare 8 and 5. Are they out of order? Yes indeedy, so they also switch.

[ `5`, 8, 15 | 14, 25, 1, 3 ]

We keep going. 14 now moves into the sorted portion.

[ 5, 8, 15, `14` | 25, 1, 3 ]

Clearly, 14 and 15 are out of order, so they need to switch places. But after that, it seems that everything is in order. What do we do then?

[ 5, 8, `14`, 15 | 25, 1, 3 ]

The answer is: nothing! Since the order has been restored, the next step is to add 25 to the sorted portion.

[ 5, 8, 14, 15, `25` | 1, 3 ]

It seems that 25 didn’t have any issues of assimilation, so we keep marching on and add 1 to the sorted portion.

[ 5, 8, 14, 15, 25, `1` | 3 ]

1 is smaller than every single other element in the sorted portion! What a disturber. Thus, it’ll have to do the good ol’ switcheroo with each and every one of these numbers until it reaches its place at the beginning of the array.

[ 5, 8, 14, 15, `1`, 25 | 3 ]

[ 5, 8, 14, `1`, 15, 25 | 3 ]

[ 5, 8, `1`, 14, 15, 25 | 3 ]

[ 5, `1`, 8, 14, 15, 25 | 3 ]

[ `1`, 5, 8, 14, 15, 25 | 3 ]

Whew! That was a lot of comparisons and a lot of moving (5, to be exact) that 1 had to do (and, as you’ll see later, that’s why Insertion Sort doesn’t have the best Big-O time complexity). Unfortunately, 3 is also a troublemaker, and we have to do quite a bit of work to get it into its rightful place, too.

[ 1, 5, 8, 14, 15, 25, `3` | ]

[ 1, 5, 8, 14, 15, `3`, 25 | ]

[ 1, 5, 8, 14, `3`, 15, 25 | ]

[ 1, 5, 8, `3`, 14, 15, 25 | ]

[ 1, 5, `3`, 8, 14, 15, 25 | ]

[ 1, `3`, 5, 8, 14, 15, 25 | ]

Finally, after we did 6 comparisons with 3, we have a sorted array!

Here are the exact steps that Insertion Sort uses:

***1. Move the next element in the array from the unsorted portion to the sorted portion
2. If that element is out of order in the sorted portion, have it switch places with each other element in the sorted portion until everything is in order
3. Repeat until there are no elements in the unsorted portion, and every element in the sorted portion is in order.***

And there you have it — the famous Insertion Sort!

## What time is it? … Coding Time

Now that you have a good conceptual idea of Insertion Sort, it’s time to bring that idea into the Real World (ish) by implementing it in code.

For me, the hardest part of learning a new algorithm isn’t the conceptual understanding, but rather how the concepts are translated into code. It’s definitely a challenge to translate an idea into a specific language, but fear not! It’s actually pretty simple once you break it down.

Here’s the complete implementation of Insertion Sort in Java:

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/insetion_sort_java.jpg)

What the hell are `i`, `j`, and `temp`? Why are there nested for loops? (Those were my questions when I first learned Insertion Sort).

## Breaking it down

I know it sounds arbitrary, but `i` and `j` are conventions for counters in loops. It’s a math thing, apparently, but I personally justify it by saying that `i` stands for “index”.

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/for_loop_i.png)

The outer for loop represents iterating through the entire array, and moving each element from the unsorted portion to the sorted portion. It’s incrementing because we’re going through the array from left to right.

The inner for loop is where things get interesting. This is where the swappage happens.

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/for_loop_j_1.png)

This loop represents the sorted portion only: we start by setting our counter, `j`, equivalent to `i`, the current element that we’re on, and then decrementing (going backwards) until we hit the front of the array.

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/for_loop_j_2.png)

This if statement is where the swappage action is. Here, `array[j]` represents the element that was just moved to the sorted portion. We compare it to `array[j-1]`, the element next to it, and swap if they’re out of order.

See, that wasn’t so bad, was it?

## Output

I ran this code with the same array I used in my explanation above, and got this:

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/insertion_sort_output.png)

I didn’t show the actual sorting part, but you can see that there are 7 numbers in the array, and after 7 iterations, the array is completely sorted. It’s a little hard without the divider, but you can also see the progression of the sorted and unsorted portions (in Iteration 1, 15 constitutes the sorted portion, in Iteration 2, it’s 8 and 15, and so on).

## Performance

Insertion Sort has two for loops, one nested in the other. The first for loop will iterate through the entire array, which means that it will run N times (N being the size of the input — in this case, the number of elements in the array). The second for loop will also iterate through the entire array, which is another N times. They’re both iterating through the same array, and so Insertion Sort’s Big-O time complexity is O(N^2). Its running time is quadratic — as the input size doubles, the time it takes to run quadruples.

Insertion Sort isn’t the most efficient sorting algorithm, but it’s used in some cases where the input array is small. 

## Do try it at home, kids

Here's the code (it can also be found [here](https://github.com/mimichenyao/DataStructuresAndAlgorithmsSeries/blob/master/Sorting/InsertionSort.java). Run it yourself with your own inputs. Play around with it, break it, change variable names, have fun with it!

```java

public class InsertionSort {

	public static int[] insertionSort(int[] array) {

		int interationNumber = 0;

		for (int i = 0; i < array.length; i++) {

			interationNumber++;

			for (int j = i; j > 0; j--) {

				if ( array[j] < array[j-1]) {

					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}

			System.out.println(" ");
			System.out.print("Iteration " + interationNumber + ": ");

			for (int b = 0; b < array.length; b++) {
				System.out.print(array[b] + " ");
			}
		}

		return array;

	}

	public static void main(String[] args) {

		int[] testArray = {15, 8, 5, 14, 25, 1, 3};
		insertionSort(testArray);
	}
}

```
## Sorting anything, anything at all

My example uses only arrays of integers, but as I mentioned earlier, Insertion Sort can sort any type of data that has a specified order. You can easily modify the Java code to do this by having whatever you’re sorting implement the [Comparable interface](https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html), then modifying the Insertion Sort code to take those objects instead.

For example, if I were to sort dresses:

![pic](http://asianbarbie.com/wp-content/uploads/2017/10/comparable_example.png)

Here, I specified that each Dress object had a string property called “color”, and that purple dresses were ranked higher than red dresses.

The logic behind the Comparable interface is a bunch of if statements comparing the object in question (`this`) to the object that is passed into `compareTo()`. If the two objects are equal, return 0. If `this` is larger than the other object, return a positive integer. If `this` is smaller than the other object, return a negative integer.

And that’s Insertion Sort!

## Sources

[Inching Towards Insertion Sort, Basecs](https://medium.com/basecs/inching-towards-insertion-sort-9799274430da)

[Insertion Sort, Swift Algorithm Club](https://github.com/raywenderlich/swift-algorithm-club/tree/master/Insertion%20Sort)

[Insertion sort with an array of objects?, Stack Overflow](https://stackoverflow.com/questions/22003431/insertion-sort-with-an-array-of-objects/22003486#22003486)

## Article debugging

Any misinformation or other bugs in this article are unintentional. If you spot any, please [contact me](asianbarbie.com/contact) and I’ll fix it right away. Thanks for helping me get better!
