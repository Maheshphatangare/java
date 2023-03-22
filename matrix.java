import java.util.*;
import java.util.Scanner;
class matrix
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the rows of matrix");
        int mrow= sc.nextInt();
        System.out.println("enter the col of matrix");
        int mcol= sc.nextInt();
        int matrix1[][]=new int[mrow] [mcol];
        int matrix2[][]=new int[mrow] [mcol];
        int matrixr[][]=new int[mrow] [mcol];
        System.out.println("enter the element  of matrix");
        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<mcol;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("the element  of matrix");
        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<mcol;j++)
            {
                System.out.print(" "+ matrix1[i][j] +"\t");
            }
            System.out.println();
        }
       
        System.out.println("enter the element  of matrix2");
        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<mcol;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("the element  of matrix2");
        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<mcol;j++)
            {
                System.out.print(" "+ matrix2[i][j] +"\t");
            }
            System.out.println();
        }

        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<mcol;j++)
            {
                matrixr[i][j]= matrix1[i][j] - matrix2[i][j];
            }
    }

    System.out.println("the element  of matrixresult");
        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<mcol;j++)
            {
                System.out.print(" "+ matrixr[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
