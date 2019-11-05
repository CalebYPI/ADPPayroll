package com.ruiters.caleb.domain.demography;

public class Gender {
    private String id, desc;

    private Gender() { }

    private Gender(Builder builder){
        this.id = builder.id;
        this.desc = builder.desc;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static class Builder {
        private String id, desc;

        public Builder GenderId(String id) {
            this.id = id;
            return this;
        }

        public Builder GenderDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Gender build() {
            return new Gender(this);
        }
    }
}
