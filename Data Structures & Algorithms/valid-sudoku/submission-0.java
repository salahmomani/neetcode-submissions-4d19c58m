class Solution {    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> setH = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (!setH.contains(board[i][j])) {
                    setH.add(board[i][j]);
                } else if (board[i][j] == '.') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            Set<Character> setV = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (!setV.contains(board[j][i])) {
                    setV.add(board[j][i]);
                } else if (board[j][i] == '.') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                Set<Character> setS = new HashSet<>();

                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {

                        if (board[i][j] == '.') continue;

                        if (!setS.contains(board[i][j])) {
                            setS.add(board[i][j]);
                        } else {
                            return false;
                        }

                        setS.add(board[i][j]);
                    }
                }
            }
        }

        return true;
    }
}
