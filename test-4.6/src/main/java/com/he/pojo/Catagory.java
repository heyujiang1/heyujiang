package com.he.pojo;

public class Catagory {
    private int id;
    private String typename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public String toString() {
        return "Catage{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                '}';
    }
}
