public class Main {

    private static void addBook(Book book, Book[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = book;
                break;
            }
            if (i == array.length - 1) {
                System.out.println("К сожалению, записать данные о книге " + book.getBookName() + " невозможно, не осталось места.");
            }
        }
    }

    private static void printAllBooks(Book[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "-я книга - ");
            if (array[i] == null) {
                System.out.println("Данных не обнаружено.");
            } else {
                System.out.println(array[i].getAuthor() + ": " + array[i].getBookName() + ", " + array[i].getPublishingYear());
            }
        }
    }

    public static void main(String[] args) {

        System.out.println();
        Author juleVerne = new Author("Жюль", "Верн");
        Author alexanderDuma = new Author("Александр", "Дюма");
        Author stivenSpilberg = new Author("Стивен", "Спилберг");
        Author alexanderPushkin = new Author("Александр", "Пушкин");
        Author levTolstoy = new Author("Лев", "Толстой");

        Book aroundTheWorld = new Book("Вокруг света за 80 дней", juleVerne, 1873);
        Book countMonteKristo = new Book("Граф Монте-Кристо", alexanderDuma, 1844);
        Book secretSwing = new Book("Тайна качелей", stivenSpilberg, 1959);
        Book captainDaughter = new Book("Капитанская дочка", alexanderPushkin, 1790);
        Book warAndPeace = new Book("Война и мир", levTolstoy, 1896);
        Book worldDetective = new Book("Всемирный детектив", stivenSpilberg, 1975);


        Book books[] = new Book[5];
        books[0] = warAndPeace;
        books[2] = secretSwing;
        addBook(aroundTheWorld, books);
        addBook(countMonteKristo, books);
        addBook(captainDaughter, books);
        printAllBooks(books);
        addBook(worldDetective, books);

        System.out.println();
        System.out.println("========Список книг после изменения года издательства=========");
        System.out.println();
        secretSwing.setPublishingYear(2007);
        warAndPeace.setPublishingYear(2010);
        printAllBooks(books);
        System.out.println();

        Library library = new Library(5);
        library.addBook(aroundTheWorld);
        library.addBook(captainDaughter);
        library.addBook(countMonteKristo);
        library.addBook(worldDetective);
        library.printAllBooks();
        library.findBookByName("Тайна качелей");

        System.out.println();
        library.addBook(secretSwing);
        library.printAllBooks();
        library.findBookByName("Тайна качелей");

        System.out.println();
        System.out.println("========Список книг после изменения года издательства=========");
        System.out.println();
        library.changePublishingYear("Граф Монте-Кристо", 1900);
        library.printAllBooks();


    }
}

