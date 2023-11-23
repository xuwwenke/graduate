let nums = [3, 2, 4]

let twoSum = function(nums, target) {
    for(let left=0; left<nums.length; left++){
        for(let right=left+1; right<nums.length; right++){
            if(nums[left] + nums[right] == target){

                return [left, right]
            }
        }
        
    }
}


console.log(twoSum(nums, 6))