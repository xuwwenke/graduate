let arr = [3, 2, 1, 5, 6, 4]

let findKthLargest = function(nums, k){
    let newArr = nums.sort((a, b)=>{
        return b-a
    })
    // console.log(newArr)
    // console.log(newArr[k-1])
    return newArr[k-1]
}

findKthLargest(arr, 2)