package section10.mobilephone;

public class Contact {

    private String name;
    private String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }

    /*
    Override equals method to compare Contact objects
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contact) {
            Contact contact = (Contact) obj;
            return this.name.equals(contact.getName()) && this.phoneNumber.equals(contact.getPhoneNumber());
        }
        return false;
    }
}
