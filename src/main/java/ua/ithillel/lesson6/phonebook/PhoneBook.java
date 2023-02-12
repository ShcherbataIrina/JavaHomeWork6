package ua.ithillel.lesson6.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private  List<PhoneBookRecord> records = new ArrayList<>();

    public void add(PhoneBookRecord newRecord) {

        records.add(newRecord);

    }

    public PhoneBookRecord find(List<PhoneBookRecord> recordList, String name) {

        int index = recordList.indexOf(name);
        if (index != -1) {
            return recordList.get(index);
        } else return null;

    }

    public List<PhoneBookRecord> findAll(List<PhoneBookRecord> recordList, String name) {
        var resultRecordList = new ArrayList<PhoneBookRecord>();


        for (int i = 0; i < recordList.size(); i++) {

            if(recordList.get(i).equals(name)){
                resultRecordList.add(recordList.get(i));
            }

        }
        if (!resultRecordList.isEmpty()) {
            return resultRecordList;
        } else return null;

    }

    public List<PhoneBookRecord> getAll(){
        for(int i =0; i < records.size(); i++) {
            System.out.println(records.get(i));
        }
        return records;
    }


}
