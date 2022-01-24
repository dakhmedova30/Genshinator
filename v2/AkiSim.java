/**
"Aether", "Albedo", "Aloy", "Amber", "Arataki Itto", "Baizhu", "Barbara", "Beidou", "Bennett", "Chongyun", "Dainsleif", "Diluc", "Diona", "Dottore",
"Eula", "Fischl", "Ganyu", "Gorou", "Hu Tao", "Jean", "Kaedehara Kazuha", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Keqing", "Klee", "Kujou Sara",
"Lisa", "Lumine", "Madame Ping", "Mona", "Ningguang", "Noelle", "Paimon", "Qiqi", "Raiden Shogun", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu",
"Scaramouche", "Shenhe", "Signora", "Sucrose", "Tartaglia", "Teppei", "Teucer", "Timmie", "Thoma", "Venti", "Xiangling", "Xiao", "Xingqiu", "Xinyan",
"Yae Miko", "Yanfei", "Yaoyao", "Yoimiya", "Yun Jin", "Zhongli"
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

    ArrayList<String> yesSiblings = new ArrayList<>(Arrays.asList(
    "Aether", "Barbara", "Diluc", "Jean", "Kaeya", "Kamisato Ayaka", "Kamisato Ayato", "Lumine", "Tartaglia", "Teucer", "Raiden Shogun"));

    ArrayList<String> noSiblings = new ArrayList<>(Arrays.asList(
    "Albedo", "Aloy", "Amber", "Arataki Itto", "Baizhu", "Beidou", "Bennett", "Chongyun", "Dainsleif", "Diona", "Dottore",
    "Eula", "Fischl", "Ganyu", "Gorou", "Hu Tao", "Kaedehara Kazuha", "Keqing", "Klee", "Kujou Sara", "Lisa", "Madame Ping",
    "Mona", "Ningguang", "Noelle", "Paimon", "Qiqi", "Razor", "Rosaria", "Sangonomiya Kokomi", "Sayu",
    "Scaramouche", "Shenhe", "Signora", "Sucrose", "Teppei", "Timmie", "Thoma", "Venti", "Xiangling", "Xiao", "Xingqiu",
    "Xinyan", "Yae Miko", "Yanfei", "Yaoyao", "Yoimiya", "Yun Jin", "Zhongli"));


    // QUESTIONS
    ArrayList<String> questions = new ArrayList<>(Arrays.asList(
    "Is your character male? (Y/N/IDK)",
    "Is your character female? (Y/N/IDK)",

    "Is your character a red head? (Y/N/IDK)",
    "Is your character blond? (Y/N/IDK)",
    "Does your character have green hair? (Y/N/IDK)",
    "Does your character have blue hair? (Y/N/IDK)",
    "Does your character have purple hair? (Y/N/IDK)",
    "Does your character have pink hair? (Y/N/IDK)",
    "Does your character have brown hair? (Y/N/IDK)",
    "Does your character have white, silver, or gray hair? (Y/N/IDK)",
    "Does your character have black hair? (Y/N/IDK)",

    "Does your character have a pyro vision? (Y/N/IDK)",
    "Does your character have a cryo vision? (Y/N/IDK)",
    "Does your character have a hydro vision? (Y/N/IDK)",
    "Does your character have a electro vision? (Y/N/IDK)",
    "Does your character have a anemo vision? (Y/N/IDK)",
    "Does your character have a geo vision? (Y/N/IDK)",
    "Does your character have a dendro vision? (Y/N/IDK)",
    "Is your character visionless or have an unconfirmed vision? (Y/N/IDK)",

    "Does your character wield a sword? (Y/N/IDK)",
    "Does your character wield a claymore? (Y/N/IDK)",
    "Does your character wield a polearm? (Y/N/IDK)",
    "Does your character wield a bow? (Y/N/IDK)",
    "Does your character wield a catalyst? (Y/N/IDK)",
    "Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)",

    "Does your character reside in Mondstadt? (Y/N/IDK)",
    "Does your character reside in Liyue? (Y/N/IDK)",
    "Does your character reside in Inazuma? (Y/N/IDK)",
    "Does your character reside in Snezhnaya? (Y/N/IDK)",
    "Is your character regionless or have an unconfirmed region? (Y/N/IDK)",

    "Does your character have red eyes? (Y/N/IDK)",
    "Does your character have yellow or orange eyes? (Y/N/IDK)",
    "Does your character have green eyes? (Y/N/IDK)",
    "Does your character have blue eyes? (Y/N/IDK)",
    "Does your character have purple eyes? (Y/N/IDK)",
    "Does your character have pink eyes? (Y/N/IDK)",
    "Does your character have brown eyes? (Y/N/IDK)",

    "Is your character short? (Y/N/IDK)",
    "Is your character average height? (Y/N/IDK)",
    "Is your character tall? (Y/N/IDK)",

    "Does your character have physical non-human traits? (Y/N/IDK)",

    "Does your character have a pet or companion? (Y/N/IDK)",

    "Is your character part of the Knights of Favonius? (Y/N/IDK)",
    "Is your character part of the Adventurer's Guild? (Y/N/IDK)",
    "Is your character part of the Qixing? (Y/N/IDK)",
    "Is your character an Adeptus? (Y/N/IDK)",
    "Is your character an Archon? (Y/N/IDK)",
    "Is your character part of the Yashiro Commission? (Y/N/IDK)",
    "Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)",
    "Is your character a Harbinger? (Y/N/IDK)",
    "Is your character unaffiliated? (Y/N/IDK)",

    "Is your character playable? (Y/N/IDK)",

    "Is your character from Khanrei'ah? (Y/N/IDK)",

    "Does your character have siblings? (Y/N/IDK)",

    "Is your character's constellation Viator? (Y/N/IDK)",
    "Is your character's constellation Viatrix? (Y/N/IDK)",
    "Is your character's constellation Princeps Cretaceus? (Y/N/IDK)",
    "Is your character's constellation Nora Fortis? (Y/N/IDK)",
    "Is your character's constellation Lepus? (Y/N/IDK)",
    "Is your character's constellation Taurus Iracundus? (Y/N/IDK)",
    "Is your character's constellation Crater? (Y/N/IDK)",
    "Is your character's constellation Victor Mare? (Y/N/IDK)",
    "Is your character's constellation Rota Calamitas? (Y/N/IDK)",
    "Is your character's constellation Nubis Caesor? (Y/N/IDK)",
    "Is your character's constellation Noctua? (Y/N/IDK)",
    "Is your character's constellation Feles? (Y/N/IDK)",
    "Is your character's constellation Aphros Delos? (Y/N/IDK)",
    "Is your character's constellation Corvus? (Y/N/IDK)",
    "Is your character's constellation Sinae Unicornis? (Y/N/IDK)",
    "Is your character's constellation Canis Bellatoris? (Y/N/IDK)",
    "Is your character's constellation Papilio Charontis? (Y/N/IDK)",
    "Is your character's constellation Leo Minor? (Y/N/IDK)",
    "Is your character's constellation Acer Palmatum? (Y/N/IDK)",
    "Is your character's constellation Pavo Ocellus? (Y/N/IDK)",
    "Is your character's constellation Grus Nivis? (Y/N/IDK)",
    "Is your character's constellation Trulla Cementarii? (Y/N/IDK)",
    "Is your character's constellation Trifolium? (Y/N/IDK)",
    "Is your character's constellation Flabellum? (Y/N/IDK)",
    "Is your character's constellation Tempus Fugit? (Y/N/IDK)",
    "Is your character's constellation Astrolabos? (Y/N/IDK)",
    "Is your character's constellation Opus Aequilibrium? (Y/N/IDK)",
    "Is your character's constellation Parma Cordis? (Y/N/IDK)",
    "Is your character's constellation Pristina Nola? (Y/N/IDK)",
    "Is your character's constellation Imperatrix Umbrosa? (Y/N/IDK)",
    "Is your character's constellation Lupus Minor? (Y/N/IDK)",
    "Is your character's constellation Spinea Corona? (Y/N/IDK)",
    "Is your character's constellation Dracaena Somnolenta? (Y/N/IDK)",
    "Is your character's constellation Nyctereutes Minor? (Y/N/IDK)",
    "Is your character's constellation Crista Doloris? (Y/N/IDK)",
    "Is your character's constellation Ampulla? (Y/N/IDK)",
    "Is your character's constellation Monoceros Caeli? (Y/N/IDK)",
    "Is your character's constellation Rubeum Scutum? (Y/N/IDK)",
    "Is your character's constellation Carmen Dei? (Y/N/IDK)",
    "Is your character's constellation Trulla? (Y/N/IDK)",
    "Is your character's constellation Alatus Nemeseos? (Y/N/IDK)",
    "Is your character's constellation Fabulae Textile? (Y/N/IDK)",
    "Is your character's constellation Fila Ignium? (Y/N/IDK)",
    "Is your character's constellation Divina Vulpes? (Y/N/IDK)",
    "Is your character's constellation Bestia Iustitia? (Y/N/IDK)",
    "Is your character's constellation Carassius Auratus? (Y/N/IDK)",
    "Is your character's constellation Opera Grandis? (Y/N/IDK)",
    "Is your character's constellation Lapis Dei? (Y/N/IDK)",

    "Is your character emergency food? (Y/N/IDK)",
    "Is your character the Spindrift Knight? (Y/N/IDK)",
    "Is your character best friends with Dodoco? (Y/N/IDK)"
    ));

    int probability;
    int q = 0;
    String answer = "";
    Scanner in = new Scanner(System.in);

    wait(1);
    System.out.println("Welcome to the Mihoyo-flavored Akinator Simulator! Also known as Genshinator!" );
    wait(1);
    System.out.println();
    System.out.println("Have you thought of a Genshin Impact character? (Y/N)");
    answer = in.nextLine().toLowerCase();
    wait(1);
    System.out.println();

    if (answer.equals("y")) {

      while ((characters.size() > 1)) {

        if (questions.size() <= 0) {
          characters.removeAll(characters);
          wait(1);
          System.out.println("You have truly bested me! Who was your character?");
          answer = in.nextLine();
          wait(1);
          System.out.println();
          System.out.println("I see... so it was " + answer + ". I'll be sure to guess it next time!");
          return;
        }

        probability = (int)((Math.random() * 99) + 1);

        if (probability >= 1 && probability <= 75) {
          q = (int)(questions.indexOf("Does your character have siblings? (Y/N/IDK)") * Math.random());
        }
        else if (probability >= 76 && probability <= 85) {
          q = (int)((((questions.indexOf("Is your character's constellation Lapis Dei? (Y/N/IDK)")) - (questions.indexOf("Does your character have siblings? (Y/N/IDK)"))) * Math.random()) + questions.indexOf("Does your character have siblings? (Y/N/IDK)"));
        }
        else {
          q = (int)((((questions.size() - 1) - (questions.indexOf("Is your character's constellation Lapis Dei? (Y/N/IDK)"))) * Math.random()) + questions.indexOf("Is your character's constellation Lapis Dei? (Y/N/IDK)"));
        }

        String ques = questions.get(q);
        System.out.println(ques);

        // GENDER
        if (ques.equals("Is your character male? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(female);
          }
          else if (answer.equals("n")) {
            characters.removeAll(male);
            questions.remove("Is your character female? (Y/N/IDK)");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character male? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character female? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(male);
          }
          else if (answer.equals("n")) {
            characters.removeAll(female);
            questions.remove("Is your character male? (Y/N/IDK)");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character female? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // HAIR COLOR
        else if (ques.equals("Is your character a red head? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(redHeadHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character a red head? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character blond? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(blondHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character blond? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have green hair? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(greenHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have green hair? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have blue hair? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(blueHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have purple hair? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(purpleHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have pink hair? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(pinkHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have brown hair? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(whiteSilverGrayHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(brownHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have white, silver, or gray hair? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(blackHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(whiteSilverGrayHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have black hair? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redHeadHair);
            characters.removeAll(blondHair);
            characters.removeAll(greenHair);
            characters.removeAll(blueHair);
            characters.removeAll(purpleHair);
            characters.removeAll(pinkHair);
            characters.removeAll(brownHair);
            characters.removeAll(whiteSilverGrayHair);
            questions.remove("Is your character a red head? (Y/N/IDK)");
            questions.remove("Is your character blond? (Y/N/IDK)");
            questions.remove("Does your character have green hair? (Y/N/IDK)");
            questions.remove("Does your character have blue hair? (Y/N/IDK)");
            questions.remove("Does your character have purple hair? (Y/N/IDK)");
            questions.remove("Does your character have pink hair? (Y/N/IDK)");
            questions.remove("Does your character have brown hair? (Y/N/IDK)");
            questions.remove("Does your character have white, silver, or gray hair? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(blackHair);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have black hair? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // VISION
        else if (ques.equals("Does your character have a pyro vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(pyro);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have a cryo vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(cryo);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have a hydro vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(hydro);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have a electro vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(electro);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have a anemo vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(anemo);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have a geo vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(dendro);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(geo);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have a dendro vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(visionlessUnconfirmed);
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(dendro);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(pyro);
            characters.removeAll(cryo);
            characters.removeAll(hydro);
            characters.removeAll(electro);
            characters.removeAll(anemo);
            characters.removeAll(geo);
            characters.removeAll(dendro);
            questions.remove("Does your character have a pyro vision? (Y/N/IDK)");
            questions.remove("Does your character have a cryo vision? (Y/N/IDK)");
            questions.remove("Does your character have a hydro vision? (Y/N/IDK)");
            questions.remove("Does your character have a electro vision? (Y/N/IDK)");
            questions.remove("Does your character have a anemo vision? (Y/N/IDK)");
            questions.remove("Does your character have a geo vision? (Y/N/IDK)");
            questions.remove("Does your character have a dendro vision? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(visionlessUnconfirmed);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character visionless or have an unconfirmed vision? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // WEAPON
        else if (ques.equals("Does your character wield a sword? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a claymore? (Y/N/IDK)");
            questions.remove("Does your character wield a polearm? (Y/N/IDK)");
            questions.remove("Does your character wield a bow? (Y/N/IDK)");
            questions.remove("Does your character wield a catalyst? (Y/N/IDK)");
            questions.remove("Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(sword);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character wield a sword? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character wield a claymore? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword? (Y/N/IDK)");
            questions.remove("Does your character wield a polearm? (Y/N/IDK)");
            questions.remove("Does your character wield a bow? (Y/N/IDK)");
            questions.remove("Does your character wield a catalyst? (Y/N/IDK)");
            questions.remove("Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(claymore);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character wield a claymore? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character wield a polearm? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword? (Y/N/IDK)");
            questions.remove("Does your character wield a claymore? (Y/N/IDK)");
            questions.remove("Does your character wield a bow? (Y/N/IDK)");
            questions.remove("Does your character wield a catalyst? (Y/N/IDK)");
            questions.remove("Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(polearm);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character wield a polearm? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character wield a bow? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(catalyst);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword? (Y/N/IDK)");
            questions.remove("Does your character wield a claymore? (Y/N/IDK)");
            questions.remove("Does your character wield a polearm? (Y/N/IDK)");
            questions.remove("Does your character wield a catalyst? (Y/N/IDK)");
            questions.remove("Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(bow);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character wield a bow? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character wield a catalyst? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(weaponlessUnconfirmed);
            questions.remove("Does your character wield a sword? (Y/N/IDK)");
            questions.remove("Does your character wield a claymore? (Y/N/IDK)");
            questions.remove("Does your character wield a polearm? (Y/N/IDK)");
            questions.remove("Does your character wield a bow? (Y/N/IDK)");
            questions.remove("Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(catalyst);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character wield a catalyst? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(sword);
            characters.removeAll(claymore);
            characters.removeAll(polearm);
            characters.removeAll(bow);
            characters.removeAll(catalyst);
            questions.remove("Does your character wield a sword? (Y/N/IDK)");
            questions.remove("Does your character wield a claymore? (Y/N/IDK)");
            questions.remove("Does your character wield a polearm? (Y/N/IDK)");
            questions.remove("Does your character wield a bow? (Y/N/IDK)");
            questions.remove("Does your character wield a catalyst? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(weaponlessUnconfirmed);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character weaponless or have an unconfirmed weapon? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // REGION
        else if (ques.equals("Does your character reside in Mondstadt? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(liyue);
            characters.removeAll(inazuma);
            characters.removeAll(snezhnaya);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Liyue? (Y/N/IDK)");
            questions.remove("Does your character reside in Inazuma? (Y/N/IDK)");
            questions.remove("Does your character reside in Snezhnaya? (Y/N/IDK)");
            questions.remove("Is your character regionless or have an unconfirmed region? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(mondstadt);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character reside in Mondstadt? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character reside in Liyue? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(inazuma);
            characters.removeAll(snezhnaya);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Mondstadt? (Y/N/IDK)");
            questions.remove("Does your character reside in Inazuma? (Y/N/IDK)");
            questions.remove("Does your character reside in Snezhnaya? (Y/N/IDK)");
            questions.remove("Is your character regionless or have an unconfirmed region? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(liyue);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character reside in Liyue? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character reside in Inazuma? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(liyue);
            characters.removeAll(snezhnaya);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Mondstadt? (Y/N/IDK)");
            questions.remove("Does your character reside in Liyue? (Y/N/IDK)");
            questions.remove("Does your character reside in Snezhnaya? (Y/N/IDK)");
            questions.remove("Is your character regionless or have an unconfirmed region? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(inazuma);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character reside in Inazuma? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character reside in Snezhnaya? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(liyue);
            characters.removeAll(inazuma);
            characters.removeAll(regionlessUnknown);
            questions.remove("Does your character reside in Mondstadt? (Y/N/IDK)");
            questions.remove("Does your character reside in Liyue? (Y/N/IDK)");
            questions.remove("Does your character reside in Inazuma? (Y/N/IDK)");
            questions.remove("Is your character regionless or have an unconfirmed region? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(snezhnaya);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character reside in Snezhnaya? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character regionless or have an unconfirmed region? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(mondstadt);
            characters.removeAll(liyue);
            characters.removeAll(inazuma);
            characters.removeAll(snezhnaya);
            questions.remove("Does your character reside in Mondstadt? (Y/N/IDK)");
            questions.remove("Does your character reside in Liyue? (Y/N/IDK)");
            questions.remove("Does your character reside in Inazuma? (Y/N/IDK)");
            questions.remove("Does your character reside in Snezhnaya? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(regionlessUnknown);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character regionless or have an unconfirmed region? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // EYE COLOR
        else if (ques.equals("Does your character have red eyes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have yellow or orange eyes? (Y/N/IDK)");
            questions.remove("Does your character have green eyes? (Y/N/IDK)");
            questions.remove("Does your character have blue eyes? (Y/N/IDK)");
            questions.remove("Does your character have purple eyes? (Y/N/IDK)");
            questions.remove("Does your character have pink eyes? (Y/N/IDK)");
            questions.remove("Does your character have brown eyes? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(redEyes);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have red eyes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have yellow or orange eyes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes? (Y/N/IDK)");
            questions.remove("Does your character have green eyes? (Y/N/IDK)");
            questions.remove("Does your character have blue eyes? (Y/N/IDK)");
            questions.remove("Does your character have purple eyes? (Y/N/IDK)");
            questions.remove("Does your character have pink eyes? (Y/N/IDK)");
            questions.remove("Does your character have brown eyes? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(yellowOrangeEyes);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have yellow or orange eyes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have green eyes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes? (Y/N/IDK)");
            questions.remove("Does your character have yellow or orange eyes? (Y/N/IDK)");
            questions.remove("Does your character have blue eyes? (Y/N/IDK)");
            questions.remove("Does your character have purple eyes? (Y/N/IDK)");
            questions.remove("Does your character have pink eyes? (Y/N/IDK)");
            questions.remove("Does your character have brown eyes? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(greenEyes);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have green eyes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have blue eyes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes? (Y/N/IDK)");
            questions.remove("Does your character have yellow or orange eyes? (Y/N/IDK)");
            questions.remove("Does your character have green eyes? (Y/N/IDK)");
            questions.remove("Does your character have purple eyes? (Y/N/IDK)");
            questions.remove("Does your character have pink eyes? (Y/N/IDK)");
            questions.remove("Does your character have brown eyes? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(blueEyes);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have blue eyes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have purple eyes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(pinkEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes? (Y/N/IDK)");
            questions.remove("Does your character have yellow or orange eyes? (Y/N/IDK)");
            questions.remove("Does your character have green eyes? (Y/N/IDK)");
            questions.remove("Does your character have blue eyes? (Y/N/IDK)");
            questions.remove("Does your character have pink eyes? (Y/N/IDK)");
            questions.remove("Does your character have brown eyes? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(purpleEyes);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have purple eyes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have pink eyes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(brownEyes);
            questions.remove("Does your character have red eyes? (Y/N/IDK)");
            questions.remove("Does your character have yellow or orange eyes? (Y/N/IDK)");
            questions.remove("Does your character have green eyes? (Y/N/IDK)");
            questions.remove("Does your character have blue eyes? (Y/N/IDK)");
            questions.remove("Does your character have purple eyes? (Y/N/IDK)");
            questions.remove("Does your character have brown eyes? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(pinkEyes);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have pink eyes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Does your character have brown eyes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(redEyes);
            characters.removeAll(yellowOrangeEyes);
            characters.removeAll(greenEyes);
            characters.removeAll(blueEyes);
            characters.removeAll(purpleEyes);
            characters.removeAll(pinkEyes);
            questions.remove("Does your character have red eyes? (Y/N/IDK)");
            questions.remove("Does your character have yellow or orange eyes? (Y/N/IDK)");
            questions.remove("Does your character have green eyes? (Y/N/IDK)");
            questions.remove("Does your character have blue eyes? (Y/N/IDK)");
            questions.remove("Does your character have purple eyes? (Y/N/IDK)");
            questions.remove("Does your character have pink eyes? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(brownEyes);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have brown eyes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // HEIGHT
        else if (ques.equals("Is your character short? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);

          if (answer.equals("y")) {
            characters.removeAll(averageH);
            characters.removeAll(tallH);
            questions.remove("Is your character average height? (Y/N/IDK)");
            questions.remove("Is your character tall? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(shortH);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character short? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character average height? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(shortH);
            characters.removeAll(tallH);
            questions.remove("Is your character short? (Y/N/IDK)");
            questions.remove("Is your character tall? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(averageH);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character average height? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character tall? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(shortH);
            characters.removeAll(averageH);
            questions.remove("Is your character short? (Y/N/IDK)");
            questions.remove("Is your character average height? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(tallH);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character tall? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // PHYSICAL NON-HUMAN TRAITS
        else if (ques.equals("Does your character have physical non-human traits? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(noTraits);
          }
          else if (answer.equals("n")) {
            characters.removeAll(yesTraits);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have physical non-human traits? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // PET/COMPANION
        else if (ques.equals("Does your character have a pet or companion? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(noCompanion);
          }
          else if (answer.equals("n")) {
            characters.removeAll(yesCompanion);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have a pet or companion? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // AFFILIATION
        else if (ques.equals("Is your character part of the Knights of Favonius? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(knightsOfFavonius);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character part of the Adventurer's Guild? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(adventurersGuild);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character part of the Qixing? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(qixing);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character an Adeptus? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            characters.add("Ganyu");
            characters.add("Zhongli");
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(adepti);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character an Archon? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(archons);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character an Archon? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character part of the Yashiro Commission? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(yashiroCommission);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(harbingers);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(watatsumiIsland);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character a Harbinger? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(noAffiliation);
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(harbingers);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character unaffiliated? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(knightsOfFavonius);
            characters.removeAll(adventurersGuild);
            characters.removeAll(qixing);
            characters.removeAll(adepti);
            characters.removeAll(archons);
            characters.removeAll(yashiroCommission);
            characters.removeAll(watatsumiIsland);
            characters.removeAll(harbingers);
            questions.remove("Is your character part of the Knights of Favonius? (Y/N/IDK)");
            questions.remove("Is your character part of the Adventurer's Guild? (Y/N/IDK)");
            questions.remove("Is your character part of the Qixing? (Y/N/IDK)");
            questions.remove("Is your character an Adeptus? (Y/N/IDK)");
            questions.remove("Is your character an Archon? (Y/N/IDK)");
            questions.remove("Is your character part of the Yashiro Commission? (Y/N/IDK)");
            questions.remove("Is your character an inhabitant of Watatsumi Island? (Y/N/IDK)");
            questions.remove("Is your character a Harbinger? (Y/N/IDK)");
          }
          else if (answer.equals("n")) {
            characters.removeAll(noAffiliation);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character unaffiliated? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // PLAYABLE
        else if (ques.equals("Is your character playable? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(notPlayable);
          }
          else if (answer.equals("n")) {
            characters.removeAll(playable);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character playable? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // KHANREI'AH
        else if (ques.equals("Is your character from Khanrei'ah? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(notFromKhanreiah);
          }
          else if (answer.equals("n")) {
            characters.removeAll(fromKhanreiah);
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character from Khanrei'ah? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // SIBLINGS
        else if (ques.equals("Does your character have siblings? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(noSiblings);
          }
          else if (answer.equals("n")) {
            characters.removeAll(yesSiblings);
          }
          else if (answer.equals("idk")) {
            questions.remove("Does your character have siblings? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // CONSTELLATIONS
        else if (ques.equals("Is your character's constellation Viator? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Aether");
          }
          else if (answer.equals("n")) {
            characters.remove("Aether");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Viator? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Viatrix? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Lumine");
          }
          else if (answer.equals("n")) {
            characters.remove("Lumine");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Viatrix? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Princeps Cretaceus? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Albedo");
          }
          else if (answer.equals("n")) {
            characters.remove("Albedo");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Princeps Cretaceus? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Nora Fortis? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Aloy");
          }
          else if (answer.equals("n")) {
            characters.remove("Aloy");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Nora Fortis? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Lepus? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Amber");
          }
          else if (answer.equals("n")) {
            characters.remove("Amber");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Lepus? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Taurus Iracundus? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Arataki Itto");
          }
          else if (answer.equals("n")) {
            characters.remove("Arataki Itto");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Taurus Iracundus? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Crater? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Barbara");
          }
          else if (answer.equals("n")) {
            characters.remove("Barbara");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Crater? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Victor Mare? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Beidou");
          }
          else if (answer.equals("n")) {
            characters.remove("Beidou");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Victor Mare? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Rota Calamitas? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Bennett");
          }
          else if (answer.equals("n")) {
            characters.remove("Bennett");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Rota Calamitas? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Nubis Caesor? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Chongyun");
          }
          else if (answer.equals("n")) {
            characters.remove("Chongyun");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Nubis Caesor? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Noctua? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Diluc");
          }
          else if (answer.equals("n")) {
            characters.remove("Diluc");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Noctua? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Feles? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Diona");
          }
          else if (answer.equals("n")) {
            characters.remove("Diona");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Feles? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Aphros Delos? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Eula");
          }
          else if (answer.equals("n")) {
            characters.remove("Eula");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Aphros Delos? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Corvus? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Fischl");
          }
          else if (answer.equals("n")) {
            characters.remove("Fischl");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Corvus? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Sinae Unicornis? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Ganyu");
          }
          else if (answer.equals("n")) {
            characters.remove("Ganyu");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Sinae Unicornis? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Canis Bellatoris? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Gorou");
          }
          else if (answer.equals("n")) {
            characters.remove("Gorou");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Canis Bellatoris? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Papilio Charontis? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Hu Tao");
          }
          else if (answer.equals("n")) {
            characters.remove("Hu Tao");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Papilio Charontis? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Leo Minor? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Jean");
          }
          else if (answer.equals("n")) {
            characters.remove("Jean");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Leo Minor? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Acer Palmatum? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Kaedehara Kazuha");
          }
          else if (answer.equals("n")) {
            characters.remove("Kaedehara Kazuha");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Acer Palmatum? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Pavo Ocellus? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Kaeya");
          }
          else if (answer.equals("n")) {
            characters.remove("Kaeya");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Pavo Ocellus? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Grus Nivis? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Kamisato Ayaka");
          }
          else if (answer.equals("n")) {
            characters.remove("Kamisato Ayaka");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Grus Nivis? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Trulla Cementarii? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Keqing");
          }
          else if (answer.equals("n")) {
            characters.remove("Keqing");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Trulla Cementarii? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Trifolium? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Klee");
          }
          else if (answer.equals("n")) {
            characters.remove("Klee");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Trifolium? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Flabellum? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Kujou Sara");
          }
          else if (answer.equals("n")) {
            characters.remove("Kujou Sara");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Flabellum? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Tempus Fugit? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Lisa");
          }
          else if (answer.equals("n")) {
            characters.remove("Lisa");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Tempus Fugit? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Astrolabos? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Mona");
          }
          else if (answer.equals("n")) {
            characters.remove("Mona");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Astrolabos? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Opus Aequilibrium? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Ningguang");
          }
          else if (answer.equals("n")) {
            characters.remove("Ningguang");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Opus Aequilibrium? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Parma Cordis? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Noelle");
          }
          else if (answer.equals("n")) {
            characters.remove("Noelle");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Parma Cordis? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Pristina Nola? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Qiqi");
          }
          else if (answer.equals("n")) {
            characters.remove("Qiqi");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Pristina Nola? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Imperatrix Umbrosa? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Raiden Shogun");
          }
          else if (answer.equals("n")) {
            characters.remove("Raiden Shogun");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Imperatrix Umbrosa? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Lupus Minor? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Razor");
          }
          else if (answer.equals("n")) {
            characters.remove("Razor");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Lupus Minor? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Spinea Corona? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Rosaria");
          }
          else if (answer.equals("n")) {
            characters.remove("Rosaria");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Spinea Corona? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Dracaena Somnolenta? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Sangonomiya Kokomi");
          }
          else if (answer.equals("n")) {
            characters.remove("Sangonomiya Kokomi");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Dracaena Somnolenta? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Nyctereutes Minor? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Sayu");
          }
          else if (answer.equals("n")) {
            characters.remove("Sayu");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Nyctereutes Minor? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Crista Doloris? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Shenhe");
          }
          else if (answer.equals("n")) {
            characters.remove("Shenhe");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Crista Doloris? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Ampulla? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Sucrose");
          }
          else if (answer.equals("n")) {
            characters.remove("Sucrose");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Ampulla? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Monoceros Caeli? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Tartaglia");
          }
          else if (answer.equals("n")) {
            characters.remove("Tartaglia");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Monoceros Caeli? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Rubeum Scutum? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Thoma");
          }
          else if (answer.equals("n")) {
            characters.remove("Thoma");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Rubeum Scutum? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Carmen Dei? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Venti");
          }
          else if (answer.equals("n")) {
            characters.remove("Venti");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Carmen Dei? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Trulla? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Xiangling");
          }
          else if (answer.equals("n")) {
            characters.remove("Xiangling");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Trulla? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Alatus Nemeseos? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Xiao");
          }
          else if (answer.equals("n")) {
            characters.remove("Xiao");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Alatus Nemeseos? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Fabulae Textile? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Xingqiu");
          }
          else if (answer.equals("n")) {
            characters.remove("Xingqiu");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Fabulae Textile? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Fila Ignium? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Xinyan");
          }
          else if (answer.equals("n")) {
            characters.remove("Xinyan");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Fila Ignium? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Divina Vulpes? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Yae Miko");
          }
          else if (answer.equals("n")) {
            characters.remove("Yae Miko");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Divina Vulpes? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Bestia Iustitia? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Yanfei");
          }
          else if (answer.equals("n")) {
            characters.remove("Yanfei");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Bestia Iustitia? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Carassius Auratus? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Yoimiya");
          }
          else if (answer.equals("n")) {
            characters.remove("Yoimiya");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Carassius Auratus? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Opera Grandis? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Yun Jin");
          }
          else if (answer.equals("n")) {
            characters.remove("Yun Jin");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Opera Grandis? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character's constellation Lapis Dei? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Zhongli");
          }
          else if (answer.equals("n")) {
            characters.remove("Zhongli");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character's constellation Lapis Dei? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        // SPECIFIC RANDOM
        else if (ques.equals("Is your character emergency food? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Paimon");
          }
          else if (answer.equals("n")) {
            characters.remove("Paimon");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character emergency food? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character the Spindrift Knight? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Eula");
          }
          else if (answer.equals("n")) {
            characters.remove("Eula");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character the Spindrift Knight? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        else if (ques.equals("Is your character best friends with Dodoco? (Y/N/IDK)")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("Klee");
          }
          else if (answer.equals("n")) {
            characters.remove("Klee");
          }
          else if (answer.equals("idk")) {
            questions.remove("Is your character best friends with Dodoco? (Y/N/IDK)");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }

        /**
        else if (ques.equals("abcde")) {
          answer = in.nextLine().toLowerCase();
          questions.remove(q);
          if (answer.equals("y")) {
            characters.removeAll(characters);
            characters.add("zxcvbnm");
          }
          else if (answer.equals("n")) {
            characters.remove("zxcvbnm");
          }
          else if (answer.equals("idk")) {
            questions.remove("abcde");
          }
          else {
            wait(1);
            System.out.println();
            System.out.println("Input a valid response: (Y/N/IDK)");
            answer = in.nextLine().toLowerCase();
          }
        }
        **/

        wait(1);
        System.out.println();
      }
    }
    else if (answer.equals("n")) {
      wait(1);
      System.out.println("Come back when you're ready then.");
      return;
    }
    if (characters.size() <= 0) {
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
      answer = in.nextLine().toLowerCase();
      if (answer.equals("y")) {
        wait(1);
        System.out.println();
        System.out.println("Yay, I guessed it! Thank you for playing AkiSim!");
      }
      else if (answer.equals("n")) {
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
