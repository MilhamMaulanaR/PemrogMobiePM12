package com.example.p4_h071221035;

import java.util.ArrayList;

    public class DataSource {
        public static ArrayList<Account> Accounts = generateDummyAccounts();

        private static ArrayList<Account> generateDummyAccounts() {
            ArrayList<Account> Accounts = new ArrayList<>();
            Accounts.add(new Account("Asian Food",
                    "foodies69",
                    "Tasty this shit ass asian food",
                    R.drawable.asianfood_post,
                    R.drawable.asianfood_profile,
                    null));
            Accounts.add(new Account("Hermes helper",
                    "hermesshoes69",
                    "fabulas disputationi liber tritani doctus",
                    R.drawable.greekcyber_post,
                    R.drawable.greek_profile,
                    null));
            Accounts.add(new Account("Tasty Ramen",
                    "Ramenmyass",
                    " movet etiam quis graece non",
                    R.drawable.ramen_post,
                    R.drawable.ramen_profile,
                    null));
            Accounts.add(new Account("Roman Reigns",
                    "romanreigns",
                    "Lorem ipsum dolor amet",
                    R.drawable.japan_post,
                    R.drawable.japan_profile,
                    null));
            Accounts.add(new Account("Big E",
                    "wwebige",
                    "Lorem ipsum dolor amet",
                    R.drawable.templar_post,
                    R.drawable.templar_story,
                    null));

            return Accounts;
        }
    }

