package com.practic.pattern.abstract_factory.juja;

public class Client {

    // заметь, клиент ничего не знает ни про реализацию Creator
    // ни про реализацию Products - кругом одни абстракции
    public Product2 process(AbstractFactory factory) {
        Product1 product1 = factory.createProduct1();
        Product2 product2 = factory.createProduct2();
        Product3 product3 = factory.createProduct3();

    // тут может быть что угодно
        String one = product3.getOne();
        String processOne = product1.process(one);
        product2.setOne(processOne);

        String another = product3.getAnother();
        String processAnother = product1.process(another);
        product2.setAnother(processAnother);

        return product2;
    }
}
