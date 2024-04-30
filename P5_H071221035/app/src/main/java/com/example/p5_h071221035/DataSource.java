package com.example.p5_h071221035;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Account> accounts = generateDummmyAccount();

    private static ArrayList<Account> generateDummmyAccount(){
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Akun 1",
                "@akun1",
                "hinc gloriatur cum adipisci putent tantas pharetra civibus",
                R.drawable.profile1,
                R.drawable.post1,
                null));
        accounts.add(new Account("Akun 2",
                "@akun2",
                "hinc gloriatur cum adipisci putent tantas pharetra civibus",
                R.drawable.profile2,
                R.drawable.post2,
                null));
        accounts.add(new Account("Akun 3",
                "@akun3",
                "hinc gloriatur cum adipisci putent tantas pharetra civibus",
                R.drawable.profile3,
                R.drawable.post3,
                null));
        accounts.add(new Account("Akun 4",
                "@akun4",
                "hinc gloriatur cum adipisci putent tantas pharetra civibus",
                R.drawable.profile4,
                R.drawable.post4,
                null));
        return accounts;
    }
}
