package br.com.kimae.usermanager.config.rabbitmq;

public class MessageOutbox implements AMQPMessage {

    private final String exchange;
    private final String routingKey;

    public MessageOutbox(final String routingKey){
        this.routingKey = routingKey;
        this.exchange = routingKey.substring(0, routingKey.indexOf("."));
    }

    @Override
    public String getExchange() {
        return exchange;
    }

    @Override
    public String getRoutingKey() {
        return routingKey;
    }
}
