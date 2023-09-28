/*
music playlist
- song title, music (audio files), album cover, song length/duration
- data type: string, integer
pokedex
- pokemon names, images, id, type, hp
- data type: string, int, double (hp)
youtube trending videos
- thumbnail image, name, views, comment/likes, hyperlink
- string, int, int, string
stats on nba players (scores)
- total pts season, steals, rebounds, name, team
- int, int, int, string, string
search history on web browser
- hyperlink, date/time (int/int/int, int/int/int)
- string, ints
 */
public class Pokedex {
    public static void main(String[] args) {
//        pokedex
//                - pokemon names, images, id, type, hp
//                - data type: string, int, double (hp)

        // option 1: 2 dimensional array of string
        String[][] pokedex = {
                // name, id, hp, type
                {"Pikachu", "1", "140.5", "electric"}, // pokemon1
                {"Charizard", "2", "280.9", "fire"}, // pokemon2
                {"Snorlax", "3", "500.0", "normal"}, // pokemon3
        };


        // print info about charizard...
        // print all Strings in row 2
        // printCharizard(pokedex);
        // printSecondRowOf2DArrayOfStrings(pokedex);
        // printRowOf2DArrayOfStrings(pokedex, 1);

//        String charizardInfo = getPokemonInfo(pokedex, 1);
//        System.out.println(charizardInfo);

        // System.out.println(getPokemonInfo(pokedex, 1));
        // System.out.println(getPokemonInfoByName(pokedex, "Charizard"));

        System.out.println(getPokemonInfoById(pokedex, "2"));

        // simple: print charizard method
        // input: String[][] - the array...
        // output: void - maybe nothing (print from within method), String
        // name: printCharizard

        // option 2: parallel arrays, using "correct" data types
        String[] pokemonNames = {"Pikachu", "Charizard", "Snorlax"};
        int[] pokemonIds = {1, 2, 3};
        double[] pokemonHps = {140.5, 280.9, 500.0};
        String[] pokemonTypes = {"electric", "fire", "normal"};

        // print all info about charizard
        // print all info across 4 variables, on index 1

        System.out.println("############ SECOND APPROACH ##############");
        printCharizard2(pokemonNames, pokemonIds, pokemonHps, pokemonTypes);

        System.out.println("What's the average health of all my pokemon???");
        // System.out.println(avg(pokemonHps));
        System.out.println(getAverageOfMyPokemon(pokemonHps));
    }

    static double getAverageOfMyPokemon(double[] pokemonHps) {
        return avg(pokemonHps);
    }

    // getAverageOfMyPokemon
    static double avg(double[] nums) {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total/nums.length;
    }
    static void printCharizard2(String[] names, int[] ids, double[] hps, String[] types) {
        System.out.println(names[1]);
        System.out.println(ids[1]);
        System.out.println(hps[1]);
        System.out.println(types[1]);
    }

    static String getPokemonInfoById(String[][] pokedex, String id) {
        /*
        Algorithm... search all the pokemon names in my 2D array
        if it's found...
        build a string that has the name, id, hp, type
        send that back...
         */

        for (int i = 0; i < pokedex.length; i++) {
            // loop through all rows of pokedex
            // name is saved in first column or index 0
            if (id.equals(pokedex[i][1])) { // this is similar to name == pokedex[i][0]
                // found the pokemon!
                return getPokemonInfo(pokedex, i);
            }
        }
        return "Pokemon not found";
    }
    static String getPokemonInfoByName(String[][] pokedex, String name) {
        /*
        Algorithm... search all the pokemon names in my 2D array
        if it's found...
        build a string that has the name, id, hp, type
        send that back...
         */

        for (int i = 0; i < pokedex.length; i++) {
            // loop through all rows of pokedex
            // name is saved in first column or index 0
            if (name.equals(pokedex[i][0])) { // this is similar to name == pokedex[i][0]
                // found the pokemon!
                return getPokemonInfo(pokedex, i);
            }
        }
        return "Pokemon not found";
    }

    static void printCharizard(String[][] pokemons) {
        System.out.println(pokemons[1][0] + " " + pokemons[1][1] + " ");
        System.out.println(pokemons[1][2] + " " + pokemons[1][3] + " ");
    }

    static void printSecondRowOf2DArrayOfStrings (String[][] arr) {
        // row stays constant (1), columns need to change
        for (int col = 0; col < arr[1].length; col++) {
            System.out.print(arr[1][col] + " ");
        }
    }

    static void printRowOf2DArrayOfStrings (String[][] arr, int row) {
        for (int col = 0; col < arr[row].length; col++) {
            System.out.print(arr[row][col] + " ");
        }
    }

    static String getPokemonInfo(String[][] pokedex, int row) {
        String pokemonInfo = "This pokemon's info: ";
        for (int col = 0; col < pokedex[row].length; col++) {
            pokemonInfo += (pokedex[row][col] + " ");
        }
        return pokemonInfo;
    }

}
