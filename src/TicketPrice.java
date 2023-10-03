public class TicketPrice {
    public static void main(String[] args) {
        int ticketPublic = 10;
        int age = 15;
        boolean isStudent = true;
        if(isStudent || age <= 15 || age > 60) {
            ticketPublic = 5;
        }
        System.out.println(ticketPublic);
    }
}
