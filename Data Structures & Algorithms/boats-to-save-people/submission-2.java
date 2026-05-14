class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0;
        int r= people.length -1;
        int boats = 0;

        Arrays.sort(people);

    while(l<=r){
        if(people[r] == limit){
            r--;
            boats++;
        }
        else if(l == r && people[l] <= limit ){
            boats++;
            break;
        }
        else if(people[r]+people[l] <= limit){
            boats++;
            r--;
            l++;
        }
        else if(people[r]+people[l] > limit){
                boats++;
                r--;
            
        }
    }

    return boats;
    }
}