interface FunOfList<T> {

    fun size():Int
    fun getIndexValue(index:Int):T
    fun add(element:T)
    fun removeElement(element: T)
    fun removeAtIndex(index: Int)
}