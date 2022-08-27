public class Book {
    private final String bookName;
    private final Author authorFullName;
    private int publishingYear;

    public Book(String bookName, Author authorFullName, int publishingYear) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorFullName() {
        return authorFullName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear <= 1750 || publishingYear > 2022) {
            System.out.println("Введён некорректный год издательства книги!");
        }
        this.publishingYear = publishingYear;
    }
}
