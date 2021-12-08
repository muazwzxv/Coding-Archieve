package main

import "fmt"

type Array struct {
	Length int64
	Data   map[int64]string
}

func (a *Array) get(i int64) string {
	return a.Data[i]
}

func (a *Array) push(item string) {
	a.Data[a.Length] = item
	a.Length++
}

func (a *Array) pop() string {
	last := a.Data[a.Length-1]
	delete(a.Data, a.Length-1)

	a.Length--
	return last
}

func (a *Array) delete(index int64) string {
	last := a.Data[a.Length-1]
	a.shift(index)

	return last
}

func (a *Array) shift(index int64) {
	for i := index; i < a.Length-1; i++ {
		a.Data[i] = a.Data[i+1]
	}
	delete(a.Data, a.Length-1)
	a.Length--
}

func NewArray() *Array {
	return &Array{
		Length: 0,
		Data:   make(map[int64]string),
	}
}

func main() {
	arr := NewArray()
	arr.push("My")
	arr.push("Name")
	arr.push("is")
	arr.push("muaz")
	arr.delete(1)
	fmt.Println(arr)

}
