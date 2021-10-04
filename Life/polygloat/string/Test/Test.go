package main

import (
	"fmt"
)

func main() {
	var arr [2]int

	arr[0] = 1
	arr[1] = 2

	for _, a := range arr {
		fmt.Println(a)
	}
}
