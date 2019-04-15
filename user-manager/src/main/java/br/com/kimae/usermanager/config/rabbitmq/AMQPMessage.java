package br.com.kimae.usermanager.config.rabbitmq;

public interface AMQPMessage {

    String getExchange();
    String getRoutingKey();
}
