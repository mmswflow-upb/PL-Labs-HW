public class Year{

    private Boolean leap = false;
    private Day[] days = new Day[0];
    private int year = 0;

    public Year(int y){

        this.year = y;

        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)){

            this.leap = true;
        }
    }

    public void addDay(int d,int m, Double h, Double l, int p, int s){

        Day[] newDays = new Day[this.days.length+1];

        if (this.leap == false && d == 29 && m == 2){

            return;
        }

        for (int i = 0; i < this.days.length; i++){

            newDays[i] = this.days[i];
        }
        newDays[newDays.length - 1] = new Day(m ,h ,l , p, s);
        this.days = newDays;
    }

    public Double getAveragePrec(){

        Double res = 0.0;

        for (int x = 0; x < this.days.length; x++){

            res += this.days[x].getPrecipitation();
        }

        return res/this.days.length;
    }

    public Double getAverageSnow(){

        Double res = 0.0;

        for (int x = 0; x < this.days.length; x++){

            res += this.days[x].getSnow();
        }

        return res/this.days.length;
    }

    public int getYear(){

        return this.year;
    }

    public Double monthHigh(int m){

        Double res = this.days[1].getHigh();

        for (int i =1 ; i < this.days.length; i++){

            if (this.days[i].getMonth() == m){

                if (this.days[i].getHigh() > res){

                    res = this.days[i].getHigh();
                }
            }else if (this.days[i].getMonth() > m){
                
                break;
            }
        }
        return res;
    }

    public Double monthLow(int m){

        Double res = this.days[1].getLow();

        for (int i =1 ; i < this.days.length; i++){


            if (this.days[i].getMonth() == m){

                if (this.days[i].getLow() < res){

                    res = this.days[i].getLow();
                }
            }else if (this.days[i].getMonth() > m){
                
                break;
            }
        }
        return res;
    }
}