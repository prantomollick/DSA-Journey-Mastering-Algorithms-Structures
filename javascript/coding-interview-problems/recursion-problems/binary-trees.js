class Node {
  constructor(value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }
}

class BinaryTree {
  constructor() {
    this.root = null;
  }

  insert(value) {
    const newNode = new Node(value);

    if (this.root === null) {
      this.root = newNode;
    } else {
      this.insertNode(this.root, newNode);
    }
  }

  insertNode(node, newNode) {
    if (newNode.value < node.value) {
      if (node.left === null) {
        node.left = newNode;
      } else {
        this.insertNode(node.left, newNode);
      }
    } else {
      if (node.right === null) {
        node.right = newNode;
      } else {
        this.insertNode(node.right, newNode);
      }
    }
  }
}

const tree = new BinaryTree();
tree.insert(4);
tree.insert(1);
tree.insert(2);
tree.insert(3);
tree.insert(5);
tree.insert(6);
tree.insert(7);
tree.insert(8);

function populateNodesToParents(node, nodesToParents, parent = null) {
  if (node) {
    nodesToParents[node.value] = parent;
    populateNodesToParents(node.left, nodesToParents, node);
    populateNodesToParents(node.right, nodesToParents, node);
  }
}

const nodesToParents = {};
populateNodesToParents(tree.root, nodesToParents);
console.log(nodesToParents);
