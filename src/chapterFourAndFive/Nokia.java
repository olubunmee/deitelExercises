package chapterFourAndFive;

import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);

        System.out.println("""
                1. Phonebook
                2. Messages
                3. Chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM Services""");
        System.out.println("Select one:");

        int number = input.nextInt();
        switch (number){
            case 1:{
                System.out.println("""
                        1. Search
                        2. Service no.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign Tone
                        7. Send B'day
                        8. Options
                        9. Speed dials
                        10. Voice tags
                        """);
                System.out.println("Select:");
                int numberPhone = input.nextInt();
                switch (numberPhone){
                    case 8:{
                        System.out.println("""
                                1. Type of view
                                2. Memory Status""");
                        break;
                    }
                }
                break;
            }



            case 2:{
                System.out.println("""
                        1. Write Messages
                        2. Inbox
                        3. Outbox
                        4. Picture Messages
                        5. Templates
                        6. Smileys
                        7. Message Settings
                        8. Info Service
                        9. Voice Mailbox Number
                        10. Service command editor
                        """);
                System.out.println("Select:");
                int numberMessage = input.nextInt();
                switch (numberMessage){
                    case 7:{
                        System.out.println("""
                                1. Set
                                2. Common""");
                        System.out.println("Select");
                        int numberSet = input.nextInt();
                        switch (numberSet){
                            case 1:{
                                System.out.println("""
                                        1. Message centre number
                                        2. Message sent as
                                        3. Message Validity
                                        """);
                                break;
                            }
                            case 2:{
                                System.out.println("""
                                        1. Delivery report
                                        2. Reply via same centre
                                        3. Character support
                                        """);
                                break;
                            }
                        }
                        break;
                    }


                    case 8:{
                        System.out.println("Info Service");
                        break;
                    }


                    case 9:{
                        System.out.println("Voice Mailbox Number ");
                        break;
                    }


                    case 10:{
                        System.out.println("Service command");
                        break;
                    }
                }
                break;
            }



            case 3:{
                System.out.println("Chat");
                break;
            }



            case 4:{
                System.out.println("""
                        1. Missed Calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call cost
                        7. Call cost settings 
                        8. Prepaid credit
                        """);
                System.out.println("Select:");
                int numberCallRegister = input.nextInt();
                switch (numberCallRegister){
                    case 5:{
                        System.out.println("""
                                1. Last call duration
                                2. All calls' duration
                                3. Received calls duration
                                4. Dialled calls' duration
                                5. Clear timers
                                """);
                        break;
                    }
                    case 6:{
                        System.out.println("""
                                1. Last call cost
                                2. All calls' cost
                                Clear counters
                                """);
                        break;
                    }
                    case 7:{
                        System.out.println("""
                                1. Call cost limit
                                2. Show costs in
                                """);
                        break;
                    }

                }
                break;
            }



            case 5:{
                System.out.println("""
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning tones and game tones
                        8. Vibrating Alert
                        9. Screen saver
                        """);
                break;
            }



            case 6:{
                System.out.println("""
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                        """);
                System.out.println("Select:");
                int numberCallSettings = input.nextInt();
                switch (numberCallSettings){
                    case 1:{
                        System.out.println("""
                                1. Automatic redial
                                2. Speed diallind
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer""");
                        break;
                    }
                    case 2:{
                        System.out.println("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights
                                6. Confirm SIM service actions""");
                        break;
                    }
                    case 3:{
                        System.out.println("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes""");
                        break;
                    }
                }
                break;
            }



            case 7:{
                System.out.println("Call divert");
                break;
            }



            case 8:{
                System.out.println("Games");
                break;
            }



            case 9:{
                System.out.println("Calculator");
                break;
            }



            case 10:{
                System.out.println("Reminder");
                break;
            }



            case 11:{
                System.out.println("""
                        1. Alarm Clock
                        2. Clock Settings
                        3. Date Settings
                        4. Stop watch
                        5. Countdown timer
                        6. Auto update of date and time
                        """);
                break;
            }



            case 12:{
                System.out.println("Profiles");
                break;
            }



            case 13:{
                System.out.println("SIM Services");
                break;
            }
        }
    }
}
