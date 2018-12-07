package q0001twosum

import (
	"reflect"
	"testing"
)

func Test_twoSum(t *testing.T) {
	type args struct {
		list []int
		sum  int
	}
	tests := []struct {
		name    string
		args    args
		want    []int
		wantErr bool
	}{
		// TODO: Add test cases.
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got, err := twoSum(tt.args.list, tt.args.sum)
			if (err != nil) != tt.wantErr {
				t.Errorf("twoSum() error = %v, wantErr %v", err, tt.wantErr)
				return
			}
			if !reflect.DeepEqual(got, tt.want) {
				t.Errorf("twoSum() = %v, want %v", got, tt.want)
			}
		})
	}
}
