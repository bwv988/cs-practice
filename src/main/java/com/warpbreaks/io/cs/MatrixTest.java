// Some tests with matrices in Java.
// Need to disable package for running in Cloud9.


//package com.warpbreaks.io.cs;

import java.util.Random;

// Some tests with matrices.
public class MatrixTest {
    
    public void test1() {
        Matrix mat = new Matrix(3, 3);
        
        mat.initRandom();
        mat.print();
        
        System.out.println("Transposed matrix:");
        
        Matrix matTrans = mat.transpose();
        
        matTrans.print();
        
    }
    
    public static void main(String[] args) {
        MatrixTest obj = new MatrixTest();
        
        obj.test1();
    }

}

class Matrix {
    private static final int MAX_N = 10;
    
    private int matrix[][];
    private int rows;
    private int cols;
    
    Matrix(int r, int c) {
        this.rows = r;
        this.cols = c;
        this.matrix = new int[rows][cols];
        
    }
    
    public int[][] get() {
        return this.matrix;    
    }
    
    public void set(int[][] myMat) {
        this.matrix = myMat;
    }
    
    public void initRandom() {
        Random rng = new Random();
        initMatrix(rng);
    }
    
    public void initRandom(long seed) {
        Random rng = new Random(seed);
        
        initMatrix(rng);
    }
    
    public Matrix transpose() {
        Matrix newMat = new Matrix(this.cols, this.rows);
        // FIXME: This doesn't seem right.
        // Why? It requires internal knowledge about Matrix.
        int[][] nM = newMat.get();
        
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                nM[j][i] = this.matrix[i][j];
            }
        }
        
        return newMat;
    }
    
    // FIXME: There are issues w./ spacing for more than 2 digits.
    public void print() {
        System.out.print(" ");
        
        for(int j = 0; j < this.cols; j++) {
            System.out.print(" " + j);
        }
        
        System.out.println("");
       
        
        for (int i = 0; i < this.rows; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            
            System.out.println("");
        }
    }
    
    private void initMatrix(Random rng) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.matrix[i][j] = rng.nextInt(MAX_N);        
            } 
        }
    }
}