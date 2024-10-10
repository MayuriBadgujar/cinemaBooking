public class Booking {
    private User user;
    private Show show;
    private Seat seat;

    public Booking(User user, Show show, Seat seat) {
        this.user = user;
        this.show = show;
        this.seat = seat;
    }

    public void generateBooking() {
        System.out.println("Booking confirmed for " + user.name);
        System.out.println("Movie: " + show.movie.title);
        System.out.println("Show Time: " + show.showTime);
        System.out.println("Seat Number: " + seat.seatNumber);
    }

}
