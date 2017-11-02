public class BinarySearchTree {

	public static Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	public int getCount(Node node) {

		int count = 1;

		if (node.left != null) {
			count += getCount(node.left);
		}

		if (node.right != null) {
			count += getCount(node.right);
		}

		return count;
	}

	public void rotateRight(Node node) {
		Node temp = node.left;
		node.left = temp.right;
		temp.right = node;
	}

	public void rotateLeft(Node node) {
		Node temp = node.right;
		node.right = temp.left;
		temp.left = node;
	}

	public boolean find(int id) {

		Node current = root;

		while (current != null) {

			if (current.data == id) {
				return true;
			} else if (current.data > id) {
				current = current.left;
			} else {
				current = current.right;
			}
		}

		return false;
	}

	public boolean delete(int id) {

		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;

		// While loop is to find the node
		while (current.data != id) {
			parent = current;

			// Determines whether to search left or right subtree
			if (current.data > id) {
				isLeftChild = true;
				current = current.left;
			} else {
				isLeftChild = false;
				current = current.right;
			}

			// If node does not exist
			if (current == null) {
				return false;
			}
		}

		// Outside of while loop: The node has been found

		// If node to be deleted has no children
		if (current.left == null && current.right == null) {

			// If node to be deleted is root, delete the root
			if (current == root) {
				root = null;
			}

			// If node to be deleted is left or right child, delete it
			if (isLeftChild == true) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}

		// If node to be deleted has only one child ...
		// Basically delete the node and replace it with its child

		// If node to be deleted has 1 left child
		else if (current.right == null) {

			if (current == root) {
				root = current.left;
			} else if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.left;
			}
		}

		// If node to be deleted has 1 right child
		else if (current.left == null) {

			if (current == root) {
				root = current.right;
			} else if (isLeftChild) {
				parent.left = current.right;
			} else {
				parent.right = current.right;
			}
		} 

		// If node to be deleted has both left and right child
		else if (current.left != null && current.right != null) {

			// Cannot arbitrarily replace it with one of its children
			// Use successor instead
			Node successor = getSuccessor(current);

			// Replaces one of the nodes with the successor value 
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.left = successor;
			} else {
				parent.right = successor;
			}

			successor.left = current.left;
		}

		return true;
	}

	// Finds the successor
	// Successor = the smallest node in right subtree of node to be deleted
	public Node getSuccessor(Node deleteNode) {

		Node successor = null;
		Node successorParent = null;
		Node current = deleteNode.right;

		while (current != null) {
			successorParent = successor;
			successor = current;
			current = current.left; 
		}

		// Check if successor has a right child
		// Since successor = smallest node, it cannot have a left child
		// If it does have right child, add right child to left of successorParent
		if (successor != deleteNode.right) {
			successorParent.left = successor.right;
			successor.right = deleteNode.right;
		}

		return successor;
	}

	public void insert(int id) {

		Node newNode = new Node(id);

		// If tree is empty, set new node to be the root
		if (root == null) {
			root = newNode;
			return;
		}

		Node current = root;
		Node parent = null;

		while (true) {
			parent = current;

			// If int you're looking for is less, search left subtree
			if (id < current.data) {
				current = current.left;

				// Eventually you'll hit this
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public void display(Node root) {

		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}

	public static void main(String[] args){

		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(16);
		bst.insert(13);
		bst.insert(19);
		bst.insert(12);
		bst.insert(15);
		bst.insert(18);
		bst.insert(22);

		bst.display(root);

	}
}

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
