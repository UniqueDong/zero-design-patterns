package com.zero.design.actions.iterator.scene;

import java.util.Iterator;

/**
 * 具体迭代器,可以删除，使用jdk的迭代器
 * Created by ljq97 on 2017/7/4.
 */
public class DinnerMenuIterator implements Iterator {
    private MenuItem[] items;

    // position记录当前数组遍历的位置
    private static int position = 0;
    // 构造器需要被传入一个菜单项的数组当做参数
    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    // 我们需要实现remove()方法。因为使用的是固定长度的数组，
    // 所以在remove()方法被调用时，我们将后面的所有元素往前移动一个位置。
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        if (items[position - 1] != null) {
            for (int i = position-1; i < (items.length - 1); i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }
    }

}
