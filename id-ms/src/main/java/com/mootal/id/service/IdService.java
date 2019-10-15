package com.mootal.id.service;

/**
 * . _________         .__   _____   __
 * ./   _____/__  _  __|__|_/ ____\_/  |_
 * .\_____  \ \ \/ \/ /|  |\   __\ \   __\
 * ./        \ \     / |  | |  |    |  |
 * /_______  /  \/\_/  |__| |__|    |__|
 * .       \/
 *
 * @author li tong
 * @date 2019/8/29 11:54
 * @see Object
 * @since 1.0
 */
public interface IdService {

  /**
   * 获取id
   * @param key
   * @return
   */
  long getId(String key);

}
