class Solution {
    public void rotate(int[][] matrix) {
        int lenght=matrix.length;
        int rotatedArray[][]=new int[lenght][lenght];
        for(int i=0;i<lenght;i++){
            for(int j=0;j<lenght;j++){
                rotatedArray[j][lenght-1-i]=matrix[i][j];
            }
        } for (int i = 0; i < lenght; i++) {
            for (int j = 0; j < lenght; j++) {
                matrix[i][j] = rotatedArray[i][j];
            }
        }
    }
}
