package OdevKitapListesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<book> bookList = new ArrayList<>();
        bookList.add(new book("Hobbit", 565, "J.R.R Tolkien", 1940));
        bookList.add(new book("Savaş ve Baris", 800, "Tolstoy", 1915));
        bookList.add(new book("Suc ve Ceza", 612, "Dostoyevski", 1925));
        bookList.add(new book("Tutunamayanlar", 550, "Oğuz Atay", 1950));
        bookList.add(new book("Denizler altinda yirmi bin fersah", 55, "Jules Verne", 1925));
        bookList.add(new book("Kuyucakli Yusuf", 145, "Sabahattin Ali", 1965));
        bookList.add(new book("Metro 2023", 650, "Dmitry Glukhovsky", 2006));



        Map<String,String> bookMap = new HashMap<>();
        bookList.stream().forEach(book->bookMap.put(book.getbookName(), book.getAuthorName()));
        for(String s:bookMap.keySet()){
            System.out.println("Book Name: "+s+"\nAuthorName: "+bookMap.get(s));
        }
        System.out.println("*********************************************");
        List<book> listBook;
        listBook = bookList.stream().filter(book->book.getPageNumber()>100).collect(Collectors.toList());
        listBook.stream().forEach(b->System.out.println("Kitap Adi : "+b.getbookName()+" | " +
                "Sayfa Sayisi : "+b.getPageNumber()+" | "+
                "Yazar : "+b.getAuthorName()+" | "+
                "Yayin Tarihi : "+b.getReleaseDate()));

    }





}