package com.mootal.id.service.impl;

import com.mootal.id.service.IdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * . _________         .__   _____   __
 * ./   _____/__  _  __|__|_/ ____\_/  |_
 * .\_____  \ \ \/ \/ /|  |\   __\ \   __\
 * ./        \ \     / |  | |  |    |  |
 * /_______  /  \/\_/  |__| |__|    |__|
 * .       \/
 *
 * @author li tong
 * @date 2019/8/29 11:56
 * @see Object
 * @since 1.0
 */
@Service
public class IdServiceImpl implements IdService {

  private static final Logger logger = LoggerFactory.getLogger(IdServiceImpl.class);

  @Value("${leaf.zk.list}")
  private String zkAdress;

  @Value("${server.port}")
  private String port;

  @Override
  public long getId(String key) {
    long id = 1L;
    logger.debug("caller key: {}, id={}", key, id);
    return id;
  }

}
