package Domain.demography;

public class Race {
    private int raceNum;
    private String desc;

    private Race(){
    }

    public Race(Builder builder){
        this.raceNum = builder.raceID;
        this.desc = builder.desc;
    }

    public int getRaceNum(){
        return raceNum;
    }

    public void setRaceNum(int raceNum){
        this.raceNum = raceNum;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Race{" +
                "raceNum='" + raceNum + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static class Builder {
        private int raceID;
        private String desc;

        public Builder raceID(int raceID){
            this.raceID = raceID;
            return this;
        }

        public Builder desc(String desc){
            this.desc = desc;
            return this;
        }

        public Race build(){
            return new Race(this);
        }
    }
}
