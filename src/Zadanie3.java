public class Zadanie3 {
    public static void main(String[] args) {
        char[][] chessBoard = { {'e','e', 'e', 'e', 'b', 'e', 'e', 'e',},
                                {'e','e', 'e', 'e', 'e', 'e', 'e', 'e',},
                                {'e','e', 'e', 'e', 'e', 'e', 'e', 'e',},
                                {'e','e', 'e', 'e', 'e', 'e', 'e', 'e',},
                                {'e','e', 'e', 'e', 'e', 'e', 'e', 'e',},
                                {'e','e', 'e', 'e', 'e', 'e', 'e', 'e',},
                                {'b','e', 'e', 'e', 'h', 'e', 'e', 'b',},
                                {'e','e', 'e', 'e', 'b', 'e', 'e', 'e',}};


        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
        int dimensionJH = 0;
        int dimensionIH = 0;
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length ; j++) {
                if(chessBoard[i][j]=='h'){
                    dimensionJH = j;
                    dimensionIH = i;
                }
            }
        }

        System.out.println("dimensionIH: "+dimensionIH);
        System.out.println("dimensionJH: "+dimensionJH);

        System.out.println(chessBoard[dimensionIH][dimensionJH]);
        int counter = 0;
    //left
        for (int i = dimensionJH-1; i >= 0; i--) {
            if(chessBoard[dimensionIH][i]=='b'){
                System.out.println("przeciwnik na pozycji: ["+dimensionIH+"]["+i+"]");
                counter++;
            }
        }
    //right
        for (int i = dimensionJH; i <chessBoard.length ; i++) {
            if(chessBoard[dimensionIH][i]=='b'){
                System.out.println("przeciwnik na pozycji: ["+dimensionIH+"]["+i+"]");
                counter++;
            }
        }
    //up
        for (int i = 0; i < dimensionIH; i++) {
            if (chessBoard[i][dimensionJH] == 'b') {
                System.out.println("przeciwnik na pozycji: [" + i + "][" + dimensionJH + "]");
                counter++;
            }
        }
    //down
        for (int i = dimensionIH; i < chessBoard.length; i++) {
            if (chessBoard[i][dimensionJH] == 'b') {
                System.out.println("przeciwnik na pozycji: [" + i + "][" + dimensionJH + "]");
                counter++;
            }
        }
        System.out.println("koń może zbić: "+counter+" figury");


    }
}
