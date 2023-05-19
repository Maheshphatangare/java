import java.util.*;
class patternheart{
    public static void main(String arg[])
    {
        int n=5;
        for(int i=3;i<=n;i++){
            for(int j=i;j<=n;j++){
            System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("+");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("+");
                    }
                    for(int j=i;j<=n;j++){
                        System.out.print(" ");
                        }
                        for(int j=i;j<n;j++){
                            System.out.print(" ");
                            }
                            for(int j=1;j<=i;j++){
                                System.out.print("+");
                                }
                                for(int j=1;j<=i;j++){
                                    System.out.print("+");
                                    }
            System.out.println();
        }
        int k=11;
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=i;j++){
              System.out.print(" ");  
            }
             for(int j=i;j<=k;j++){
              System.out.print("+");  
            }
            for(int j=i;j<k;j++){
              System.out.print("+");  
            }
        
        System.out.println();}
    }
}
