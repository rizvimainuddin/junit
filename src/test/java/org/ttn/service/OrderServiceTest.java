package org.ttn.service;

import org.junit.Test;
import org.ttn.domain.Order;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.*;

public class OrderServiceTest {

    @Test
    public void testPlaceOrderWithOneArgument() {
        Order order = mock(Order.class);
        OrderService orderServiceMock = mock(OrderService.class);
        orderServiceMock.placeOrder(order);
        verify(orderServiceMock).placeOrder(order);
    }

    @Test
    public void testPlaceOrderWithTwoArguments() {
        OrderService orderServiceMock = mock(OrderService.class);
        when(orderServiceMock.placeOrder(any(Order.class), anyString())).thenReturn(true);
        assertTrue(orderServiceMock.placeOrder(new Order(), "Order Placed"));
    }
}