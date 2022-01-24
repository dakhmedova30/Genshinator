/**
"Aether", "Albedo", "Aloy", "Amber", "Arataki Itto", "Baizhu", "Barbara", "Beidou", "Bennett", "Chongyun", "Dainsleif", "Diluc", "Diona", "Dottore",
"Eula", "Fischl", "Ganyu", "Gorou", "Hu Tao", "Jean", "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Keqing", "Klee", "Kujou Sara",
"Lisa", "Lumine", "Madame Ping", "Mona", "Ningguang", "Noelle", "Paimon", "Qiqi", "Raiden Shogun", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu",
"Scaramouche", "Shenhe", "Signora", "Sucrose", "Tartaglia", "Teppei", "Teucer", "Timmie", "Thoma", "Venti", "Xiangling", "Xiao", "Xingqiu", "Xinyan",
"Yae Miko", "Yanfei", "Yaoyao", "Yoimiya", "Yun Jin", "Zhongli"
**/

/**
NOTES:
- Add probability for more specific questions
- Add more scenarios and questions
**/

import java.util.*;

public class AkiSim {

  public static void main(String[] args) {

    // CHARACTERS
    ArrayList<String> characters = new ArrayList<>(Arrays.asList(
    "Aether", "Albedo", "Aloy", "Amber", "Arataki Itto",
    "Baizhu", "Barbara", "Beidou", "Bennett",
    "Chongyun",
    "Dainsleif", "Diluc", "Diona", "Dottore",
    "Eula",
    "Fischl",
    "Ganyu", "Gorou",
    "Hu Tao",
    "Jean",
    "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Keqing", "Klee", "Kujou Sara",
    "Lisa", "Lumine",
    "Madame Ping", "Mona",
    "Ningguang", "Noelle",
    "Paimon",
    "Qiqi",
    "Raiden Shogun", "Razor", "Rosaria",
    "Sangonomiya Kokomi", "Sayu", "Scaramouche", "Shenhe", "Signora", "Sucrose",
    "Tartaglia", "Teppei", "Teucer", "Timmie", "Thoma",
    "Venti",
    "Xiangling", "Xiao", "Xingqiu", "Xinyan",
    "Yae Miko", "Yanfei", "Yaoyao", "Yoimiya", "Yun Jin",
    "Zhongli"));


    // GENDER
    ArrayList<String> male = new ArrayList<>(Arrays.asList(
    "Aether", "Albedo", "Arataki Itto", "Baizhu", "Bennett", "Chongyun", "Dainsleif", "Diluc", "Dottore", "Gorou",
    "Kaedehara Kazuha", "Kaeya", "Kamisato Ayato", "Razor", "Scaramouche", "Tartaglia", "Thoma", "Teppei", "Teucer",
    "Timmie", "Venti", "Xiao", "Xingqiu", "Zhongli"));

    ArrayList<String> female = new ArrayList<>(Arrays.asList(
    "Aloy", "Amber", "Barbara", "Beidou", "Diona", "Eula", "Fischl", "Ganyu", "Hu Tao", "Jean", "Kamisato Ayaka",
    "Keqing", "Klee", "Kujou Sara", "Lisa", "Lumine", "Madame Ping", "Mona", "Ningguang", "Noelle", "Paimon", "Qiqi",
    "Raiden Shogun", "Rosaria", "Sangonomiya Kokomi", "Sayu", "Shenhe", "Signora", "Sucrose", "Xiangling", "Xinyan",
    "Yae Miko", "Yanfei", "Yoimiya", "Yun Jin"));


    // HAIR COLOR
    ArrayList<String> redHeadHair = new ArrayList<>(Arrays.asList(
    "Aloy", "Diluc", "Tartaglia", "Teucer"));

    ArrayList<String> blondHair = new ArrayList<>(Arrays.asList(
    "Aether", "Albedo", "Barbara", "Dainsleif", "Fischl", "Jean", "Klee", "Lumine", "Signora", "Timmie", "Thoma", "Yoimiya"));

    ArrayList<String> greenHair = new ArrayList<>(Arrays.asList(
    "Baizhu", "Sucrose", "Venti", "Xiao"));

    ArrayList<String> blueHair = new ArrayList<>(Arrays.asList(
    "Chongyun", "Dottore", "Eula", "Ganyu", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Shenhe", "Venti", "Xiangling", "Xingqiu"));

    ArrayList<String> purpleHair = new ArrayList<>(Arrays.asList(
    "Keqing", "Kujou Sara", "Mona", "Qiqi", "Raiden Shogun", "Rosaria", "Scaramouche", "Yun Jin"));

    ArrayList<String> pinkHair = new ArrayList<>(Arrays.asList(
    "Diona", "Rosaria", "Sangonomiya Kokomi", "Yae Miko", "Yanfei"));

    ArrayList<String> brownHair = new ArrayList<>(Arrays.asList(
    "Amber", "Beidou", "Gorou", "Hu Tao", "Lisa", "Timmie", "Xinyan", "Yaoyao", "Zhongli"));

    ArrayList<String> whiteSilverGrayHair = new ArrayList<>(Arrays.asList(
    "Arataki Itto", "Bennett", "Kaedehara Kazuha", "Madame Ping", "Ningguang", "Noelle", "Paimon", "Razor", "Sayu"));

    ArrayList<String> blackHair = new ArrayList<>(Arrays.asList(
    "Teppei"));


    // VISIONS
    ArrayList<String> pyro = new ArrayList<>(Arrays.asList(
    "Amber", "Bennett", "Diluc", "Hu Tao", "Klee", "Thoma", "Xiangling", "Xinyan", "Yanfei", "Yoimiya"));

    ArrayList<String> cryo = new ArrayList<>(Arrays.asList(
    "Aloy", "Chongyun", "Diona", "Eula", "Ganyu", "Kaeya", "Kamisato Ayaka", "Qiqi", "Rosaria", "Shenhe"));

    ArrayList<String> hydro = new ArrayList<>(Arrays.asList(
    "Barbara", "Mona", "Sangonomiya Kokomi", "Tartaglia", "Xingqiu"));

    ArrayList<String> electro = new ArrayList<>(Arrays.asList(
    "Beidou", "Fischl", "Keqing", "Kujou Sara", "Lisa", "Raiden Shogun", "Razor", "Yae Miko"));

    ArrayList<String> anemo = new ArrayList<>(Arrays.asList(
    "Jean", "Kaedehara Kazuha", "Sayu", "Sucrose", "Venti", "Xiao"));

    ArrayList<String> geo = new ArrayList<>(Arrays.asList(
    "Albedo", "Arataki Itto", "Gorou", "Ningguang", "Noelle", "Yun Jin", "Zhongli"));

    ArrayList<String> dendro = new ArrayList<>(Arrays.asList(
    "Baizhu", "Yaoyao"));

    ArrayList<String> visionlessUnconfirmed = new ArrayList<>(Arrays.asList(
    "Aether", "Dainsleif", "Dottore", "Kamisato Ayato", "Lumine", "Madame Ping", "Scaramouche", "Signora", "Teppei", "Tecuer", "Timmie"));


    // WEAPON
    ArrayList<String> sword = new ArrayList<>(Arrays.asList(
    "Aether", "Albedo", "Bennett", "Jean", "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Keqing", "Lumine", "Qiqi", "Xingqiu"));

    ArrayList<String> claymore = new ArrayList<>(Arrays.asList(
    "Arataki Itto", "Beidou", "Chongyun", "Diluc", "Eula", "Noelle", "Razor", "Sayu", "Xinyan"));

    ArrayList<String> polearm = new ArrayList<>(Arrays.asList(
    "Hu Tao", "Raiden Shogun", "Rosaria", "Shenhe", "Thoma", "Xiangling", "Xiao", "Yun Jin", "Zhongli"));

    ArrayList<String> bow = new ArrayList<>(Arrays.asList(
    "Aloy", "Amber", "Diona", "Fischl", "Ganyu", "Gorou", "Kujou Sara", "Tartaglia", "Venti", "Yoimiya"));

    ArrayList<String> catalyst = new ArrayList<>(Arrays.asList(
    "Barbara", "Klee", "Lisa", "Mona", "Ningguang", "Sangonomiya Kokomi", "Sucrose", "Yae Miko", "Yanfei"));

    ArrayList<String> weaponlessUnconfirmed = new ArrayList<>(Arrays.asList(
    "Baizhu", "Dainsleif", "Dottore", "Kamisato Ayato", "Madame Ping", "Paimon", "Scaramouche", "Signora", "Teppei", "Teucer", "Timmie", "Yaoyao"));


    // REGION
    ArrayList<String> mondstadt = new ArrayList<>(Arrays.asList(
    "Albedo", "Amber", "Barbara", "Bennett", "Diluc", "Diona", "Eula", "Fischl", "Jean", "Kaeya", "Klee", "Lisa", "Mona", "Noelle", "Razor", "Rosaria", "Sucrose", "Timmie", "Venti"));

    ArrayList<String> liyue = new ArrayList<>(Arrays.asList(
    "Baizhu", "Beidou", "Chongyun", "Ganyu", "Hu Tao", "Keqing", "Madame Ping", "Ningguang", "Qiqi", "Shenhe", "Xiangling", "Xiao", "Xingqiu", "Xinyan", "Yanfei", "Yaoyao", "Yun Jin", "Zhongli"));

    ArrayList<String> inazuma = new ArrayList<>(Arrays.asList(
    "Arataki Itto", "Gorou", "Kaedehara Kazuha", "Kamisato Ayaka", "Kamisato Ayato", "Kujou Sara", "Raiden Shogun", "Sangonomiya Kokomi", "Sayu", "Scaramouche", "Teppei", "Thoma", "Yae Miko", "Yoimiya"));

    ArrayList<String> snezhnaya = new ArrayList<>(Arrays.asList(
    "Dottore", "Signora", "Tartaglia", "Teucer"));

    ArrayList<String> regionlessUnknown = new ArrayList<>(Arrays.asList(
    "Aether", "Aloy", "Dainsleif", "Lumine", "Paimon"));


    // EYE COLOR
    ArrayList<String> redEyes = new ArrayList<>(Arrays.asList(
    "Arataki Itto", "Beidou", "Diluc", "Dottore", "Hu Tao", "Kaedehara Kazuha", "Klee", "Ningguang", "Razor", "Yaoyao", "Yun Jin"));

    ArrayList<String> yellowOrangeEyes = new ArrayList<>(Arrays.asList(
    "Aether", "Amber", "Baizhu", "Eula", "Kujou Sara", "Lumine", "Sucrose", "Xiangling", "Xiao", "Xingqiu", "Xinyan", "Yoimiya", "Zhongli"));

    ArrayList<String> greenEyes = new ArrayList<>(Arrays.asList(
    "Aloy", "Bennett", "Diona", "Fischl", "Lisa", "Mona", "Noelle", "Timmie", "Thoma", "Venti", "Yanfei"));

    ArrayList<String> blueEyes = new ArrayList<>(Arrays.asList(
    "Albedo", "Barbara", "Chongyun", "Dainsleif", "Gorou", "Jean", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Madame Ping", "Sangonomiya Kokomi", "Shenhe", "Signora", "Tartaglia", "Teucer"));

    ArrayList<String> purpleEyes = new ArrayList<>(Arrays.asList(
    "Ganyu", "Keqing", "Paimon", "Raiden Shogun", "Scaramouche", "Yae Miko"));

    ArrayList<String> pinkEyes = new ArrayList<>(Arrays.asList(
    "Qiqi", "Rosaria", "Sayu"));

    ArrayList<String> brownEyes = new ArrayList<>(Arrays.asList(
    "Teppei"));


    // HEIGHT
    ArrayList<String> shortH = new ArrayList<>(Arrays.asList(
    "Diona", "Klee", "Paimon", "Qiqi", "Sayu", "Teucer", "Timmie", "Yaoyao"));

    ArrayList<String> averageH = new ArrayList<>(Arrays.asList(
    "Aether", "Albedo", "Aloy", "Amber", "Barbara", "Bennett", "Chongyun", "Fischl", "Ganyu", "Gorou", "Hu Tao",
    "Kaedehara Kazuha", "Kamisato Ayaka", "Keqing", "Lumine", "Madame Ping", "Mona", "Noelle", "Razor", "Sangonomiya Kokomi",
    "Scaramouche", "Sucrose", "Teppei", "Venti", "Xiangling", "Xiao", "Xingqiu", "Xinyan", "Yanfei",  "Yoimiya", "Yun Jin"));

    ArrayList<String> tallH = new ArrayList<>(Arrays.asList(
    "Arataki Itto", "Baizhu", "Beidou", "Dainsleif", "Diluc", "Dottore", "Eula", "Jean", "Kaeya", "Kamisato Ayato", "Kujou Sara",
    "Lisa", "Ningguang", "Raiden Shogun", "Rosaria", "Shenhe", "Signora", "Tartaglia", "Thoma", "Yae Miko", "Zhongli"));


    // PHYSICAL NON-HUMAN TRAITS
    ArrayList<String> yesTraits = new ArrayList<>(Arrays.asList(
    "Arataki Itto", "Diona", "Gorou", "Klee", "Kujou Sara", "Sucrose", "Yae Miko", "Yanfei"));

    ArrayList<String> noTraits = new ArrayList<>(Arrays.asList(
    "Aether", "Albedo", "Aloy", "Amber", "Baizhu", "Barbara", "Beidou", "Bennett", "Chongyun", "Dainsleif", "Diluc", "Dottore",
    "Eula", "Fischl", "Ganyu", "Hu Tao", "Jean", "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Keqing", "Lisa", "Lumine",
    "Madame Ping", "Mona", "Ningguang", "Noelle", "Paimon", "Qiqi", "Raiden Shogun", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu",
    "Scaramouche", "Shenhe", "Signora", "Tartaglia", "Teppei", "Teucer", "Timmie", "Thoma", "Venti", "Xiangling", "Xiao", "Xingqiu", "Xinyan",
    "Yaoyao", "Yoimiya", "Yun Jin", "Zhongli"));


    // PET/COMPANION
    ArrayList<String> yesCompanion = new ArrayList<>(Arrays.asList(
    "Aether", "Amber", "Arataki Itto", "Baizhu", "Fischl", "Gorou", "Klee", "Lumine", "Qiqi", "Razor", "Sayu", "Shenhe", "Timmie", "Venti", "Xiangling", "Yae Miko", "Zhongli"));

    ArrayList<String> noCompanion = new ArrayList<>(Arrays.asList(
    "Albedo", "Aloy", "Barbara", "Beidou", "Bennett", "Chongyun", "Dainsleif", "Diluc", "Diona", "Dottore", "Eula", "Ganyu", "Gorou",
    "Hu Tao", "Jean", "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Keqing", "Klee", "Kujou Sara", "Lisa",
    "Madame Ping", "Mona", "Ningguang", "Noelle", "Paimon", "Qiqi", "Raiden Shogun", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu",
    "Scaramouche", "Shenhe", "Signora", "Sucrose", "Tartaglia", "Teppei", "Teucer", "Thoma", "Venti", "Xiao", "Xingqiu", "Xinyan",
    "Yae Miko", "Yanfei", "Yaoyao", "Yoimiya", "Yun Jin", "Zhongli"));


    // AFFILIATION
    ArrayList<String> knightsOfFavonius = new ArrayList<>(Arrays.asList(
    "Albedo", "Amber", "Eula", "Jean", "Kaeya", "Klee", "Lisa", "Sucrose"));

    ArrayList<String> adventurersGuild = new ArrayList<>(Arrays.asList(
    "Bennett", "Fischl"));

    ArrayList<String> qixing = new ArrayList<>(Arrays.asList(
    "Ganyu", "Keqing", "Ningguang", "Yaoyao"));

    ArrayList<String> adepti = new ArrayList<>(Arrays.asList(
    "Ganyu", "Madame Ping", "Xiao", "Yanfei"));

    ArrayList<String> archons = new ArrayList<>(Arrays.asList(
    "Raiden Shogun", "Venti", "Zhongli"));

    ArrayList<String> yashiroCommission = new ArrayList<>(Arrays.asList(
    "Kamisato Ayaka", "Kamisato Ayato", "Sayu", "Thoma"));

    ArrayList<String> watatsumiIsland = new ArrayList<>(Arrays.asList(
    "Gorou", "Sangonomiya Kokomi", "Teppei"));

    ArrayList<String> harbingers = new ArrayList<>(Arrays.asList(
    "Dottore", "Scaramouche", "Signora", "Tartaglia"));

    ArrayList<String> noAffiliation = new ArrayList<>(Arrays.asList(
    "Aether", "Aloy", "Arataki Itto", "Baizhu", "Barbara", "Beidou", "Chongyun", "Dainsleif", "Diluc", "Diona", "Hu Tao", "Kaedehara Kazuha",
    "Kujou Sara", "Lumine", "Mona", "Noelle", "Paimon", "Qiqi", "Razor", "Rosaria", "Shenhe", "Teucer", "Timmie", "Xiangling", "Xingqiu",
    "Xinyan", "Yae Miko", "Yoimiya", "Yun Jin"));


    // PLAYABLE
    ArrayList<String> playable = new ArrayList<>(Arrays.asList(
    "Aether", "Albedo", "Aloy", "Amber", "Arataki Itto", "Barbara", "Beidou", "Bennett", "Chongyun", "Diluc", "Diona", "Eula", "Fischl",
    "Ganyu", "Gorou", "Hu Tao", "Jean", "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Keqing", "Klee", "Kujou Sara", "Lisa", "Lumine",
    "Mona", "Ningguang", "Noelle", "Qiqi", "Raiden Shogun", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu", "Shenhe", "Sucrose",
    "Tartaglia", "Thoma", "Venti", "Xiangling", "Xiao", "Xingqiu", "Xinyan", "Yae Miko", "Yanfei", "Yoimiya", "Yun Jin", "Zhongli"));

    ArrayList<String> notPlayable = new ArrayList<>(Arrays.asList(
    "Baizhu", "Dainsleif", "Dottore", "Kamisato Ayato", "Madame Ping", "Paimon", "Scaramouche", "Signora", "Teppei", "Teucer", "Timmie", "Yaoyao"));

    // OTHER
    ArrayList<String> fromKhanreiah = new ArrayList<>(Arrays.asList(
    "Albedo", "Dainsleif", "Kaeya"));

    ArrayList<String> notFromKhanreiah = new ArrayList<>(Arrays.asList(
    "Aether", "Aloy", "Amber", "Arataki Itto", "Baizhu", "Barbara", "Beidou", "Bennett", "Chongyun", "Diluc", "Diona", "Dottore", "Eula", "Fischl",
    "Ganyu", "Gorou", "Hu Tao", "Jean", "Kaedehara Kazuha", "Kamisato Ayaka", "Kamisato Ayato", "Keqing", "Klee", "Kujou Sara", "Lisa", "Lumine",
    "Madame Ping", "Mona", "Ningguang", "Noelle", "Paimon", "Qiqi", "Raiden Shogun", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu", "Scaramouche",
    "Shenhe", "Signora", "Sucrose", "Tartaglia", "Teppei", "Teucer", "Timmie", "Thoma", "Venti", "Xiangling", "Xiao", "Xingqiu", "Xinyan", "Yae Miko",
    "Yanfei", "Yaoyao", "Yoimiya", "Yun Jin", "Zhongli"));


    // QUESTIONS
    ArrayList<String> questions = new ArrayList<>(Arrays.asList(
    "Is your character male?",
    "Is your character female?",

    "Is your character a red head?",
    "Is your character blond?",
    "Does your character have green hair?",
    "Does your character have blue hair?",
    "Does your character have purple hair?",
    "Does your character have pink hair?",
    "Does your character have brown hair?",
    "Does your character have white, silver, or gray hair?",
    "Does your character have black hair?",

    "Does your character have a pyro vision?",
    "Does your character have a cryo vision?",
    "Does your character have a hydro vision?",
    "Does your character have a electro vision?",
    "Does your character have a anemo vision?",
    "Does your character have a geo vision?",
    "Does your character have a dendro vision?",
    "Is your character visionless or have an unconfirmed vision?",

    "Does your character wield a sword?",
    "Does your character wield a claymore?",
    "Does your character wield a polearm?",
    "Does your character wield a bow?",
    "Does your character wield a catalyst?",
    "Is your character weaponless or have an unconfirmed weapon?",

    "Does your character reside in Mondstadt?",
    "Does your character reside in Liyue?",
    "Does your character reside in Inazuma?",
    "Does your character reside in Snezhnaya?",
    "Is your character regionless or have an unconfirmed region?",

    "Does your character have red eyes?",
    "Does your character have yellow or orange eyes?",
    "Does your character have green eyes?",
    "Does your character have blue eyes?",
    "Does your character have purple eyes?",
    "Does your character have pink eyes?",
    "Does your character have brown eyes?",

    "Is your character short?",
    "Is your character average height?",
    "Is your character tall?",

    "Does your character have physical non-human traits?",

    "Does your character have a pet or companion?",

    "Is your character part of the Knights of Favonius?",
    "Is your character part of the Adventurer's Guild?",
    "Is your character part of the Qixing?",
    "Is your character an Adeptus?",
    "Is your character an Archon?",
    "Is your character part of the Yashiro Commission?",
    "Is your character an inhabitant of Watatsumi Island?",
    "Is your character a Harbinger?",
    "Is your character unaffiliated?",

    "Is your character playable?",

    "Is your character from Khanrei'ah?"
    ));

    int q;
    String answer = "";
    Scanner in = new Scanner(System.in);

    wait(1);
    System.out.println("Welcome to the Mihoyo-flavored Akinator Simulator! Also known as Genshinator!" );
    wait(1);
    System.out.println();
    System.out.println("Have you thought of a Genshin Impact character? (Y/N)");
    answer = in.nextLine();
    wait(1);
    System.out.println();

    if (answer.equals("Y") || answer.equals("y")) {

      while ((characters.size() > 1)) {

        q = (int)((questions.size() - 1) * Math.random());
        String ques = questions.get(q);
        System.out.println(ques);

        // GENDER
        if (ques.equals("Is your character male?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(female);
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(male);
            questions.remove("Is your character female?");
          }
        }

        else if (ques.equals("Is your character female?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(male);
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(female);
            questions.remove("Is your character male?");
          }
        }

        // HAIR COLOR
        else if (ques.equals("Is your character a red head?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character blond?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(redHeadHair);
          }
        }

        else if (ques.equals("Is your character blond?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(blondHair);
          }
        }

        else if (ques.equals("Does your character have green hair?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head?");
            questions.remove("Is your character blond?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(greenHair);
          }
        }

        else if (ques.equals("Does your character have blue hair?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head?");
            questions.remove("Is your character blond?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(blueHair);
          }
        }

        else if (ques.equals("Does your character have purple hair?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head?");
            questions.remove("Is your character blond?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(purpleHair);
          }
        }

        else if (ques.equals("Does your character have pink hair?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head?");
            questions.remove("Is your character blond?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(pinkHair);
          }
        }

        else if (ques.equals("Does your character have brown hair?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head?");
            questions.remove("Is your character blond?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(brownHair);
          }
        }

        else if (ques.equals("Does your character have white, silver, or gray hair?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head?");
            questions.remove("Is your character blond?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have black hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(whiteSilverGrayHair);
          }
        }

        else if (ques.equals("Does your character have black hair?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            questions.remove("Is your character a red head?");
            questions.remove("Is your character blond?");
            questions.remove("Does your character have green hair?");
            questions.remove("Does your character have blue hair?");
            questions.remove("Does your character have purple hair?");
            questions.remove("Does your character have pink hair?");
            questions.remove("Does your character have brown hair?");
            questions.remove("Does your character have white, silver, or gray hair?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(blackHair);
          }
        }

        // VISION
        else if (ques.equals("Does your character have a pyro vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a cryo vision?");
            questions.remove("Does your character have a hydro vision?");
            questions.remove("Does your character have a electro vision?");
            questions.remove("Does your character have a anemo vision?");
            questions.remove("Does your character have a geo vision?");
            questions.remove("Does your character have a dendro vision?");
            questions.remove("Is your character visionless or have an unconfirmed vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(pyro);
          }
        }

        else if (ques.equals("Does your character have a cryo vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision?");
            questions.remove("Does your character have a hydro vision?");
            questions.remove("Does your character have a electro vision?");
            questions.remove("Does your character have a anemo vision?");
            questions.remove("Does your character have a geo vision?");
            questions.remove("Does your character have a dendro vision?");
            questions.remove("Is your character visionless or have an unconfirmed vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(cryo);
          }
        }

        else if (ques.equals("Does your character have a hydro vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision?");
            questions.remove("Does your character have a cryo vision?");
            questions.remove("Does your character have a electro vision?");
            questions.remove("Does your character have a anemo vision?");
            questions.remove("Does your character have a geo vision?");
            questions.remove("Does your character have a dendro vision?");
            questions.remove("Is your character visionless or have an unconfirmed vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(hydro);
          }
        }

        else if (ques.equals("Does your character have a electro vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision?");
            questions.remove("Does your character have a cryo vision?");
            questions.remove("Does your character have a hydro vision?");
            questions.remove("Does your character have a anemo vision?");
            questions.remove("Does your character have a geo vision?");
            questions.remove("Does your character have a dendro vision?");
            questions.remove("Is your character visionless or have an unconfirmed vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(electro);
          }
        }

        else if (ques.equals("Does your character have a anemo vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision?");
            questions.remove("Does your character have a cryo vision?");
            questions.remove("Does your character have a hydro vision?");
            questions.remove("Does your character have a electro vision?");
            questions.remove("Does your character have a geo vision?");
            questions.remove("Does your character have a dendro vision?");
            questions.remove("Is your character visionless or have an unconfirmed vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(anemo);
          }
        }

        else if (ques.equals("Does your character have a geo vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision?");
            questions.remove("Does your character have a cryo vision?");
            questions.remove("Does your character have a hydro vision?");
            questions.remove("Does your character have a electro vision?");
            questions.remove("Does your character have a anemo vision?");
            questions.remove("Does your character have a dendro vision?");
            questions.remove("Is your character visionless or have an unconfirmed vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(geo);
          }
        }

        else if (ques.equals("Does your character have a dendro vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision?");
            questions.remove("Does your character have a cryo vision?");
            questions.remove("Does your character have a hydro vision?");
            questions.remove("Does your character have a electro vision?");
            questions.remove("Does your character have a anemo vision?");
            questions.remove("Does your character have a geo vision?");
            questions.remove("Is your character visionless or have an unconfirmed vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(dendro);
          }
        }

        else if (ques.equals("Is your character visionless or have an unconfirmed vision?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            questions.remove("Does your character have a pyro vision?");
            questions.remove("Does your character have a cryo vision?");
            questions.remove("Does your character have a hydro vision?");
            questions.remove("Does your character have a electro vision?");
            questions.remove("Does your character have a anemo vision?");
            questions.remove("Does your character have a geo vision?");
            questions.remove("Does your character have a dendro vision?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(visionlessUnconfirmed);
          }
        }

        // WEAPON
        else if (ques.equals("Does your character wield a sword?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a claymore?");
            questions.remove("Does your character wield a polearm?");
            questions.remove("Does your character wield a bow?");
            questions.remove("Does your character wield a catalyst?");
            questions.remove("Is your character weaponless or have an unconfirmed weapon?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(sword);
          }
        }

        else if (ques.equals("Does your character wield a claymore?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword?");
            questions.remove("Does your character wield a polearm?");
            questions.remove("Does your character wield a bow?");
            questions.remove("Does your character wield a catalyst?");
            questions.remove("Is your character weaponless or have an unconfirmed weapon?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(claymore);
          }
        }

        else if (ques.equals("Does your character wield a polearm?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword?");
            questions.remove("Does your character wield a claymore?");
            questions.remove("Does your character wield a bow?");
            questions.remove("Does your character wield a catalyst?");
            questions.remove("Is your character weaponless or have an unconfirmed weapon?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(polearm);
          }
        }

        else if (ques.equals("Does your character wield a bow?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword?");
            questions.remove("Does your character wield a claymore?");
            questions.remove("Does your character wield a polearm?");
            questions.remove("Does your character wield a catalyst?");
            questions.remove("Is your character weaponless or have an unconfirmed weapon?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(bow);
          }
        }

        else if (ques.equals("Does your character wield a catalyst?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword?");
            questions.remove("Does your character wield a claymore?");
            questions.remove("Does your character wield a polearm?");
            questions.remove("Does your character wield a bow?");
            questions.remove("Is your character weaponless or have an unconfirmed weapon?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(catalyst);
          }
        }

        else if (ques.equals("Is your character weaponless or have an unconfirmed weapon?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            questions.remove("Does your character wield a sword?");
            questions.remove("Does your character wield a claymore?");
            questions.remove("Does your character wield a polearm?");
            questions.remove("Does your character wield a bow?");
            questions.remove("Does your character wield a catalyst?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(weaponlessUnconfirmed);
          }
        }

        // REGION
        else if (ques.equals("Does your character reside in Mondstadt?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(liyue);
            characters.removeAll(inazuma);
            characters.removeAll(snezhnaya);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Liyue?");
            questions.remove("Does your character reside in Inazuma?");
            questions.remove("Does your character reside in Snezhnaya?");
            questions.remove("Is your character regionless or have an unconfirmed region?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(mondstadt);
          }
        }

        else if (ques.equals("Does your character reside in Liyue?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(inazuma);
            characters.removeAll(snezhnaya);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Mondstadt?");
            questions.remove("Does your character reside in Inazuma?");
            questions.remove("Does your character reside in Snezhnaya?");
            questions.remove("Is your character regionless or have an unconfirmed region?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(liyue);
          }
        }

        else if (ques.equals("Does your character reside in Inazuma?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(liyue);
            characters.removeAll(snezhnaya);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Mondstadt?");
            questions.remove("Does your character reside in Liyue?");
            questions.remove("Does your character reside in Snezhnaya?");
            questions.remove("Is your character regionless or have an unconfirmed region?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(inazuma);
          }
        }

        else if (ques.equals("Does your character reside in Snezhnaya?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(liyue);
            characters.removeAll(inazuma);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Mondstadt?");
            questions.remove("Does your character reside in Liyue?");
            questions.remove("Does your character reside in Inazuma?");
            questions.remove("Is your character regionless or have an unconfirmed region?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(snezhnaya);
          }
        }

        else if (ques.equals("Is your character regionless or have an unconfirmed region?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(liyue);
            characters.removeAll(inazuma);
            characters.removeAll(snezhnaya);
            questions.remove("Does your character reside in Mondstadt?");
            questions.remove("Does your character reside in Liyue?");
            questions.remove("Does your character reside in Inazuma?");
            questions.remove("Does your character reside in Snezhnaya?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(regionlessUnknown);
          }
        }

        // EYE COLOR
        else if (ques.equals("Does your character have red eyes?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have yellow or orange eyes?");
            questions.remove("Does your character have green eyes?");
            questions.remove("Does your character have blue eyes?");
            questions.remove("Does your character have purple eyes?");
            questions.remove("Does your character have pink eyes?");
            questions.remove("Does your character have brown eyes?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(redEyes);
          }
        }

        else if (ques.equals("Does your character have yellow or orange eyes?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes?");
            questions.remove("Does your character have green eyes?");
            questions.remove("Does your character have blue eyes?");
            questions.remove("Does your character have purple eyes?");
            questions.remove("Does your character have pink eyes?");
            questions.remove("Does your character have brown eyes?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(yellowOrangeEyes);
          }
        }

        else if (ques.equals("Does your character have green eyes?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes?");
            questions.remove("Does your character have yellow or orange eyes?");
            questions.remove("Does your character have blue eyes?");
            questions.remove("Does your character have purple eyes?");
            questions.remove("Does your character have pink eyes?");
            questions.remove("Does your character have brown eyes?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(greenEyes);
          }
        }

        else if (ques.equals("Does your character have blue eyes?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes?");
            questions.remove("Does your character have yellow or orange eyes?");
            questions.remove("Does your character have green eyes?");
            questions.remove("Does your character have purple eyes?");
            questions.remove("Does your character have pink eyes?");
            questions.remove("Does your character have brown eyes?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(blueEyes);
          }
        }

        else if (ques.equals("Does your character have purple eyes?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes?");
            questions.remove("Does your character have yellow or orange eyes?");
            questions.remove("Does your character have green eyes?");
            questions.remove("Does your character have blue eyes?");
            questions.remove("Does your character have pink eyes?");
            questions.remove("Does your character have brown eyes?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(purpleEyes);
          }
        }

        else if (ques.equals("Does your character have pink eyes?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes?");
            questions.remove("Does your character have yellow or orange eyes?");
            questions.remove("Does your character have green eyes?");
            questions.remove("Does your character have blue eyes?");
            questions.remove("Does your character have purple eyes?");
            questions.remove("Does your character have brown eyes?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(pinkEyes);
          }
        }

        else if (ques.equals("Does your character have brown eyes?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            questions.remove("Does your character have red eyes?");
            questions.remove("Does your character have yellow or orange eyes?");
            questions.remove("Does your character have green eyes?");
            questions.remove("Does your character have blue eyes?");
            questions.remove("Does your character have purple eyes?");
            questions.remove("Does your character have pink eyes?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(brownEyes);
          }
        }

        // HEIGHT
        else if (ques.equals("Is your character short?")) {
          answer = in.nextLine();
          questions.remove(q);

          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(averageH);
            characters.removeAll(tallH);
            questions.remove("Is your character average height?");
            questions.remove("Is your character tall?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(shortH);
          }
        }

        else if (ques.equals("Is your character average height?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(shortH);
            characters.removeAll(tallH);
            questions.remove("Is your character short?");
            questions.remove("Is your character tall?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(averageH);
          }
        }

        else if (ques.equals("Is your character tall?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(shortH);
            characters.removeAll(averageH);
            questions.remove("Is your character short?");
            questions.remove("Is your character average height?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(tallH);
          }
        }

        // PHYSICAL NON-HUMAN TRAITS
        else if (ques.equals("Does your character have physical non-human traits?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(noTraits);
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(yesTraits);
          }
        }

        // PET/COMPANION
        else if (ques.equals("Does your character have a pet or companion?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(noCompanion);
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(yesCompanion);
          }
        }

        // AFFILIATION
        else if (ques.equals("Is your character part of the Knights of Favonius?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character a Harbinger?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(knightsOfFavonius);
          }
        }

        else if (ques.equals("Is your character part of the Adventurer's Guild?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character a Harbinger?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(adventurersGuild);
          }
        }

        else if (ques.equals("Is your character part of the Qixing?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character a Harbinger?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(qixing);
          }
        }

        else if (ques.equals("Is your character an Adeptus?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character a Harbinger?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(adepti);
          }
        }

        else if (ques.equals("Is your character an Archon?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character a Harbinger?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(archons);
          }
        }

        else if (ques.equals("Is your character part of the Yashiro Commission?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character a Harbinger?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(yashiroCommission);
          }
        }

        else if (ques.equals("Is your character an inhabitant of Watatsumi Island?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character a Harbinger?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(watatsumiIsland);
          }
        }

        else if (ques.equals("Is your character a Harbinger?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character unaffiliated?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(harbingers);
          }
        }

        else if (ques.equals("Is your character unaffiliated?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            questions.remove("Is your character part of the Knights of Favonius?");
            questions.remove("Is your character part of the Adventurer's Guild?");
            questions.remove("Is your character part of the Qixing?");
            questions.remove("Is your character an Adeptus?");
            questions.remove("Is your character an Archon?");
            questions.remove("Is your character part of the Yashiro Commission?");
            questions.remove("Is your character an inhabitant of Watatsumi Island?");
            questions.remove("Is your character a Harbinger?");
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(noAffiliation);
          }
        }

        // PLAYABLE
        else if (ques.equals("Is your character playable?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(notPlayable);
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(playable);
          }
        }

        // KHANREI'AH
        else if (ques.equals("Is your character from Khanrei'ah?")) {
          answer = in.nextLine();
          questions.remove(q);
          if (answer.equals("Y") || answer.equals("y")) {
            characters.removeAll(notFromKhanreiah);
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.removeAll(fromKhanreiah);
          }
        }
        wait(1);
        System.out.println();
      }
    }
    else if (answer.equals("N") || answer.equals("n")) {
      wait(1);
      System.out.println("Come back when you're ready then.");
      return;
    }
    if (characters.size() == 0) {
      wait(1);
      System.out.println("You have truly bested me! Who was your character?");
      answer = in.nextLine();
      wait(1);
      System.out.println();
      System.out.println("I see... so it was " + answer + ". I'll be sure to guess it next time!");
    }
    else {
      wait(1);
      System.out.println();
      System.out.print("Processing");
      wait(1);
      System.out.print(".");
      wait(1);
      System.out.print(".");
      wait(1);
      System.out.println(".");
      wait(2);
      System.out.println("Is your character " + characters.get(0) + "? (Y/N)");
      answer = in.nextLine();
      if (answer.equals("Y") || answer.equals("y")) {
        wait(1);
        System.out.println();
        System.out.println("Yay, I guessed it! Thank you for playing AkiSim!");
      }
      else if (answer.equals("N") || answer.equals("n")) {
        wait(1);
        System.out.println();
        System.out.println("Aww, better luck next time... Thank you for playing Genshinator!");
      }
    }
  }

  public static void wait(int s) {
    try {
      Thread.sleep(s * 1000);
    }
    catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
