package com.mootal.id.api;

/**
 * . _________         .__   _____   __
 * ./   _____/__  _  __|__|_/ ____\_/  |_
 * .\_____  \ \ \/ \/ /|  |\   __\ \   __\
 * ./        \ \     / |  | |  |    |  |
 * /_______  /  \/\_/  |__| |__|    |__|
 * .       \/
 *
 * 获取分布式ID
 * @author li tong
 * @date 2019/8/29 11:47
 * @see Object
 * @since 1.0
 */
public interface IdApi {

  /**
   * 获取id
   * @param key
   * @return
   */
  long getId(String key);

}
