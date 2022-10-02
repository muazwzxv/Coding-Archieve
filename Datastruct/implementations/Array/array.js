
class MyArray {
	constructor() {
		this.length = 0
		this.data = {}
	}

	get(i) {
		return this.data[i]
	}

	push(item) { // returns length of array
		this.data[this.length++] = item

		return this.length
	}

	pop() {
		const last = this.data[this.length - 1]
		delete this.data[this.length-1]

		this.length--
		return last
	}

	delete(index) {
		const item = this.data[index]
		this.shiftItem(index)
	}

	shiftItem(index) {
		for (let i = index; i < this.length - 1; i++) {
			this.data[i] = this.data[i+1]
		}
		delete this.data[this.length-1] && this.length--
	}
}

const arr = new MyArray()
arr.push("heh")
arr.push("kontol")
arr.push("fuck")
arr.delete(1)
console.log(arr)