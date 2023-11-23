let arr = [3, 2, 2, 3, 1]


let removeElement = function(nums, val) {
    let left = 0
    for(let right=0; right<nums.length; right++){
        if(nums[right] != val){
            nums[left] = nums[right]
            left += 1
        }
    }
    return left
}


console.log(removeElement(arr, 3))
