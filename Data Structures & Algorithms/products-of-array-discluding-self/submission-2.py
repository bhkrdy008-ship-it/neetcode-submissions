class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = [1] * len(nums)
        suffix = [1] * len(nums)
        sol = [1] * len(nums)

        pre = 1
        for i in range(len(nums)):
            prefix[i] = pre
            pre = pre * nums[i]

        post = 1
        for i in range(len(nums)-1,-1,-1):
            suffix[i] = post
            post = post * nums[i]
        
        for i in range(len(nums)):
            sol[i] = prefix[i] * suffix[i]
        
        return sol
        

