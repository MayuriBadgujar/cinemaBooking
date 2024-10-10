public class Movie {
    public String title;
    private String genre;
    private int duration;

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
    public void getInfo(){
        System.out.println("Movie name :"+title);
        System.out.println("Genre  :"+genre);
        System.out.println("duration : "+duration);
    }
}
