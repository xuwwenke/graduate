let arr = [10, 2, 33, 1]

var largestNumber = function(nums){
    let res = nums.sort((a,b)=>{
        let x = +(a.toString()+b.toString())
        let y = +(b.toString()+a.toString())
        return x>y?-1:1
    })
    res = res.join('')
    return res
}

console.log(largestNumber(arr))