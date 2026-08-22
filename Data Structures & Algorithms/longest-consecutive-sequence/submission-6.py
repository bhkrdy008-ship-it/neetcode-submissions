class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0

        nums.sort()

        count = 1
        longest = 1
        l = 0
        r = 1

        for i in range(len(nums)-1):
            if(nums[r] == nums[l] +1):
                l = l + 1
                r = r + 1
                count = count + 1
            elif(nums[r] == nums[l]):
                l = l + 1
                r = r + 1
            else:
                longest = max(longest, count)
                count = 1
                l += 1
                r += 1

        longest = max(longest, count)
        return longest