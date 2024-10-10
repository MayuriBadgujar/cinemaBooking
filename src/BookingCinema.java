import java.util.Scanner;

public class BookingCinema {
    public static void main(String[] args) {
        // Sample Movies
        Movie movie1 = new Movie("Inception", "Sci-Fi", 148);
        Movie movie2 = new Movie("Titanic", "Romance", 195);

        // Sample Showtimes
        Show show1 = new Show(movie1, "12:00 PM", 1, 5, 5);
        Show show2 = new Show(movie2, "03:00 PM", 2, 5, 5);

        // Register User
      //  User user = User.register("John", "john@example.com", "password");
         User user=User.register("Anu" ,"anu@gmail.com","anu#12");
        // Login User
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email:");
        String email = scanner.next();
        System.out.println("Enter password:");
        String password = scanner.next();
        if (user.login(email, password)) {
            System.out.println("Login successful!");

            // Show available movies and seats
            show1.checkAvailability();

            // Book a seat
            if (show1.reserveSeat(2, 2)) {
                Booking booking = new Booking(user, show1, show1.seats[2][2]);
                booking.generateBooking();
            } else {
                System.out.println("Seat already booked!");
            }
        } else {
            System.out.println("Invalid login credentials.");
        }

        scanner.close();
    }
}