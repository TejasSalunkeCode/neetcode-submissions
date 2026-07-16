class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> set = new HashSet<>(); // Stores unique triplets only

    for (int i = 0; i < nums.length - 2; i++) {
        for (int j = i + 1; j < nums.length - 1; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                    Collections.sort(triplet); // sort so [-1,0,1] and [0,-1,1] are same
                    set.add(triplet); // Set will keep only unique triplets
                }
            }
        }
    }

    return new ArrayList<>(set); // Convert Set back to List
}
}