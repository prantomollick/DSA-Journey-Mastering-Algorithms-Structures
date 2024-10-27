function stringLength(str) {
  if (str === "") {
    return 0;
  }

  return stringLength(str.substring(1)) + 1;
}

const str = "GeeksforGeeks";
console.log(stringLength(str));
