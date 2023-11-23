let s = 'hello wrold dhdhsh w  '

var lengthOfLastWord = function(s){
    let arr = s.split(' ')
    // console.log(arr)
    let result = 0
    for(let i=0; i<arr.length; i++){
        if(arr[i].length > 0){
            result = arr[i].length
        }
    }
    return result
}

console.log(lengthOfLastWord(s))