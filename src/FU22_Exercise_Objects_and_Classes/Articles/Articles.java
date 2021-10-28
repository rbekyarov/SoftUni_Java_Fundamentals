package FU22_Exercise_Objects_and_Classes.Articles;

public class Articles {
    //въвеждаме характиристики
    private String Title;
    private String Content;
    private String Author;
//създаваме конструктор
    public Articles(String title, String content, String author) {
        this.Title = title;
        this.Content = content;
        this.Author = author;
    }//създаваме методи
    public void edit (String newContent){
        this.Content = newContent;
    }
    public void changeAuthor (String newAuthor){
        this.Author = newAuthor;
    }
    public void rename (String newTitle){
        this.Title = newTitle;
    }
    @Override
public String toString(){

        return this.Title +" - " +this.Content+": "+this.Author;
    }
}
