import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt(); 

        List<String> outcomes = new ArrayList<>();

        while (testCases-- > 0) {
            int numCows = input.nextInt(); 
            int numRounds = input.nextInt(); 

            List<List<Integer>> cowDecks = new ArrayList<>();
            for (int i = 0; i < numCows; i++) {
                List<Integer> deck = new ArrayList<>();
                for (int j = 0; j < numRounds; j++) {
                    deck.add(input.nextInt());
                }
                deck.sort(null); 
                cowDecks.add(deck);
            }

            List<int[]> cardOrder = new ArrayList<>();
            for (int i = 0; i < numCows; i++) {
                cardOrder.add(new int[]{cowDecks.get(i).get(0), i});
            }
            cardOrder.sort(Comparator.comparingInt(a -> a[0])); 

            List<Integer> playOrder = new ArrayList<>();
            for (int[] entry : cardOrder) {
                playOrder.add(entry[1] + 1);
            }

            boolean gamePossible = true;
            int currentTopCard = -1;

            for (int round = 0; round < numRounds; round++) {
                for (int cow : playOrder) {
                    int cowIdx = cow - 1; 
                    if (!cowDecks.get(cowIdx).isEmpty() && cowDecks.get(cowIdx).get(0) > currentTopCard) {
                        currentTopCard = cowDecks.get(cowIdx).remove(0); // Play the card
                    } else {
                        gamePossible = false; 
                        break;
                    }
                }
                if (!gamePossible) {
                    break;
                }
            }

            if (gamePossible) {
                StringBuilder result = new StringBuilder();
                for (int cow : playOrder) {
                    result.append(cow).append(" ");
                }
                outcomes.add(result.toString().trim());
            } else {
                outcomes.add("-1");
            }
        }

        // Output results
        for (String outcome : outcomes) {
            System.out.println(outcome);
        }
    }
}
