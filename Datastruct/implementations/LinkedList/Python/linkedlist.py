class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None


    def insert_front(self, data):
        node = Node(data)
        if (!self.head)
            self.head = node

        current = self.head
        while (current.next):
            current = current.next
        current.next = node

    def print(self):
        current = self.head
        while (current):
            print(current.data)
            current = current.next
