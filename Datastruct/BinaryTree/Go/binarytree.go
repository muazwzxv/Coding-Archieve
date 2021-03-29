package main

import "fmt"

// Node
// Insert
// Search

type Node struct {
	Val   int
	Left  *Node
	Right *Node
}

func (n *Node) Insert(v int) {

	if n.Val < v {
		if n.Right == nil {
			n.Right = &Node{Val: v}
		}
		n.Right.Insert(v)
	} else if n.Val > v {
		if n.Left == nil {
			n.Left = &Node{Val: v}
		}
		n.Left.Insert(v)
	}
}

// Returns true if key exist
func (n *Node) Search(key int) bool {
	if n == nil {
		return false
	}

	if n.Val < key {
		return n.Right.Search(key)
	} else if n.Val > key {
		return n.Left.Search(key)
	}
	return true
}

func main() {
	tree := &Node{Val: 20}
	tree.Insert(300)
	tree.Insert(30)
	tree.Insert(50)
	tree.Insert(57)
	tree.Insert(229)
	tree.Insert(33)

	fmt.Println(tree.Search(33))
}
