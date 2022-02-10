package Address;

import Address.data.AddressBook;
import Address.data.AddressEntry;

public class AddressBookApplication {

    public static void initAddressBookExercise(AddressBook ab){
        AddressEntry ae1 = new AddressEntry();
        AddressEntry ae2 = new AddressEntry("A","a","a","a","a",0,"a","a");

        ab.add(ae1);
        ab.add(ae2);

        ab.list();
    }

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        initAddressBookExercise(ab);
    }


}
