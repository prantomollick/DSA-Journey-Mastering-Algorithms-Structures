function reverseFibo(n, a, b) {
  if (n > 0) {
    //function  call
    reverseFibo(n - 1, b, a + b);

    console.log(a + " ");
  }
}

const n = 10;
reverseFibo(n, 0, 1);
