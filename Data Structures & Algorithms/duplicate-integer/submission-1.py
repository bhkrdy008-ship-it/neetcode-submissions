class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        list1 = []
        for num in nums:
            if num in list1:
                return True
            else:
                list1.append(num)
        return False