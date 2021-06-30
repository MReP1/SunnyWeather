package com.sunnyweather.android.kotlin


fun twoSum(nums:IntArray,target:Int):IntArray{
    var index:MutableList<Int> = mutableListOf()
    var dec:Int = target
    var flag = 0
    for(i in nums.indices){
        if(target>=0){
            if(nums[i]<=target){
                dec = target - nums[i]
                var j = i+1
                val range = i+1 until nums.size
                for(j in range){
                    if(nums[j] == dec){
                        flag=1
                        val result:IntArray = intArrayOf(i,j)
                        return result
                    }
                }
            }
        }else{
            if(nums[i]>target){
                dec = target - nums[i]
                var j = i+1
                val range = i+1 until nums.size
                for(j in range){
                    if(nums[j] == dec){
                        flag=1
                        val result:IntArray = intArrayOf(i,j)
                        return result
                    }
                }
            }
        }

        dec = target
        if(flag==1){
            break
        }
    }
    return nums
}
fun main(){
    val nums = intArrayOf(-1,-2,-3,-4,-5)
    val target = -8
    for (item in twoSum(nums,target)){
        println(item.toString())
    }
}
