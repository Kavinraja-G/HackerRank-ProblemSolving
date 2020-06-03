
public class main
{
    static String t(int a){
        switch(a){
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "forteen";
            case 15: return "quarter";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            case 20: return "twenty";
            case 21: return "twenty one";
            case 22: return "twenty two";
            case 23: return "twenty three";
            case 24: return "twenty four";
            case 25: return "twenty five";
            case 26: return "twenty six";
            case 27: return "twenty seven";
            case 28: return "twenty eight";
            case 29: return "twenty nine";
            case 30: return "half";
            default: return "not found";
        }
    }

    static String timeInWords(int h, int m) {
        String time = "";
        String hour;
        String minute;
        if(m==0){
            hour = t(h);
            time = hour + " o' clock";
        }
        else if(m==1){
            hour = t(h);
            time = "one minute past " + hour;
        }
        else if(m<=20 || m==30){
            hour = t(h);
            minute = t(m);
            time = minute + " past " + hour;
        }
        else if(m>20 && m<30){
            hour = t(h);
            minute = t(m);
            time = minute + " minutes past " + hour;
        }
        else if(m==45){
            hour = t(h+1);
            time = "quarter to " + hour;
        }
        else{
            hour = t(h+1);
            minute = t(60-m);
            time = minute + " minutes to " + hour;
        }
        return time;
    }
}