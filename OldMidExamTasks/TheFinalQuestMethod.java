package ExamsTasks;

import java.util.*;
import java.util.stream.Collectors;

public class TheFinalQuestMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArray = scanner.nextLine().split( "\\s+" );
        List<String> words = new ArrayList<>( Arrays.asList( wordsArray ));

        String command = scanner.next();
        while (!command.equals( "Stop" )) {
            switch (command) {
                case "Delete": {
                    int index = scanner.nextInt();
                    delete( words , index );
                    break;
                }
                case "Swap": {
                    String word1 = scanner.next();
                    String word2 = scanner.next();
                    swap( words , word1 , word2 );
                    break;
                }
                case "Put": {
                    String word = scanner.next();
                    int index = scanner.nextInt();
                    put( words , word , index );
                    break;
                }
                case "Sort": {
                    sort( words );
                    break;
                }
                case "Replace": {
                    String word1 = scanner.next();
                    String word2 = scanner.next();
                    replace( words , word1 , word2 );
                    break;
                }
            }
            command = scanner.next();
        }

        System.out.println( String.join( " " , words ) );
    }

    private static boolean isValidIndex(List<String> words , int index) {
        return 0 <= index && index < words.size();
    }

    private static void replace(List<String> words , String word1 , String word2) {
        int index =words.indexOf( word2 );

        if (isValidIndex( words,index )){
            words.set( index,word1 );
        }
    }

    private static void sort(List<String> words) {
        Collections.sort( words );
        Collections.reverse( words );
    }

    private static void put(List<String> words , String word , int index) {
        if (isValidIndex( words , index - 1 ) || index - 1 == words.size()) {
            words.add( index - 1 , word );
        }
    }
    private static void swap(List<String> words , String word1 , String word2) {
        int word1Index = words.indexOf( word1 );
        int word2Index = words.indexOf( word2 );
        if (isValidIndex( words ,word1Index) && isValidIndex( words , word2Index ) ) {
            words.set( word1Index , word2 );
            words.set( word2Index , word1 );
        }
    }

    private static void delete(List<String> words , int index) {
        if (isValidIndex( words , index + 1 )) {
            words.remove( index + 1 );
        }
    }
}
