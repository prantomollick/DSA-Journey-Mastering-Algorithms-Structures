class Node {
  constructor(value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

class BST {
  constructor() {
    this.root = null;
  }

  insert(value) {
    const newNode = new Node(value);

    if (this.root === null) {
      this.root = newNode;
      return this;
    }

    let current = this.root;

    while (true) {
      if (value < current.value) {
        if (!current.left) {
          current.left = newNode;
          return this;
        }
        current = current.left;
      } else {
        if (!current.right) {
          current.right = newNode;
          return this;
        }
        current = current.right;
      }
    }
  }

  search(value) {
    let current = this.root;

    while (current) {
      if (value === current.value) return true;

      if (value < current.value) {
        current = current.left;
      } else {
        current = current.right;
      }
    }

    return false;
  }

  remove(value) {
    const removeNode = function (node, value) {
      if (node === null) return null;

      if (value === node.value) {
        //case1: no children
        if (!node.left && !node.right) {
          return null;
        }

        //Case 2: one child
        if (!node.left) return node.right;
        if (!node.right) return node.left;

        //Case 3: two children
        let temp = node.right;
        while (temp.left !== null) {
          temp = temp.left;
        }

        node.value = temp.value;
        node.right = removeNode(node.right, temp.value);
        return node;
      } else if (value < node.value) {
        node.left = removeNode(node.left, value);
        return node;
      } else {
        node.right = removeNode(node.right, value);
        return node;
      }
    };

    this.root = removeNode(this.root, value);
  }
}

let bst = new BST();

bst.insert(8);
bst.insert(3);
bst.insert(10);
bst.insert(1);
bst.insert(6);

const data = bst.remove(8);
console.log(data);
console.log(bst);
