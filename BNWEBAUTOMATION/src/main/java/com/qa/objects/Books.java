package com.qa.objects;

import com.qa.utils.JacksonUtils;

import java.io.IOException;

public class Books {
    private int id;
    private String name;

    public Books(){}

    public Books(int id) throws IOException {
        Books[] products = JacksonUtils.deserializeJson("books.json", Books[].class);
        for(Books product: products){
            if(product.getId() == id){
                this.id = id;
                this.name = product.getName();
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

