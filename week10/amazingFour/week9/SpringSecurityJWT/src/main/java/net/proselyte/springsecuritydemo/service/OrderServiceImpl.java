package net.proselyte.springsecuritydemo.service;

import net.proselyte.springsecuritydemo.entity.Order;
import net.proselyte.springsecuritydemo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> listOrder() {
        return orderRepository.findAll();
    }

    @Override
    public void deleteOrder(long orderId) {
        orderRepository.deleteById(orderId);

    }

    @Override
    public void updateOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public Optional<Order> getOrder(long orderId) {
        return orderRepository.findById(orderId);
    }

//    private Order toEntity(OrderModel orderModel) {
//        Order order = new Order();
//        order.setId(orderModel.getId());
//        order.setUser(orderModel.getUser());
//        order.setProductList(orderModel.getProductList());
//        return order;
//    }
}
