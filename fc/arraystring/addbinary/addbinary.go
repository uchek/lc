package addbinary

import (
	"fmt"
	"sort"
	"strings"
)

func addBinary(a, b string) string {
	i := len(a)
	j := len(b)
	sum := []int{}

	s := 0
	for i >= 0 || j >= 0 {
		i--
		if i >= 0 {
			s += int(a[i]) - '0'
		}

		j--
		if j >= 0 {
			s += int(b[j]) - '0'
		}

		sum = append(sum, s%2)
		s = s / 2
	}

	sort.Sort(sort.Reverse(sort.IntSlice(sum)))

	fmt.Println(sum)

	return strings.Trim(strings.Join(strings.Split(fmt.Sprint(sum), " "), ""), "][")
}
