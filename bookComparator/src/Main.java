import java.util.TreeSet;
import java.util.Comparator;
        public class Main {
            public static void main(String[] args) {
                TreeSet<book> sortBook1 = new TreeSet<>();

                book book1 = new book("Şeker Portakalı", 183, "José Mauro de Vasconcelos", 1968);
                book book2 = new book("Martin Eden", 250, "Jack London", 1909);
                book book3 = new book("Kürk Mantolu Madonna", 177, "Sabahattin Ali", 1943);
                book book4 = new book("Fahrenheit 451", 350, "Ray Bradbury", 1953);

                sortBook1.add(book1);
                sortBook1.add(book2);
                sortBook1.add(book3);
                sortBook1.add(book4);

                //Sort by BookName
                for (book bookName : sortBook1) {
                    System.out.println("Book Name: " + bookName.getBookName() +
                            "\nPage Number: " + bookName.getPageNumber() +
                            "\nAuthor Name: " + bookName.getAuthorName() +
                            "\nDate: " + bookName.getDate());
                    System.out.println("------------------------------------------------");
                }

                System.out.println("=====================================================");

                TreeSet<book> sortBook2 = new TreeSet<>(new Comparator<book>() {
                    @Override
                    public int compare(book o1, book o2) {
                        if (o1.getPageNumber() == o2.getPageNumber()) {
                            return o1.getBookName().compareTo(o2.getBookName());
                        }
                        return o1.getPageNumber() - o2.getPageNumber();
                    }
                });

                sortBook2.add(book1);
                sortBook2.add(book2);
                sortBook2.add(book3);
                sortBook2.add(book4);

                //Sort by pageNumber
                for (book pageNum : sortBook2) {
                    System.out.println("Book Name: " + pageNum.getBookName() +
                            "\nPage Number: " + pageNum.getPageNumber() +
                            "\nAuthor Name: " + pageNum.getAuthorName() +
                            "\nDate: " + pageNum.getDate());
                    System.out.println("------------------------------------------------");
                }
            }
        }

