function binarySearch(key, ...args){
    let arr = [...args];
    let left = 0;
    let right = arr.length - 1;
    
    while(left <= right ){
        let mid;
        mid = Math.floor((left + right)/2);
        if(arr[mid] === key ){
            return mid;
        }else if(arr[mid] < key){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
}

console.log(binarySearch(9,4,5,6,7,9))