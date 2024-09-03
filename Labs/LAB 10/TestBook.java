public class TestBook{
    
    public static void main(String[] args){

        Author2 anAuthor = new Author2("Student","student@upb.ro",'m');
        Book aBook = new Book("Java for dummies", anAuthor, 19.95, 1000);
        Book anotherBook = new Book("C for dummies", new Author2("Teacher","teacher@upb.ro",'m'), 29.95, 999);

        System.out.println(aBook.toString());
        System.out.println(anotherBook.toString() + "\n");

        System.out.println(aBook.getAuthor().getName());
        System.out.println(anotherBook.getAuthor().getName() + "\n");

        System.out.println(aBook.getAuthorName());
        System.out.println(aBook.getAuthorGender());
        System.out.println(aBook.getAuthorEmail() + "\n");

        System.out.println(anotherBook.getAuthorName());
        System.out.println(anotherBook.getAuthorGender());
        System.out.println(anotherBook.getAuthorEmail());

    }
}