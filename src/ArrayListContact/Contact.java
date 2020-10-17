package ArrayListContact;

public class Contact {
   private String firstName;
   private String lastName;
   private String email;
   private long phone;

   public Contact (String first, String last, String email, long phone) {
      this.firstName = first;
      this.lastName = last;
      this.email = email;
      this.phone = phone;
   }
   public String getFirstName() {
      return firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public String getEmail() {
      return email;
   }
}
