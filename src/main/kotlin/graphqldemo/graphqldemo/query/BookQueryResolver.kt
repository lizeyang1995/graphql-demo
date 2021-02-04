package graphqldemo.graphqldemo.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import graphqldemo.graphqldemo.dto.Author
import graphqldemo.graphqldemo.dto.Book
import org.springframework.stereotype.Component

@Component
class BookQueryResolver: GraphQLQueryResolver {
    fun findBooks(): List<Book> {
        val author: Author = Author(1, "lzy", 20)
        val book: Book = Book(1, "Kotlin编程", author, "电子工业出版社")
        val books = arrayListOf<Book>()
        books.add(book)
        return books
    }
}