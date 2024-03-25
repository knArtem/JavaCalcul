public class RomeCalc extends ArabCalc{
    public RomeCalc(RomeNum o1, RomeNum o2, String operation) {
        super(o1.ordinal()+1, o2.ordinal()+1, operation);

    }

    private String int2RomeNum(int x) throws Exception {
        //System.out.println(x);
        if (x<=0)
            throw new Exception("В римской системе нет чисел, меньше 1");
        else
        if (x<=10)
            return RomeNum.values()[x-1].toString();
        else if (x>10 & x<20)
            return "X"+ int2RomeNum(x % 10);
        else if (x>=20 & x<30)
            if (x==20)
                return "XX";
            else
                return "XX"+ int2RomeNum(x%20);
        else if (x>=30 & x<40)
            if (x==30)
                return "XXX";
            else
                return "XXX"+ int2RomeNum(x%30);
        else if (x>=40 & x<50)
            if (x==40)
                return "XL";
            else
                return "XL"+ int2RomeNum(x%40);
        else if (x>=50 & x<60)
            if (x==50)
                return "L";
            else
                return "L"+ int2RomeNum(x%50);
        else if (x>=60 & x<70)
            if (x==60)
                return "LX";
            else
                return "LX"+ int2RomeNum(x%60);
        else if (x>=70 & x<80)
            if (x==70)
                return "LXX";
            else
                return "LXX"+ int2RomeNum(x%70);
        else if (x>=80 & x<90)
            if (x==80)
                return "LXXX";
            else
                return "LXXX"+ int2RomeNum(x%80);
        else if (x>=90 & x<100)
            if (x==90)
                return "XC";
            else
                return "XC"+ int2RomeNum(x%90);
        else
            return "C";

    }

    @Override
    protected String print_result() throws Exception {
        return int2RomeNum(this.result);
    }
}
