/*
 * Copyright By ZATI
 * Copyright By 3a3c88295d37870dfd3b25056092d1a9209824b256c341f2cdc296437f671617
 * All rights reserved.
 *
 * If you are not the intended user, you are hereby notified that any use, disclosure, copying, printing, forwarding or
 * dissemination of this property is strictly prohibited. If you have got this file in error, delete it from your system.
 */
package com.usthe.common.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.context.ApplicationContext;

/**
 * Created by za-jiangliwen on 2022/10/17
 *
 * @author za-jiangliwen
 * @date 2022/10/17
 */
@Slf4j
public class EhCacheUtil {

    /**
     * 获取Cache
     *
     * @author hkt
     * @date 2021/3/1 12:49
     */
    public static Cache getCache() {
        return null;
    }

    /**
     * 添加缓存数据
     *
     * @param key   键
     * @param value 值
     * @author hkt
     * @date 2021/3/1 12:50
     */
    public static void put(String key, Object value) {
        try {
            Cache cache = getCache();
            cache.put(key, value);
        } catch (Exception e) {
            log.error("添加缓存失败：{}", e.getMessage());
        }
    }

    /**
     * 获取缓存数据
     *
     * @param key 键
     * @return 缓存数据
     * @author hkt
     * @date 2021/3/1 12:53
     */
    public static <T> T get(String key) {
        try {
            Cache cache = getCache();
            return (T) cache.get(key).get();
        } catch (Exception e) {
            log.error("获取缓存数据失败：", e);
            return null;
        }
    }

    /**
     * 删除缓存数据
     *
     * @param key 键
     * @author hkt
     * @date 2021/3/1 12:53
     */
    public static void delete(String key) {
        try {
            Cache cache = getCache();
            cache.evict(key);
        } catch (Exception e) {
            log.error("删除缓存数据失败：", e);
        }
    }

    /**
     * @author hkt
     * @date 2021/3/1 12:02
     */
    private void EhCacheUtils() {
    }
}
