function palindrome(word){
    word = word.toLowerCase();

    let reverseWord = word.split('').reverse().join('') ;

    if (reverseWord === word){
        return word;
    }else{
        return reverseWord;
    }
}

console.log(palindrome("david"));