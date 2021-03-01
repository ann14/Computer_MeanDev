package com.company;

public class Normal {
    private double mean;
    private double dev;

    public Normal(double m,double s){
        this.mean=m;
        this.dev=s;
    }


    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getDev() {
        return dev;
    }

    public void setDev(double dev) {
        this.dev = dev;
    }
    public double generate() {
        double r = (int)(Math.random()*100)+1;

        return r;

    }
    public double[] generate(int num){
        double r[]=new double[num];

        for(int i=0;i<num;i++){
            r[i]=(int)(Math.random()*100)+1;
        }

        return r;

    }
    public void computeMeanDev(double x[]){

        int total1=0;
        int total2=0;
        int count=0;

        for(int i=0;i<x.length;i++){

            total1 +=x[i];
            count++;

        }
        double m=total1/count;

        for(int i=0;i<x.length;i++){
            total2+=Math.pow((x[i]-m),2);

        }
        double d=total2/count;
        d=Math.pow(d,1/2);

        setDev(d);
        setMean(m);
    }
    public String toString(){


        return "Mean: "+getMean()+"\nDev: "+getDev();
    }


}
