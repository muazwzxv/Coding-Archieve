package main

import "container/heap"

type treeHeap []HuffmanTree
type HuffmanTree interface {
	Frequency() int
}

type HuffmanLeaf struct {
	freq  int
	value rune
}

type HuffmanNode struct {
	freq        int
	left, right HuffmanTree
}

func (self HuffmanLeaf) Frequency() int {
	return self.freq
}

func (self HuffmanNode) Frequency() int {
	return self.freq
}

func (th treeHeap) Len() int { return len(th) }
func (th treeHeap) Less(i, j int) bool {
	return th[i].Frequency() < th[j].Frequency()
}

func (th *treeHeap) Push(element interface{}) {
	*th = append(*th, element.(HuffmanTree))
}

func (th *treeHeap) Pop(popped interface{}) {
	popped = (*th)[len(*th)-1]
	*th = (*th)[:len(*th)-1]
	return
}

func (th treeHeap) Swap(i, j int) { th[i], th[j] = th[j], th[i] }

func buildTree(symFreqs map[rune]int) HuffmanTree {
	var trees treeHeap

	for c, f := range symFreqs {
		trees = append(trees, HuffmanLeaf{f, c})
	}
	heap.Init(&trees)

	for trees.Len() > 1 {
		// Two trees with least frequency
		a := heap.Pop(&trees).(HuffmanTree)
		b := heap.Pop(&trees).(HuffmanTree)

		// Put into new node and re-insert into queue
		heap.Push(&trees, HuffmanNode(a.Frequency()))
	}
}
