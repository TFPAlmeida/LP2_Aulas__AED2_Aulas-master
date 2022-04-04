package edu.ufp.inf.lp2.aulas.tp._02_Collections;

public class MatrixInts {

    private final int[][] innerMatrix;

    public MatrixInts(int rowns, int columns) {
        innerMatrix = new int[rowns][columns];
    }

    public MatrixInts matrixAdd(int[][] m) {     //[MatrixInts m] TAVA NOS PARAMETROS MAS ESTAVA A DAR ERRO
        if(sameDims(m)){    //MESMAS DIMENSOES
            for (int i = 0; i < innerMatrix.length; i++) {   //PERCORRER LINHAS
                for (int j = 0; j < innerMatrix[i].length; j++) {     //PERCORRER COLUNAS
                    this.innerMatrix[i][j] += m[i][j];
                }
            }
        }
        return this;
    }

    public boolean sameDims(int[][] m){

        return innerMatrix[0].length == m[0].length && innerMatrix[1].length == m[1].length;
    }

    public void Matrizes() {
        int[][] twoDimArray = new int[4][];          //new int [][4]  ESTOURA
        twoDimArray[0] = new int[1];
        twoDimArray[1] = new int[2];
        twoDimArray[2] = new int[3];
        twoDimArray[3] = new int[4];
    }
}
