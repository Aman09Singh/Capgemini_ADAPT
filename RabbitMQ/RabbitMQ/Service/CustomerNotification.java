package com.example.rabbitmqassignment.Service;
import com.example.rabbitmqassignment.Model.Customer;
import com.example.rabbitmqassignment.RabbitMQConfig;
import com.example.rabbitmqassignment.Repo.CustomerRepo;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerNotification {

    @Autowired
    CustomerRepo customerRepo;

    @RabbitListener(queues = RabbitMQConfig.queueName)
    public void consumeMess(Customer customer){
        customerRepo.save(customer);
        System.out.println("Customer successfully added to Database");
    }
}
