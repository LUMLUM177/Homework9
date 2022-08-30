import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library(int length) {
        books = new Book[length];
    }

    public void printAllBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.print((i + 1) + "-я книга - ");
            if (books[i] == null) {
                System.out.println("Данных не обнаружено.");
            } else {
                System.out.println(books[i].getAuthor() + ": " + books[i].getBookName() + ", " + books[i].getPublishingYear());
            }
        }
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
            if (i == books.length - 1) {
                System.out.println("К сожалению, записать данные о книге " + book.getBookName() + " невозможно, не осталось места.");
            }
        }
    }

    public void findBookByName(String name) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                System.out.println("К сожалению, данные о книге " + name + " не удалось найти");
                break;
            }
            if (books[i].getBookName().equals(name)) {
                System.out.println(books[i].getBookName() + " by " + books[i].getAuthor() + " was published in " + books[i].getPublishingYear());
                break;
            }
            if (i == books.length - 1) {
                System.out.println("К сожалению, данные о книге " + name + " не удалось найти");
            }
        }
    }

    public void changePublishingYear(String name, int year) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                System.out.println("К сожалению, книгу " + name + " не удалось найти, изменить год публикации невозможно");
                break;
            }
            if (books[i].getBookName().equals(name)) {
                books[i].setPublishingYear(year);
                break;
            }
            if (i == books.length - 1) {
                System.out.println("К сожалению, книгу " + name + " не удалось найти, изменить год публикации невозможно");
            }
        }
    }

}
