package iflyer.gateway.service;

import org.springframework.stereotype.Service;

import iflyer.gateway.modle.OrderInfo;

/**
 * @Package: iflyer.gateway.service
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/9/19 上午11:06
 */
@Service
public interface OtoService {
  void payment(String orderId);

  OrderInfo getOrderInfo(String orderId);


  OrderInfo getOrderDo(OrderInfo orderInfo);

}
