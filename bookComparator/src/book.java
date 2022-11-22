public class book implements Comparable<book>{
        private String bookName;
        private int pageNumber;
        private String authorName;
        private int date;

        public book(String bookName, int pageNumber, String authorName, int date) {
            this.bookName = bookName;
            this.pageNumber = pageNumber;
            this.authorName = authorName;
            this.date = date;
        }

        @Override
        public int compareTo(book o) {
            return getBookName().compareTo(o.getBookName());
        }

        public String getBookName() {
            return bookName;
        }

        public void setBookName(String bookName) {
            this.bookName = bookName;
        }

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public String getAuthorName() {
            return authorName;
        }

        public void setAuthorName(String authorName) {
            this.authorName = authorName;
        }

        public int getDate() {
            return date;
        }

        public void setDate(int date) {
            this.date = date;
        }

    }

