function minimumReplacement(nums) {
    const n = nums.length;
    let minReplace = 0;
    let parts = 0;

    for (let i = n - 2; i >= 0; i--) {
        if (nums[i] <= nums[i + 1]) {
            continue;
        }

        if (nums[i] % nums[i + 1] === 0) {
            parts = Math.floor(nums[i] / nums[i + 1]);
        } else {
            parts = Math.floor(nums[i] / nums[i + 1]) + 1;
        }

        minReplace += parts - 1;

        nums[i] = Math.floor(nums[i] / parts);
    }

    return minReplace;
}
