package ds.redblacktree;

public class RedBlackTree<Key extends Comparable<Key>, Value> {
	
	private Node<Key, Value> root;
	private static final boolean RED = true;
	private static final boolean BLACK = false;
	public int steps = 0;

	public Value get(Key key) {
		Node<Key, Value> x = root;
		steps = 0;
		
		while (x != null) {
			steps++;
			int cmp = key.compareTo(x.key);
			if (cmp < 0) {
				x = x.left;
			} else if (cmp > 0) {
				x = x.right;
			} else {
				return x.value;
			}
		}	
		return null;
	}

	private Node<Key, Value> rotateLeft(Node<Key, Value> h) {
		Node<Key, Value> x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}
	
	private Node<Key, Value> rotateRight(Node<Key, Value> h) {
		Node<Key, Value> x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = RED;
		return x;
	}

	private void flipColors(Node<Key, Value> h) {
		h.color = RED;					// 1
		h.right.color = BLACK;			// 2
		h.left.color = BLACK;			// 2
	}

	private boolean isRed(Node<Key, Value> x) {
		if (x == null) {
			return false;
		}
		return x.color == RED;
	}

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}
	
	private Node<Key, Value> put(Node<Key, Value> h, Key key, Value value) {
		if (h == null) {
			return new Node<Key, Value>(key, value, RED);
		}
		
		int cmp = key.compareTo(h.key);
		if (cmp < 0) {
			h.left = put(h.left, key, value);
		} else if (cmp > 0) {
			h.right = put(h.right, key, value);
		} else {
			h.value = value;
		}

		if (isRed(h.right) && !isRed(h.left)) {
			h = rotateLeft(h);
		}
		if (isRed(h.left) && isRed(h.left.left)) {
			h = rotateRight(h);
		}
		if (isRed(h.left) && isRed(h.right)) {
			flipColors(h);
		}
		return h;
	}

}