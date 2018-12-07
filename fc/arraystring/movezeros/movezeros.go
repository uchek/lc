package movezeros

func moveZeros(nums []int) {
	zeroCount := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] == 0 {
			zeroCount++
			for j := i; j < len(nums)-zeroCount; j++ {
				if nums[j+1] == 0 {
					continue
				}
				nums[j], nums[j+1] = nums[j+1], nums[j]
			}
		}
	}
}

// this is better option
func moveZeros1(nums []int) {
	zeroCount := 0
	for i := 0; i < len(nums); i++ {
		if nums[i] == 0 {
			zeroCount++
		} else if zeroCount != 0 {
			nums[i-zeroCount] = nums[i]
		}
	}
	for i := len(nums) - zeroCount; i < len(nums); i++ {
		nums[i] = 0
	}
}
