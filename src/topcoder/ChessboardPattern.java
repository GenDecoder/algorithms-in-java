package topcoder;

public class ChessboardPattern {
    public static void main(String[] args) {
        makeChessboard(8,8);
        convertFEN("123 w");
    }
    /**
     * TopCoder problem # 1
     * */
    private static String[] makeChessboard (int rows, int columns) {
        String[] result = new String[rows];
        boolean isOddRow = rows%2 > 0;
        boolean isOddColumn = columns%2 > 0;
        for (int x = 0; x < rows; x ++) {
            String row = "";
            for (int y = 0; y < columns; y ++) {
                row += isOddRow ? "O" : "X";
                isOddRow = !isOddRow;
            }
            result[x] = row;
            isOddRow = isOddColumn == isOddRow;
        }
        return result;
    }
    /**
     * Own algorithm. Source: https://en.wikipedia.org/wiki/Forsyth%E2%80%93Edwards_Notation
     * */
    private static void convertFEN (String FEN) {
        String[] info = FEN.split(" ");
        String position = info[0];
        boolean whiteToPlay = info[1].equals("w");
        String[] rows = position.split("/");
        for (int i = 0; i < rows.length; i++) {
            int blackSpaces;
            String row = rows[i];

            blackSpaces = Integer.parseInt(row);
        }
    }
}