package src;
import java.util.*;

class AutoComplete {

    static ArrayList<String> getRecommended(ArrayList<String> recommended, ArrayList<String> dictionnary, String search) {
        int index = 0;

        // Finding recommended words by going through the dictionnary words.
        for (int i = 0; i < dictionnary.size(); i++) {
            dictionnary.set(i, dictionnary.get(i).toLowerCase()); // Converting to lower-case so that is not case-sensitive.
            index = dictionnary.get(i).indexOf(search); // Check if the user's research is in the dictionnary word.
            if (index == 0 && recommended.size() < 4) { // Add in the recommended words only if it is at the begin or if there isn't 4 recommended words already.
                recommended.add(dictionnary.get(i));
            }
        }
        return recommended;
    }

    public static void main(String[] args) {
        // Declaring the variables
        ArrayList<String> recommended = new ArrayList<String>();
        ArrayList<String> dictionnary = new ArrayList<String>(
            Arrays.asList("Pandora", "Pinterest", "Paypal", "Pg&e", "Project free tv", "Priceline", "Press democrat", "Progressive", "Project runway",
            "Proactive", "Programming", "Progeria", "Progesterone", "Progenex", "Procurable", "Processor", "Proud", "Print", "Prank",
            "Bowl", "Owl", "River", "Phone", "Kayak", "Stamps", "Reprobe")
        );

        // Getting the recommended words from the user research
        recommended = getRecommended(recommended, dictionnary, args[0].toLowerCase());
        if (recommended.size() == 0) { // Check if there is no recommended words
            System.out.println("No recommended words");
            return;
        }
        // Display the recommended words
        System.out.println("Recommended Words :");
        Collections.sort(recommended); // Sort the recommended words.
        for (int j = 0; j < recommended.size(); j++) { // Loop through the recommended words to print them.
            System.out.println("\t" + recommended.get(j));
        }
        return;
    }
}
