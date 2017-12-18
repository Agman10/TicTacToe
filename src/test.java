public class test {

    public static String[] board = {"     1     2     3   ",
            "  -------------------",
            "  |     |     |     |",
            "A |     |     |     |",
            "  |     |     |     |",
            "  -------------------",
            "  |     |     |     |",
            "B |     |     |     |",
            "  |     |     |     |",
            "  -------------------",
            "  |     |     |     |",
            "C |     |     |     |",
            "  |     |     |     |",
            "  -------------------"};



    public static void main(String[] args) throws InterruptedException {
        //börja med variabler
        char[] ruta = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
        /*String[] board = {"     1     2     3   ",
                "  -------------------",
                "  |     |     |     |",
                "A |     |     |     |",
                "  |     |     |     |",
                "  -------------------",
                "  |     |     |     |",
                "B |     |     |     |",
                "  |     |     |     |",
                "  -------------------",
                "  |     |     |     |",
                "C |     |     |     |",
                "  |     |     |     |",
                "  -------------------"};*/
                boolean p1wins = false;
                boolean p2wind = false;
                boolean draw = false;
                // omvandla input till en kordinat
        //kolla ifall rutan är tom om rutan inte är tom så får man försöka igen
        //om rutan är tom så lägger du in tecknet i rutan man dem tidigare teckenan är kvar




        render();

//charAt(0) - "A"
    }



    public static void render() {

        // Clear console by writing spaces
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        // Render out the board array
        for(int i = 0; i < board.length; i++){
            System.out.println(board[i]);
        }

    }
}
