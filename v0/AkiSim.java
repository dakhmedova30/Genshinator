/**
NOTES: Missing...
- Baizhu
- Yaoyao
- Signora
- Dottore
- Scaramouche
- Ayato
- Heizou
- Teucer

NPCs:
- Timmie
- Madame Ping
- Teppei
**/

import java.util.*;

public class AkiSim {

  public static void main(String[] args) {
    ArrayList<String> characters = new ArrayList<>();
    characters.add("Aether");
    characters.add("Albedo");
    characters.add("Aloy");
    characters.add("Amber");
    characters.add("Arataki Itto");
    characters.add("Barbara");
    characters.add("Beidou");
    characters.add("Bennett");
    characters.add("Chongyun");
    characters.add("Dainsleif");
    characters.add("Diluc");
    characters.add("Diona");
    characters.add("Eula");
    characters.add("Fischl");
    characters.add("Ganyu");
    characters.add("Gorou");
    characters.add("Hu Tao");
    characters.add("Jean");
    characters.add("Kaedehara Kazuha");
    characters.add("Kaeya");
    characters.add("Kamisato Ayaka");
    characters.add("Keqing");
    characters.add("Klee");
    characters.add("Kujou Sara");
    characters.add("Lisa");
    characters.add("Lumine");
    characters.add("Mona");
    characters.add("Ningguang");
    characters.add("Noelle");
    characters.add("Paimon");
    characters.add("Qiqi");
    characters.add("Raiden Shogun");
    characters.add("Razor");
    characters.add("Rosaria");
    characters.add("Sangonomiya Kokomi");
    characters.add("Sayu");
    characters.add("Shenhe");
    characters.add("Sucrose");
    characters.add("Tartaglia");
    characters.add("Thoma");
    characters.add("Venti");
    characters.add("Xiangling");
    characters.add("Xiao");
    characters.add("Xingqiu");
    characters.add("Xinyan");
    characters.add("Yae Miko");
    characters.add("Yanfei");
    characters.add("Yoimiya");
    characters.add("Yun Jin");
    characters.add("Zhongli");

    String answer = "";

    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to the Mihoyo-flavored Aki Simulator! Have you thought of a Genshin Impact character? (Y/N)");
    answer = in.nextLine();

    if (answer.equals("Y") || answer.equals("y")) {
      wait(1);
      System.out.println();
      System.out.println("Great! Let's get started.");

      while(characters.size() != 1) {
        wait(1);
        System.out.println();
        System.out.println("Is your character female? (Y/N)");
        answer = in.nextLine();
        // female characters
        if (answer.equals("Y") || answer.equals("y")) {
          characters.remove("Aether");
          characters.remove("Albedo");
          characters.remove("Arataki Itto");
          characters.remove("Bennett");
          characters.remove("Chongyun");
          characters.remove("Dainsleif");
          characters.remove("Diluc");
          characters.remove("Gorou");
          characters.remove("Kaedehara Kazuha");
          characters.remove("Kaeya");
          characters.remove("Razor");
          characters.remove("Tartaglia");
          characters.remove("Thoma");
          characters.remove("Venti");
          characters.remove("Xiao");
          characters.remove("Xingqiu");
          characters.remove("Zhongli");
          wait(1);
          System.out.println();
          System.out.println("Is your character a child? (Y/N)");
          answer = in.nextLine();
          if (answer.equals("Y") || answer.equals("y")) {
            characters.remove("Aloy");
            characters.remove("Amber");
            characters.remove("Barbara");
            characters.remove("Beidou");
            characters.remove("Eula");
            characters.remove("Fischl");
            characters.remove("Ganyu");
            characters.remove("Hu Tao");
            characters.remove("Jean");
            characters.remove("Kamisato Ayaka");
            characters.remove("Keqing");
            characters.remove("Kujou Sara");
            characters.remove("Lisa");
            characters.remove("Lumine");
            characters.remove("Mona");
            characters.remove("Ningguang");
            characters.remove("Noelle");
            characters.remove("Raiden Shogun");
            characters.remove("Rosaria");
            characters.remove("Sangonomiya Kokomi");
            characters.remove("Shenhe");
            characters.remove("Sucrose");
            characters.remove("Xiangling");
            characters.remove("Xinyan");
            characters.remove("Yae Miko");
            characters.remove("Yanfei");
            characters.remove("Yoimiya");
            characters.remove("Yun Jin");
            wait(1);
            System.out.println();
            System.out.println("Is your character a healer? (Y/N)");
            answer = in.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
              characters.remove("Klee");
              characters.remove("Paimon");
              wait(1);
              System.out.println();
              System.out.println("Is your character Cryo? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Sayu");
                wait(1);
                System.out.println();
                System.out.println("Is your character a zombie? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Diona");
                  // DONE - Qiqi
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Qiqi");
                  // DONE - Diona
                }
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Diona");
                characters.remove("Qiqi");
                // DONE - Sayu
              }
            }
            else if (answer.equals("N") || answer.equals("n")) {
              characters.remove("Diona");
              characters.remove("Qiqi");
              characters.remove("Sayu");
              wait(1);
              System.out.println();
              System.out.println("Is your character emergency food? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Klee");
                // DONE - Paimon
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Paimon");
                // DONE - Klee
              }
            }
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.remove("Diona");
            characters.remove("Klee");
            characters.remove("Paimon");
            characters.remove("Qiqi");
            characters.remove("Sayu");
            wait(1);
            System.out.println();
            System.out.println("Is your character blond? (Y/N)");
            answer = in.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
              characters.remove("Aloy");
              characters.remove("Amber");
              characters.remove("Beidou");
              characters.remove("Eula");
              characters.remove("Ganyu");
              characters.remove("Hu Tao");
              characters.remove("Kamisato Ayaka");
              characters.remove("Keqing");
              characters.remove("Kujou Sara");
              characters.remove("Lisa");
              characters.remove("Mona");
              characters.remove("Ningguang");
              characters.remove("Noelle");
              characters.remove("Raiden Shogun");
              characters.remove("Rosaria");
              characters.remove("Sangonomiya Kokomi");
              characters.remove("Shenhe");
              characters.remove("Sucrose");
              characters.remove("Xiangling");
              characters.remove("Xinyan");
              characters.remove("Yae Miko");
              characters.remove("Yanfei");
              characters.remove("Yun Jin");
              wait(1);
              System.out.println();
              System.out.println("Is your character in the Knights of Favonius? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Fischl");
                characters.remove("Yoimiya");
                wait(1);
                System.out.println();
                System.out.println("Is your character known for their singing? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Jean");
                  characters.remove("Lumine");
                  // DONE - Barbara
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Barbara");
                  wait(1);
                  System.out.println();
                  System.out.println("Is your character the Dandelion Knight? (Y/N)");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Lumine");
                    // DONE - Jean
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Jean");
                    // DONE - Lumine
                  }
                }
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Barbara");
                characters.remove("Jean");
                characters.remove("Lumine");
                wait(1);
                System.out.println();
                System.out.println("Is your character known for their fireworks?");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Fischl");
                  // DONE - Yoimiya
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Yoimiya");
                  // DONE - Fischl
                }
              }
            }
            else if (answer.equals("N") || answer.equals("n")) {
              characters.remove("Barbara");
              characters.remove("Fischl");
              characters.remove("Jean");
              characters.remove("Lumine");
              characters.remove("Yoimiya");
              wait(1);
              System.out.println();
              System.out.println("Is your character a Liyue character? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Aloy");
                characters.remove("Amber");
                characters.remove("Eula");
                characters.remove("Kamisato Ayaka");
                characters.remove("Kujou Sara");
                characters.remove("Lisa");
                characters.remove("Mona");
                characters.remove("Noelle");
                characters.remove("Raiden Shogun");
                characters.remove("Rosaria");
                characters.remove("Sangonomiya Kokomi");
                characters.remove("Shenhe");
                characters.remove("Sucrose");
                characters.remove("Yae Miko");
                wait(1);
                System.out.println();
                System.out.println("Is your character part of the Qixing?");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Beidou");
                  characters.remove("Hu Tao");
                  characters.remove("Xiangling");
                  characters.remove("Xinyan");
                  characters.remove("Yanfei");
                  characters.remove("Yun Jin");
                  wait(1);
                  System.out.println();
                  System.out.println("Does your character like Golden Shrimp Balls?");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Ganyu");
                    characters.remove("Ningguang");
                    // DONE - Keqing
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Keqing");
                    wait(1);
                    System.out.println();
                    System.out.println("Is your character the \"cocogoat\"?");
                    answer = in.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                      characters.remove("Ningguang");
                      // DONE - Ganyu
                    }
                    else if (answer.equals("N") || answer.equals("n")) {
                      characters.remove("Ganyu");
                      // DONE - Ningguang
                    }
                  }
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Ganyu");
                  characters.remove("Keqing");
                  characters.remove("Ningguang");
                  wait(1);
                  System.out.println();
                  System.out.println("Does your character wear a hat?");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Beidou");
                    characters.remove("Xiangling");
                    characters.remove("Xinyan");
                    wait(1);
                    System.out.println();
                    System.out.println("Does your character use a polearm?");
                    answer = in.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                      characters.remove("Yanfei");
                      wait(1);
                      System.out.println();
                      System.out.println("Is your character director of a funeral parlor?");
                      answer = in.nextLine();
                      if (answer.equals("Y") || answer.equals("y")) {
                        characters.remove("Yun Jin");
                        // DONE - Hu Tao
                      }
                      else if (answer.equals("N") || answer.equals("n")) {
                        characters.remove("Hu Tao");
                        // DONE - Yun Jin
                      }
                    }
                    else if (answer.equals("N") || answer.equals("n")) {
                      characters.remove("Hu Tao");
                      characters.remove("Yun Jin");
                      // DONE - Yanfei
                    }
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Hu Tao");
                    characters.remove("Yanfei");
                    characters.remove("Yun Jin");
                    wait(1);
                    System.out.println();
                    System.out.println("Is your character notoriously good at cooking?");
                    answer = in.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                      characters.remove("Beidou");
                      characters.remove("Xinyan");
                      // DONE - Xiangling
                    }
                    else if (answer.equals("N") || answer.equals("n")) {
                      characters.remove("Xiangling");
                      wait(1);
                      System.out.println();
                      System.out.println("Is your character captain of a ship?");
                      answer = in.nextLine();
                      if (answer.equals("Y") || answer.equals("y")) {
                        characters.remove("Xinyan");
                        // DONE - Beidou
                      }
                      else if (answer.equals("N") || answer.equals("n")) {
                        characters.remove("Beidou");
                        // DONE - Xinyan
                      }
                    }
                  }
                }
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Beidou");
                characters.remove("Ganyu");
                characters.remove("Hu Tao");
                characters.remove("Keqing");
                characters.remove("Ningguang");
                characters.remove("Xiangling");
                characters.remove("Xinyan");
                characters.remove("Yanfei");
                characters.remove("Yun Jin");
                wait(1);
                System.out.println();
                System.out.println("Does your character use a catalyst? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Aloy");
                  characters.remove("Amber");
                  characters.remove("Eula");
                  characters.remove("Kamisato Ayaka");
                  characters.remove("Kujou Sara");
                  characters.remove("Noelle");
                  characters.remove("Raiden Shogun");
                  characters.remove("Rosaria");
                  characters.remove("Shenhe");
                  wait(1);
                  System.out.println();
                  System.out.println("Does your character have animal ears? (Y/N)");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Lisa");
                    characters.remove("Mona");
                    characters.remove("Sangonomiya Kokomi");
                    wait(1);
                    System.out.println();
                    System.out.println("Does your character own a publishing house? (Y/N)");
                    answer = in.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                      characters.remove("Sucrose");
                      // DONE - Yae Miko
                    }
                    else if (answer.equals("N") || answer.equals("n")) {
                      characters.remove("Yae Miko");
                      // DONE - Sucrose
                    }
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Sucrose");
                    characters.remove("Yae Miko");
                    wait(1);
                    System.out.println();
                    System.out.println("Can your character walk on water? (Y/N)");
                    answer = in.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                      characters.remove("Lisa");
                      wait(1);
                      System.out.println();
                      System.out.println("Does your character have a unique sprint? (Y/N)");
                      answer = in.nextLine();
                      if (answer.equals("Y") || answer.equals("y")) {
                        characters.remove("Sangonomiya Kokomi");
                        // DONE - Mona
                      }
                      else if (answer.equals("N") || answer.equals("n")) {
                        characters.remove("Mona");
                        // DONE - Sangonomiya Kokomi
                      }
                    }
                    else if (answer.equals("N") || answer.equals("n")) {
                      characters.remove("Mona");
                      characters.remove("Sangonomiya Kokomi");
                      // DONE - Lisa
                    }
                  }
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Lisa");
                  characters.remove("Mona");
                  characters.remove("Sangonomiya Kokomi");
                  characters.remove("Sucrose");
                  characters.remove("Yae Miko");
                  wait(1);
                  System.out.println();
                  System.out.println("Does your character use Cryo? (Y/N)");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Amber");
                    characters.remove("Kujou Sara");
                    characters.remove("Noelle");
                    characters.remove("Raiden Shogun");
                    wait(1);
                    System.out.println();
                    System.out.println("Is your character from another world? (Y/N)");
                    answer = in.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                      characters.remove("Eula");
                      characters.remove("Kamisato Ayaka");
                      characters.remove("Rosaria");
                      characters.remove("Shenhe");
                      // DONE - Aloy
                    }
                    else if (answer.equals("N") || answer.equals("n")) {
                      characters.remove("Aloy");
                      wait(1);
                      System.out.println();
                      System.out.println("Does your character ever sus Albedo? (Y/N)");
                      answer = in.nextLine();
                      if (answer.equals("Y") || answer.equals("y")) {
                        characters.remove("Kamisato Ayaka");
                        characters.remove("Shenhe");
                        wait(1);
                        System.out.println();
                        System.out.println("Is your character a descendant of the Lawrence Clan? (Y/N)");
                        answer = in.nextLine();
                        if (answer.equals("Y") || answer.equals("y")) {
                          characters.remove("Rosaria");
                          // DONE - Eula
                        }
                        else if (answer.equals("N") || answer.equals("n")) {
                          characters.remove("Eula");
                          // DONE - Rosaria
                        }
                      }
                      else if (answer.equals("N") || answer.equals("n")) {
                        characters.remove("Eula");
                        characters.remove("Rosaria");
                        wait(1);
                        System.out.println();
                        System.out.println("Does your character know Cloud Retainer? (Y/N)");
                        answer = in.nextLine();
                        if (answer.equals("Y") || answer.equals("y")) {
                          characters.remove("Kamisato Ayaka");
                          // DONE - Shenhe
                        }
                        else if (answer.equals("N") || answer.equals("n")) {
                          characters.remove("Shenhe");
                          // DONE - Kamisato Ayaka
                        }
                      }
                    }
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Aloy");
                    characters.remove("Eula");
                    characters.remove("Kamisato Ayaka");
                    characters.remove("Rosaria");
                    characters.remove("Shenhe");
                    wait(1);
                    System.out.println();
                    System.out.println("Does your character have a pet or companion? (Y/N)");
                    answer = in.nextLine();
                    if (answer.equals("Y") || answer.equals("y")) {
                      characters.remove("Kujou Sara");
                      characters.remove("Noelle");
                      characters.remove("Raiden Shogun");
                      // DONE - Amber
                    }
                    else if (answer.equals("N") || answer.equals("n")) {
                      characters.remove("Amber");
                      wait(1);
                      System.out.println();
                      System.out.println("Is your character an archon? (Y/N)");
                      answer = in.nextLine();
                      if (answer.equals("Y") || answer.equals("y")) {
                        characters.remove("Kujou Sara");
                        characters.remove("Noelle");
                        // DONE - Raiden Shogun
                      }
                      else if (answer.equals("N") || answer.equals("n")) {
                        characters.remove("Raiden Shogun");
                        wait(1);
                        System.out.println();
                        System.out.println("Does your character uphold the Vision Hunt Decree? (Y/N)");
                        answer = in.nextLine();
                        if (answer.equals("Y") || answer.equals("y")) {
                          characters.remove("Noelle");
                          // DONE - Kujou Sara
                        }
                        else if (answer.equals("N") || answer.equals("n")) {
                          characters.remove("Kujou Sara");
                          // DONE - Noelle
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        // male characters
        else if (answer.equals("N") || answer.equals("n")) {
          characters.remove("Aloy");
          characters.remove("Amber");
          characters.remove("Barbara");
          characters.remove("Beidou");
          characters.remove("Diona");
          characters.remove("Eula");
          characters.remove("Fischl");
          characters.remove("Ganyu");
          characters.remove("Hu Tao");
          characters.remove("Jean");
          characters.remove("Kamisato Ayaka");
          characters.remove("Keqing");
          characters.remove("Klee");
          characters.remove("Kujou Sara");
          characters.remove("Lisa");
          characters.remove("Lumine");
          characters.remove("Mona");
          characters.remove("Ningguang");
          characters.remove("Noelle");
          characters.remove("Paimon");
          characters.remove("Qiqi");
          characters.remove("Raiden Shogun");
          characters.remove("Rosaria");
          characters.remove("Sangonomiya Kokomi");
          characters.remove("Sayu");
          characters.remove("Shenhe");
          characters.remove("Sucrose");
          characters.remove("Xiangling");
          characters.remove("Xinyan");
          characters.remove("Yae Miko");
          characters.remove("Yanfei");
          characters.remove("Yoimiya");
          characters.remove("Yun Jin");
          wait(1);
          System.out.println();
          System.out.println("Is your character tall? (Y/N)");
          answer = in.nextLine();
          if (answer.equals("Y") || answer.equals("y")) {
            characters.remove("Aether");
            characters.remove("Albedo");
            characters.remove("Bennett");
            characters.remove("Chongyun");
            characters.remove("Gorou");
            characters.remove("Kaedehara Kazuha");
            characters.remove("Razor");
            characters.remove("Venti");
            characters.remove("Xiao");
            characters.remove("Xingqiu");
            wait(1);
            System.out.println();
            System.out.println("Is your character from Khanrei'ah? (Y/N)");
            answer = in.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
              characters.remove("Arataki Itto");
              characters.remove("Diluc");
              characters.remove("Tartaglia");
              characters.remove("Thoma");
              characters.remove("Zhongli");
              wait(1);
              System.out.println();
              System.out.println("Is your character a Calvalry Captain? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Dainsleif");
                // DONE - Kaeya
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Kaeya");
                // DONE - Dainslief
              }
            }
            else if (answer.equals("N") || answer.equals("n")) {
              characters.remove("Dainsleif");
              characters.remove("Kaeya");
              wait(1);
              System.out.println();
              System.out.println("Does your character show off abs? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Diluc");
                characters.remove("Tartaglia");
                characters.remove("Thoma");
                characters.remove("Zhongli");
                // DONE - Arataki Itto
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Arataki Itto");
                wait(1);
                System.out.println();
                System.out.println("Is your character a malewife? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Diluc");
                  characters.remove("Zhongli");
                  wait(1);
                  System.out.println();
                  System.out.println("Does your character have siblings? (Y/N)");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Thoma");
                    // DONE - Tartaglia
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Tartaglia");
                    // DONE - Thoma
                  }
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Tartaglia");
                  characters.remove("Thoma");
                  wait(1);
                  System.out.println();
                  System.out.println("Does your character drink Osmanthus wine? (Y/N)");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Diluc");
                    // DONE - Zhongli
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Zhongli");
                    // DONE - Diluc
                  }
                }
              }
            }
          }
          else if (answer.equals("N") || answer.equals("n")) {
            characters.remove("Arataki Itto");
            characters.remove("Dainsleif");
            characters.remove("Diluc");
            characters.remove("Kaeya");
            characters.remove("Tartaglia");
            characters.remove("Thoma");
            characters.remove("Zhongli");
            wait(1);
            System.out.println();
            System.out.println("Does your character have the power of Anemo? (Y/N)");
            answer = in.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
              characters.remove("Albedo");
              characters.remove("Bennett");
              characters.remove("Chongyun");
              characters.remove("Gorou");
              characters.remove("Razor");
              characters.remove("Xingqiu");
              wait(1);
              System.out.println();
              System.out.println("Does your character use a sword? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Venti");
                characters.remove("Xiao");
                wait(1);
                System.out.println();
                System.out.println("Is your character the main character? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Kaedehara Kazuha");
                  // DONE - Aether
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Aether");
                  // DONE - Kaedehara Kazuha
                }
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Aether");
                characters.remove("Kaedehara Kazuha");
                wait(1);
                System.out.println();
                System.out.println("Is your character a Yaksha? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Venti");
                  // DONE - Xiao
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Xiao");
                  // DONE - Venti
                }
              }
            }
            else if (answer.equals("N") || answer.equals("n")) {
              characters.remove("Aether");
              characters.remove("Kaedehara Kazuha");
              characters.remove("Venti");
              characters.remove("Xiao");
              wait(1);
              System.out.println();
              System.out.println("Is your character from Mondstadt? (Y/N)");
              answer = in.nextLine();
              if (answer.equals("Y") || answer.equals("y")) {
                characters.remove("Chongyun");
                characters.remove("Gorou");
                characters.remove("Xingqiu");
                wait(1);
                System.out.println();
                System.out.println("Is your character very unlucky? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Albedo");
                  characters.remove("Razor");
                  // DONE - Bennett
                }
                else if(answer.equals("N") || answer.equals("n")) {
                  characters.remove("Bennett");
                  wait(1);
                  System.out.println();
                  System.out.println("Is your character interested in alchemy? (Y/N)");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Razor");
                    // DONE - Albedo
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Albedo");
                    // DONE - Razor
                  }
                }
              }
              else if (answer.equals("N") || answer.equals("n")) {
                characters.remove("Albedo");
                characters.remove("Bennett");
                characters.remove("Razor");
                wait(1);
                System.out.println();
                System.out.println("Does your character have animal ears? (Y/N)");
                answer = in.nextLine();
                if (answer.equals("Y") || answer.equals("y")) {
                  characters.remove("Chongyun");
                  characters.remove("Xingqiu");
                  // DONE - Gorou
                }
                else if (answer.equals("N") || answer.equals("n")) {
                  characters.remove("Gorou");
                  wait(1);
                  System.out.println();
                  System.out.println("Does your character like popsicles? (Y/N)");
                  answer = in.nextLine();
                  if (answer.equals("Y") || answer.equals("y")) {
                    characters.remove("Xingqiu");
                    // DONE - Chongyun
                  }
                  else if (answer.equals("N") || answer.equals("n")) {
                    characters.remove("Chongyun");
                    // DONE - Xingqiu
                  }
                }
              }
            }
          }
        }
      }
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
        System.out.println("Aww, better luck next time... Thank you for playing AkiSim!");
      }
    }
    else if (answer.equals("N") || answer.equals("n")) {
      System.out.println("Come back when you're ready then.");
    }
  }
  public static void wait(int s) {
    try {
      Thread.sleep(s*1000);
    }
    catch (InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
