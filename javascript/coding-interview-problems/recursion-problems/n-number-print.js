function sum(n) {
  if (n == 1) {
    console.log(n);
    return;
  }
  sum(n - 1);
  console.log(n);
}

function printNos(n) {
  if (n > 0) {
    printNos(n - 1);
    console.log(n + " ");
  }
  return;
}

printNos(10);
