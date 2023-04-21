package qn3;

public abstract class Metal implements Conductive, Resistive {
    private double weight=1;
    Metal(){

    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


class Copper extends Metal {


    @Override
    public double getConductivity() {
        return 6.0*Math.pow(10,7);
    }

    @Override
    public double getResistivity() {
        return 1.7*Math.pow(10,-8);
    }
    @Override
    public String toString(){
        return "Copper "+Double.toString(this.getWeight())+" gr";
    }
}


class Silver extends Metal {


    @Override
    public double getConductivity() {
        return 6.2*Math.pow(10,7);
    }

    @Override
    public double getResistivity() {
        return 1.6*Math.pow(10,-8);
    }
    @Override
    public String toString(){
        return "Silver "+Double.toString(this.getWeight())+" gr";
    }
}


class Gold extends Metal {


    @Override
    public double getConductivity() {
        return 4.2*Math.pow(10,7);
    }

    @Override
    public double getResistivity() {
        return 2.4*Math.pow(10,-8);
    }
    @Override
    public String toString(){
        return "Gold "+Double.toString(this.getWeight())+" gr";
    }
}

