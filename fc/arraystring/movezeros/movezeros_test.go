package movezeros

import (
	"fmt"
	"testing"
)

func Test_moveZeros(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
	}{
		{"postive",
			args{[]int{0, 1, 0, 2, 0, 3, 10, 7}},
		},
		{"postive",
			args{[]int{1, 0, 2, 0, 3, 10, 7}},
		},
		{"postive",
			args{[]int{1, 0, 2, 0, 3, 10, 0}},
		},
		{"postive",
			args{[]int{0, 0, 0, 0}},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			moveZeros1(tt.args.nums)
			fmt.Println(tt.args.nums)
		})
	}
}
