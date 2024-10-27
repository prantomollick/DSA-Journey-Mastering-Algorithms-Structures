function reverse(str, len) {
  if (len == str.length) {
    return;
  }
  reverse(str, len + 1);
  console.log(str[len]);
}

const str = "Pranto Mollick";
reverse(str, 0);
