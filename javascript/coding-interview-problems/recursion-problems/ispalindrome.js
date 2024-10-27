// function isPalindrome(str, s, e) {
//   if (s === e) return true;

//   //if the first and last character don't match
//   if (str.charAt(s) !== str.charAt(e)) return false;

//   // if there are more than two characters, check if middle substring is also palindrome or not
//   if (s < e + 1) {
//     return isPalindrome(str, s + 1, e - 1);
//   }
//   return true;
// }

// const str = "geeg";
// console.log(isPalindrome(str, 0, str.length - 1));

function isPalindrome(s, i) {
  if (i > s.length / 2) {
    return true;
  }
  return s[i] == s[s.length - i - 1] && isPalindrome(s, i + 1);
}

let str = "geeg";
console.log(isPalindrome(str, 0));
