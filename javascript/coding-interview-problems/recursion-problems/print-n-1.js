function printNtoOne(n) {
  if (n > 0) {
    console.log(n);
    return printNtoOne(n - 1);
  }
}

printNtoOne(10);
