package main

import (
	"fmt"
)

func main() {
	var N, i int
	fmt.Scan(&N)
	if N < 10000 {
		for i = 2; i <= 9999; i = i + N {
			fmt.Printf("%d\n", i)
		}
	}
}
