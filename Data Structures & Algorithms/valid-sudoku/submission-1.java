class Solution {
    public boolean isValidSudoku(char[][] board) {
        int N = 9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];
        for(int i=0; i<N;i++){
            rows[i] =new HashSet<Character>();
            rows[i] =new HashSet<Character>();
        }
    }
}
