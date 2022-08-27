package ObjectClass

data class Book(var name:String,var price:Int)
object BookShelf{
    var books = arrayListOf<Book>()
    fun showBooks(){
        for(i in books){
            println(i)
        }
    }
}
fun main(args:Array<String>){
   BookShelf.books.add(Book("JAVA",50))
    BookShelf.books.add(Book("SQL",40))
    BookShelf.books.add(Book("KOtlin",80))
    println(BookShelf.books)
    BookShelf.showBooks()

}