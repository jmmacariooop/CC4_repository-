import java.util.Scanner;

public class LabAct1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("TYPICAL DRAWING PROCESS");

            System.out.println("1. Turn on laptop.");
            System.out.println("    >>Is the laptop charged? (yes/no)");
            String isCharged = input.nextLine();

            if (isCharged.equalsIgnoreCase("yes")) {
                System.out.println("2. Connect drawing tablet.");

                if (!checkContinue("3. Check pen configuration.", "    >>Is the pen configuration correct? (yes/no)", input)) {
                    continue;
                }

                System.out.println("4. Open drawing software (Krita).");
                System.out.println("5. Create a blank .kra file.");
                System.out.println("6. Create a new layer.");
                System.out.println("7. Pick the pencil tool.");

                if (!checkContinue("8. Sketch a small thumbnail for the composition of the piece",
                        "    >>Is the thumbnail satisfactory? (yes/no).", input)) {
                    continue;
                }

                if (!checkContinue("9. Go to Pinterest to gather reference photos",
                        "    >>Are the reference photos satisfactory? (yes/no).", input)) {
                    continue;
                }

                if (!checkContinue("10. Finish sketch", "    >>Is the sketch finished? (yes/no).", input)) {
                    continue;
                }

                if (!checkContinue("11. Clean up the sketch", "    >>Is the sketch clean? (yes/no).", input)) {
                    continue;
                }

                if (!checkContinue("12. Start doing the base color",
                        "    >>Is the base color complete? (yes/no).", input)) {
                    continue;
                }

                if (!checkContinue("13. Start rendering the merged layer",
                        "    >>Is the drawing polished enough?(yes/no)", input)) {
                    continue;
                }

                System.out.println("    == Move on to the next step.");
                System.out.println("14. Create a new layer");
                System.out.println("15. Place signature");
                System.out.println("16. Save file as .png and .kra ");
                System.out.println("17. Exit drawing software.");
                break;
            }

            if (isCharged.equalsIgnoreCase("no")) {
                System.out.println("Charge your laptop and wait till its full charged.");
                break;
            }
        }

        input.close();
    }

    private static boolean checkContinue(String action, String prompt, Scanner input) {
        while (true) {
            System.out.println(action);
            System.out.println(prompt);
            String response = input.nextLine();

            if (response.equalsIgnoreCase("yes")) {
                return true;
            } else if (response.equalsIgnoreCase("no")) {
                return false;
            }
        }
    }
}
