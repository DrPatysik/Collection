import java.lang.IndexOutOfBoundsException

class MyArrayOfList<T>(  ):FunOfList<T> {
    private var myArray = arrayOfNulls<Any> (10)
    private var size:Int = 0

    override fun size(): Int {
        return size
    }

    override fun getIndexValue(index: Int): T {
        if (index in 0 until size){
            myArray[index]?.let {
                return it as T
            }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(element: T) {
        if (myArray.size <= size) {
            myArray = myArray.copyOf(size * 2)
        }
        myArray[size] = element
        size++
    }

    override fun removeElement(element: T) {
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
        else throw IndexOutOfBoundsException()
    }

    companion object {
        fun <E> createMyList(vararg elem: E):MutableList<E> {
            var myList = mutableListOf(elem)
            return myList as MutableList<E>
        }
    }
}




