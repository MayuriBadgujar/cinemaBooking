
    public class Seat {
        public int seatNumber;
        private boolean isBooked;

        public Seat(int seatNumber) {
            this.seatNumber = seatNumber;
            this.isBooked = false;
        }

        public boolean isBooked() {
            return isBooked;
        }

        public void bookSeat() {
            this.isBooked = true;
        }
    }

