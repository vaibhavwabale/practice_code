## 1. Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.


### Test Cases:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]

### Code

```c++
class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        int N = nums.size(), sum = N * (N + 1) / 2;
        vector<int> ans(2);
        vector<bool> seen(N+1);
        for (int num : nums) {
            sum -= num;
            if (seen[num]) ans[0] = num;
            seen[num] = true;
        }
        ans[1] = sum + ans[0];
        return ans;
    }
};
```


## 2. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

### Test Cases:

1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

3:
Input: nums = [3,3], target = 6
Output: [0,1]
 
### Code

```c++
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int a=0;
        int b=0;
        for(int i=0;i<nums.size()-1;i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    a=i;
                    b=j;
                }
            }
        }
        return {a,b};
    }
};
```

## 3. Palindrome Number

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.

### Test Cases:

1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 
### Code

```c++
class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }
        int revertedNo = 0;
        while(x > revertedNo)
        {
            revertedNo = revertedNo * 10 + x % 10;
            x = x / 10;
        }
        return x == revertedNo || x == revertedNo / 10;
    }
};
```
