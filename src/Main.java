public class Main {
    public static void main(String[] args) {

        Author author = new Author("Джордж", "Оруэл");
        Book book = new Book("1984", 1949, author);

        Author author1 = new Author("Лев" , "Толстой");
        Book book1 = new Book("Война и мир", 1886, author1);

        System.out.println(book.getPublicationYear());
        book.setPublicationYear(1867);
        System.out.println(book.getPublicationYear());

        System.out.println(book);



    }


}