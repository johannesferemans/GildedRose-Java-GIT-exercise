package com.gildedrose;

import com.gildedrose.core.GildedRose;
import com.gildedrose.core.Item;
import com.gildedrose.items.NormalItem;
import com.gildedrose.items.SwitchItem;

public class SwitchItemTest {
    public static void main(String[] args) {
        Item[] items = new Item[] {new SwitchItem("+5 Dexterity Vest", 10, 20)};
        GildedRose app = new GildedRose(items);

        app.items[0].updateQuality();
        System.out.println(items[0].toString());

    }


}
