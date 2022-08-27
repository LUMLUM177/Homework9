public class Main {

    private static void addBook(Book book, Book[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = book;
                break;
            }
        }
    }

    private static void printAllBooks(Book[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "-я книга - ");
            if (array[i] == null) {
                System.out.println("Данных не обнаружено.");
            } else {
                System.out.print(array[i].getAuthorFullName().getAuthorName() + " " + array[i].getAuthorFullName().getAuthorSurname());
                System.out.println(": " + array[i].getBookName() + ", " + array[i].getPublishingYear());
            }
        }
    }

    public static void main(String[] args) {

        System.out.println();
        Author author1 = new Author("Жюль", "Верн");
        Author author2 = new Author("Александр", "Дюма");
        Author author3 = new Author("Стивен", "Спилберг");
        Author author4 = new Author("Александр", "Пушкин");
        Author author5 = new Author("Лев", "Толстой");

        Book book1 = new Book("Вокруг света за 80 дней", author1, 1873);
        Book book2 = new Book("Граф Монте-Кристо", author2, 1844);
        Book book3 = new Book("Тайна качелей", author3, 1959);
        Book book4 = new Book("Капитанская дочка", author4, 1790);
        Book book5 = new Book("Война и мир", author5, 1896);

        Book books[] = new Book[5];
        books[0] = book5;
        books[2] = book3;
        addBook(book1, books);
        addBook(book2, books);
        addBook(book4, books);
        printAllBooks(books);

        System.out.println();
        System.out.println("========Список книг после изменения года издательства=========");
        System.out.println();
        book3.setPublishingYear(2007);
        book5.setPublishingYear(2010);
        printAllBooks(books);
        System.out.println();
    }
}
