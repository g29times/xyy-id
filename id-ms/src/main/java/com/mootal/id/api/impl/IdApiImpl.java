package com.mootal.id.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mootal.id.api.IdApi;
import com.mootal.id.service.IdService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * . _________         .__   _____   __
 * ./   _____/__  _  __|__|_/ ____\_/  |_
 * .\_____  \ \ \/ \/ /|  |\   __\ \   __\
 * ./        \ \     / |  | |  |    |  |
 * /_______  /  \/\_/  |__| |__|    |__|
 * .       \/
 *
 * @author li tong
 * @date 2019/10/15 11:52
 * @see Object
 * @since 1.0
 */
@Service(version = "1.0.0")
public class IdApiImpl implements IdApi {

  @Autowired
  private IdService idService;

  @Override
  public long getId(String key) {
    return idService.getId(key);
  }

}
