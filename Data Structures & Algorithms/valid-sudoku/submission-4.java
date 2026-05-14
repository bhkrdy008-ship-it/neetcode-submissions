class Solution {
    public boolean isValidSudoku(char[][] board) {
        int length = board.length;

        List<Integer> rowVal = new ArrayList<>();
        List<Integer> columnVal = new ArrayList<>();
        boolean isSoduku = false;
        for(int row =0; row<length; row++){
            Map<Character, Integer> check = new HashMap<>();
            for(int column = 0; column< length; column++){
                if (board[row][column] != '.'){
                    check.put(board[row][column], check.getOrDefault(board[row][column],0)+1);
                }
            }
            Collection<Integer> values = check.values();
            List<Integer> list = new ArrayList<>(values);

            for(int i =0; i< list.size(); i++){
                if(list.get(i)>1){
                    return false;
                }
            }
        }

        for(int row =0; row<length; row++){
            Map<Character, Integer> colCheck = new HashMap<>();
            for(int column = 0; column< length; column++){
                if(board[column][row] != '.'){
                    colCheck.put(board[column][row], colCheck.getOrDefault(board[column][row],0)+1);
                }
            }
            Collection<Integer> values = colCheck.values();
            List<Integer> list = new ArrayList<>(values);

            for(int i =0; i< list.size(); i++){
                if(list.get(i)>1){
                    return false;
                }
            }
        }

for (int boxRow = 0; boxRow < 9; boxRow += 3) {
    for (int boxCol = 0; boxCol < 9; boxCol += 3) {

        Map<Character, Integer> map = new HashMap<>();

        for (int r = boxRow; r < boxRow + 3; r++) {
            for (int c = boxCol; c < boxCol + 3; c++) {
                char ch = board[r][c];
                if (ch != '.') {
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
                }
            }
        }

        for (int v : map.values()) {
            if (v > 1) return false;
        }
    }
}
        




        return true;

    }

}
