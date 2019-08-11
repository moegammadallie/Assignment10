package Domain.demography;

public class Gender {

    private int id;
    private String description;

    private Gender(){
    }

    public Gender(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }


    public int getId(){
        return id;
    }

    public String getDesc(){
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }


    public static class Builder {
        private int id;
        private String description;

        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder desc(String desc){
            this.description = desc;
            return this;
        }

        public Gender build(){
            return new Gender(this);
        }
    }
}
