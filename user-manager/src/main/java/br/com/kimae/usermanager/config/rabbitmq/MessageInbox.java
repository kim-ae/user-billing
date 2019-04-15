package br.com.kimae.usermanager.config.rabbitmq;

public class MessageInbox implements AMQPMessage {
    @Override
    public String getExchange() {
        return null;
    }

    @Override
    public String getRoutingKey() {
        return null;
    }
}
