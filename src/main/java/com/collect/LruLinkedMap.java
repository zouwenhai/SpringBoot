package com.collect;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zouwenhai
 * @version v1.0
 * @date 2019/10/14 13:48
 * @work //lru算法
 */
public class LruLinkedMap<K, V> extends LinkedHashMap {

    private int size;

    public LruLinkedMap(int initialCapacity,
                        float loadFactor,
                        boolean accessOrder) {
        super(initialCapacity, loadFactor, accessOrder);
        this.size = initialCapacity;
    }

    /**
     * @description 重写LinkedHashMap中的removeEldestEntry方法，当LRU中元素多余6个时，
     * 删除最不经常使用的元素
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        if (size() > size) {
            return true;
        }
        return false;
    }





}
