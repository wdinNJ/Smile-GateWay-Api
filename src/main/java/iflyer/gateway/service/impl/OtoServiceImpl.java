package iflyer.gateway.service.impl;

import org.springframework.stereotype.Service;

import iflyer.gateway.core.APIMapping;
import iflyer.gateway.http.RequestMethod;
import iflyer.gateway.modle.OrderInfo;
import iflyer.gateway.service.OtoService;

/**
 * @Package: iflyer.gateway.service.impl
 * @Description: ${todo}
 * @author: liuxin
 * @date: 2017/9/19 上午11:11
 */
@Service
public class OtoServiceImpl implements OtoService {
  @Override
  public void payment(String orderId) {

  }

  @APIMapping(value = "biz.api.order", method = RequestMethod.GET)
  public OrderInfo getOrderInfo(String orderId) {
    OrderInfo orderInfo = OrderInfo.builder().id(orderId).name("测试订单").price(12.2).build();
    return orderInfo;
  }

  @APIMapping(value = "biz.api.order2", method = RequestMethod.POST)
  public OrderInfo getOrderDo(OrderInfo orderInfo) {
    return orderInfo;
  }
}
