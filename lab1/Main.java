public class Main {
    public static void main(String[] args) {
        short[] c=new short[15];
        int k=0;
        for(short b=6;b<=20;b++){
            c[k]=b;
            k++;
        }
        double[] x=new double[11];
        double min=-2.0;
        double max=14.0;
        for (int i=0; i<x.length;i++){
            x[i]=Math.random()*(max-min)+min;
        }
        double[][] a=new double[15][11];
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                if (c[i]==17){
                    a[i][j]=Math.exp(Math.pow(Math.sin(x[j])/2,2*x[j]));
                }
                else if(c[i]>=11 & c[i]<=20 & c[i]!=13 & c[i]!=17 & c[i]!=18){
                    a[i][j]=Math.pow(Math.pow(Math.PI/Math.asin(1/Math.exp(Math.abs(x[j]))),Math.tan(x[j])),0.5+Math.log(Math.abs(x[j])));
                }
                else{
                    a[i][j]=Math.pow((double) 1 /3/((Math.pow(Math.pow(Math.exp((double) 1 /3/x[j]),2),(Math.cos(Math.sin(x[j]))-1)/4))- (double) 3 /4),Math.log(Math.abs(Math.sin(x[j]))));
                }
            }
        }
        for(int i=0; i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%15.5e", a[i][j]);
            }
            System.out.println();
        }
    }
}