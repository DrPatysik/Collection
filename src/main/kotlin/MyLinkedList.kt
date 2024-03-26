import org.w3c.dom.Node

class MyLinkedList() : FunOfList<String> {
    //правильно ли я прописала тип ?
    private var size = 0
    private var nextNode1:MyNode<String>? = null
    private var lastNode1 = null
    private var prevNode:MyNode<String>? = null
    private var value1: MyNode<String>? = null
    private var value = value1.toString()

    override fun size(): Int {
        return size
    }

    override fun getIndexValue(index: Int): String {
        return ""
    }

    override fun removeAtIndex(index: Int) {
        TODO("Not yet implemented")
    }

    override fun removeElement(element: String) {
        TODO("Not yet implemented")
    }

    override fun add(element: String) {
        if (nextNode1 == null) {
            prevNode = value1
            value = element
            lastNode1 = nextNode1
            size++
        }
        else{
            nextNode1.runCatching { nextNode1 == null }
        }
    }


    // не уверена,что тут все верно
    class MyNode<T>(private var value1: T, private var nextNode1: MyNode<T>? = null) {
    }

}