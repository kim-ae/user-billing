package br.com.kimae.usermanager.config.rabbitmq;

public interface Messaging {

    MessageOutbox CALCULATE_BILL = new MessageOutbox("bill.calculate.message");
}
