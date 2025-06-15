class Patterns {
    public static void main(String[] args){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);       
        pattern6(5);
    }
    public static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }  
            System.out.println();     
        }
    }   
    public static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col +" ");
            }  
            System.out.println();     
        }
    } 
    public static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }  
            System.out.println();     
        }
    }
    public static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int s=1;s<=row-1;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }  
            System.out.println();     
        }
    }
    public static void pattern5(int n){
        for(int row=1;row<2*n;row++){
            for(int s=1;s<=Math.abs(n-row);s++){
                System.out.print(" ");
            }
            int colofrow=row>n ? 2*n-row:row;
            for(int col=1;col<=colofrow;col++){
                System.out.print("* ");
            }  
            System.out.println();     
        }
    }
    public static void pattern6(int n){
        for(int row=1;row<2*n;row++){
            for(int s=1;s<=Math.abs(n-row);s++){
                System.out.print(" ");
            }
            int colofrow=row>n ? 2*n-row:row;
            for(int col=colofrow;col>=1;col--){
                System.out.print(col+" ");
            }  
            System.out.println();     
        }
    }
}
