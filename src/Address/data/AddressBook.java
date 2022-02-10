package Address.data;

import Address.data.AddressEntry;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<AddressEntry> addressEntryList = new ArrayList<>() {
    };

    public void list(){
        //TODO: Redo. This should iterate through addressEntryList and call toString(), which is a Address Entry method, on each item.
        for(AddressEntry element : addressEntryList ){
            System.out.println(element.toString());
        }
    }

    public void add(AddressEntry userEntry){
        addressEntryList.add(userEntry);
    }

}
