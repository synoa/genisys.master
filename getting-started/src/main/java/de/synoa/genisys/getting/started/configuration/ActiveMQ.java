package de.synoa.genisys.getting.started.configuration;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.activemq.pool.PooledConnectionFactory;
import org.apache.camel.component.jms.JmsConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.synoa.genisys.getting.started.App;

@Configuration
public class ActiveMQ {

    @Bean(name = "pooledConnectionFactory", initMethod = "start", destroyMethod = "stop")
    public PooledConnectionFactory createActiveMQConnectionPool(@Value("${activemq.url}") String brokerURL) {

        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerURL);
        connectionFactory.setClientID(App.class.getPackage().getName());

        PooledConnectionFactory connectionPool = new PooledConnectionFactory(connectionFactory);
        connectionPool.setMaxConnections(1);
        connectionPool.setReconnectOnException(true);

        return connectionPool;
    }

    @Bean(name = "activemq")
    public ActiveMQComponent createActiveMQComponent(@Value("${activemq.url}") String brokerURL) {

        JmsConfiguration jmsConfiguration = new JmsConfiguration(createActiveMQConnectionPool(brokerURL));
        jmsConfiguration.setConcurrentConsumers(1);

        ActiveMQComponent activeMQComponent = new ActiveMQComponent();
        activeMQComponent.setConfiguration(jmsConfiguration);
        activeMQComponent.setTransacted(true);

        return activeMQComponent;
    }

}
