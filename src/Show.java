public class Show {
    public Movie movie;
    public String showTime;
    private int screen;
    public Seat[][] seats;

    public Show(Movie movie, String showTime, int screen, int row,int column) {
        this.movie = movie;
        this.showTime = showTime;
        this.screen = screen;
      seats= new Seat[row][column];
      for(int i=0;i<row;i++){
          for(int j=0;j<column;j++){
             seats[i][j]=new Seat(i * column + j + 1);
          }
      }
    }

    public void checkAvailability() {
    }

    public boolean reserveSeat(int i, int i1) {
        return true;
    }
}
