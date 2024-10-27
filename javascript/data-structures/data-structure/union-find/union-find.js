class UnionFind {
  constructor(size) {
    this.parent = Array.from({ length: size }, (_, i) => i);
    this.rank = Array(size).fill(0);
  }

  //Find with path compression
  find(x) {
    if (this.parent[x] != x) {
      this.parent[x] = this.find(this.parent[x]);
    }

    return this.parent[x];
  }

  union(x, y) {
    let rootX = this.find(x);
    let rootY = this.find(y);

    if (rootX === rootY) return; //Alreay in the same set

    if (this.rank[rootX] < this.rank[rootY]) {
      this.parent[rootX] = rootY; //attach smaller rank tree to larger one.
    } else if (this.rank[rootX] > this.rank[rootY]) {
      this.parent[rootY] = rootX;
    } else {
      this.parent[rootY] = rootX; //Arbitararily choose one
      this.rank[rootX] += 1;
    }
  }
}

const uf = new UnionFind(5);
console.log("Initial State");
console.log("parent Array: ", uf.parent);
console.log("rank Array: ", uf.rank);

// Performing unions:
uf.union(0, 1); // Union elements 0 and 1
uf.union(2, 3); // Union elements 2 and 3
uf.union(1, 3); // Union sets containing 0, 1 with 2, 3

// Visual Representation (After Unions)
console.log("\nAfter Unions:");
console.log("Parent Array:", uf.parent); // [4, 4, 4, 4, 4] (All elements in the same set)
console.log("Rank Array:", uf.rank); // [1, 0, 0, 0, 0]
