package main

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
