class LibraryManagement : Library {
    override fun addBook() {
        println("new book")

    }

    override fun deleBook() {
        println("Book deleted")
    }


    fun main(args: Array<String>) {
        var libraryManagement = LibraryManagement()
        libraryManagement.addBook()
        libraryManagement.showBookInfo()
        libraryManagement.deleBook()
        libraryManagement.showBookInfo()
    }
}