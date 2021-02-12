package main

import (
	"errors"
	"fmt"
)

type node struct {
	data int
	next *node
}

type linkedlist struct {
	head *node
}

func newNode(data int) *node {
	return &node{data, nil}
}

func (list *linkedlist) getFirst() (*node, error) {
	if list.head == nil {
		return nil, errors.New("Houstan we got a problem: The list is empty")
	}
	return list.head, nil
}

func (list *linkedlist) addAtFront(data int) {
	node := newNode(data)
	node.next = list.head
	list.head = node
}

func (list *linkedlist) addAtBack(data int) {
	node := newNode(data)

	if list.head == nil {
		list.head = node
	}
	current := list.head

	for current.next != nil {
		current = current.next
	}

	current.next = node
}

func (list *linkedlist) deleteAtFront() (int, error) {
	if list.head == nil {
		code := -1
		return code, errors.New("Houstan we got a problem: the list is empty")
	}

	current := list.head
	list.head = current.next

	return current.data, nil
}

func (list *linkedlist) deleteAtBack() (int, error) {
	if list.head == nil {
		return -1, errors.New("Houstan we got a problem: the list is empty")
	}

	current := list.head

	for current.next != nil {
		current = current.next
	}

	toReturn := current.data
	current.next = nil
	return toReturn, nil
}

func (list *linkedlist) count() (int, error) {
	if list.head == nil {
		return -1, errors.New("Houstan we got a problem: the list is empty")
	}

	count := 0
	for current := list.head; current.next != nil; current = current.next {
		count++
	}

	return count, nil
}

func (list *linkedlist) displayList() {
	for current := list.head; current != nil; current = current.next {
		fmt.Println(current.data, " ")
	}
	fmt.Print("/n")
}

func (list *linkedlist) reverse() {
	var prev, next *node
	current := list.head

	for current != nil {
		next = current.next
		current.next = prev
		prev = current
		current = next
	}

	list.head = prev
}

func main() {
	list := linkedlist{}
	list.addAtFront(20)
	list.addAtFront(40)

	//list2 := linkedlist{}
	data, err := list.getFirst()

	if err != nil {
		fmt.Println("the error", err)
	} else {
		fmt.Println("The data", data)
	}
}
