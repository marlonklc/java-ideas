package com.marlonklc.ideas.fluentinterface.domain;

public class Sale {

    private Salesman salesman;
    private Client client;
    private DiscountCoupon discountCoupon;
    private Products products;

    public Sale(Salesman salesman) {
        this.salesman = salesman;
        this.products = Products.of();
    }

    public Sale toClient(String clientName) {
        this.client = Client.of(clientName);
        return this;
    }

    public Sale withDiscount(Double value) {
        this.discountCoupon = DiscountCoupon.of(value);
        return this;
    }

    public Sale product(String productName, Double productValue) {
        Product product = new Product(productName, productValue);
        this.products.add(product);
        return this;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public Client getClient() {
        return client;
    }

    public DiscountCoupon getDiscountCoupon() {
        return discountCoupon;
    }

    public Products getProducts() {
        return products;
    }

    public int sizeOfProducts() {
        return this.products.getProducts().size();
    }

    @Override
    public String toString() {
        return "Sale{" +
                "salesman=" + salesman +
                ", client=" + client +
                ", discountCoupon=" + discountCoupon +
                ", products=" + products +
                '}';
    }
}
