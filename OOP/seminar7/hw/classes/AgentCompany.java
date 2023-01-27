package OOP.seminar7.hw.classes;

import java.util.*;

public class AgentCompany extends Agent {
    private String country;
    private String products; //названия товаров, которые продает компания-контрагент

    public AgentCompany(int id, String agentType, String fullname, List<Contact> contacts, String country,
            String products) {
        super(id, agentType, fullname, contacts);
        this.country = country;
        this.products = products;
    }

    public String getCountry() {
        return country;
    }

    public String getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return super.toString() + "country=" + country + ", products=" + products + ".";
    }


    
}