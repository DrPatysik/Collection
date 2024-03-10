import java.lang.IndexOutOfBoundsException

class ArrayOfList():FunOfList {
    private var myArray = arrayOfNulls<String>(10)
    var size = 0
    override fun size(): Int {
        return size
    }

    override fun getIndexValue(index: Int): String {
        if (index in 0 until size){
            myArray[index]?.let {
                return it
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(element: String) {
        if (myArray.size <= size) {
            myArray = myArray.copyOf(size * 2)
        }
        myArray[size] = element
        size++
    }

    override fun removeElement(element: String) {
        myArray.forEach { el -> if (el == element){
            removeAtIndex( myArray.indexOf(el) )
        } }

    }

    override fun removeAtIndex(index: Int) {
        if(index < myArray.size) {
            for (i in index..size) {
                myArray[i] = myArray[i + 1]
            }
            size--
        }
    }

}




