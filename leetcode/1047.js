let str = 'abbaca'

let removeDuplicates = function(s){
    let tmpstack = []
    for(let i=0; i<s.length; i++){
        if(s[i] == tmpstack[tmpstack.length-1]){
            tmpstack.pop()
        }else{
            tmpstack.push(s[i])
        }
    }
    // console.log(tmpstack)
    return tmpstack.join('')
    
}

console.log(removeDuplicates(str))