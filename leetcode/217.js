let nums = [1, 2, 3, 1]

let containsDuplicate = function(nums) {
    let nemNums = nums.sort((a, b)=>{
        return a-b
    })
    for(let i=1; i<nums.length; i++){
        if(nemNums[i-1] == nemNums[i]){
            return true
        }
    }
    return false    
    
}

console.log(containsDuplicate(nums))