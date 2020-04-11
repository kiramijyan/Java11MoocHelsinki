
public class Book {

    private String name;
    private int publicationYear;

    public Book(String initName, int initPublicationYear){
        this.name = initName;
        this.publicationYear = initPublicationYear;
    }

    public String getName(){
        return name;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public boolean equals(Object compared){

        if(this == compared){
            return true;
        }

        if(!(compared instanceof Book)){
            return false;
        }

        Book comparedBook = (Book) (compared);

        if(this.name.equals(comparedBook.name)
                && this.publicationYear == comparedBook.publicationYear){
            return true;
        }

        return false;
    }

}
