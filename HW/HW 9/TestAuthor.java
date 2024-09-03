public class TestAuthor{

    public static void main(String[] args){
        
        Author2 anAuthor = new Author2("Author", "Author@upb.ro", 'm');
        System.out.println(anAuthor.toString());

        anAuthor.setEmail("newAuthor@upb.ro");
        System.out.println(anAuthor.toString());
    }

}