package com.example.p3_h071221035;

import java.util.ArrayList;

public class Data_source {
    public static ArrayList<Account> accounts=generateDummyAccounts();

    private static ArrayList<Account> generateDummyAccounts() {
        ArrayList<Account> accounts=new ArrayList<>();
        accounts.add(new Account("yugen_days",
                R.drawable.japanestetik_story,
                R.drawable.japanestetik_post,
                "When your anime faves open a restaurant: Don't mind me, I'll be here a while. #foodcoma #animelove",
                500,
                69,
                R.drawable.japanestetik_profile));
        accounts.add(new Account("foodie.explorer",
                R.drawable.food_story,
                R.drawable.food,
                "All the goodness in one bowl! Fluffy rice, savory beef, and fresh vegetables - a satisfying and complete meal. #comfortfood #instafood #foodie",
                500,
                69,
                R.drawable.food_profile));
        accounts.add(new Account("mythical_greece",
                R.drawable.greek_story,
                R.drawable.greek_post,
                "Lost in the details of this incredible Greek statue. #ArtAppreciation #GreeceTravels\n",
                500,
                69,
                R.drawable.greek_profile));
        accounts.add(new Account("noodle.nirvana",
                R.drawable.ramen_story,
                R.drawable.ramen_post,
                "Ramen: the only thing better than a hug in a bowl. ❤\uFE0F #ramentherapy #comfortfood",
                500,
                69,
                R.drawable.ramen_profile));
        accounts.add(new Account("momijidani",
                R.drawable.japan_story,
                R.drawable.japan_post,
                "Nature's majesty on display. Witnessing the beauty of the mountains from a unique perspective. #mountaintravel #travelgram #windowview",
                500,
                69,
                R.drawable.japan_profile));
        accounts.add(new Account("chopstickchronicles",
                R.drawable.asianfood_story,
                R.drawable.asianfood_post,
                "#ramen #noodles #beef #vegetables #yum This looks like a delicious bowl of ramen! Are you hungry?",
                500,
                69,
                R.drawable.asianfood_profile));
        accounts.add(new Account("countryside_charm",
                R.drawable.village_story,
                R.drawable.village_post,
                "The full moon casts a magical glow ✨ over this narrow street in [city, Italy]. \uD83C\uDDEE\uD83C\uDDF9 #travelphotography #moonlightmagic",
                500,
                69,
                R.drawable.viking_profile));
        accounts.add(new Account("olympus_overdrive",
                R.drawable.greekcyber_story,
                R.drawable.greekcyber_post,
                "When the gods of Olympus meet neon lights. ⚡\uFE0F\uFE0F Who knew Zeus could rock a mohawk? #cyberpunk #greekmythology #ancientfuture",
                500,
                69,
                R.drawable.greekcyber_profile));
        accounts.add(new Account("words_untamed",
                R.drawable.clasikliterature_story,
                R.drawable.clasikliterature_post,
                "Calling all bookworms! Which classic novel would you pick to survive a deserted island? \uFE0F Let me know in the comments! #desertedislandreads #classiclitchallenge #bookrecommendations\n",
                500,
                69,
                R.drawable.clasikliterature_profile));
        accounts.add(new Account("valhalla_visions",
                R.drawable.viking_story,
                R.drawable.viking_post,
                "A touch of mystery in the morning mist. #fantasyart #gabriel ",
                500,
                69,
                R.drawable.viking_profile));
        accounts.add(new Account("templar",
                R.drawable.templar_story,
                R.drawable.templar_post,
                "A touch of mystery in the morning mist. #fantasyart #gabriel ",
                500,
                69,
                R.drawable.viking_profile));
        return accounts;
    }
}
