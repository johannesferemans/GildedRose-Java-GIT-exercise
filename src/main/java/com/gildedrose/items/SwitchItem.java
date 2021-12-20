package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends NormalItem {
    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        raiseQuality();
        lowerQuality();
    }

    @Override
    public String toString() {
        return "SwitchItem{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }

    public void raiseQuality() {
        if (this.sellIn >= 0 && this.quality<50)
        {
            this.quality++;
        }
    }

    public void lowerQuality() {
        if (this.sellIn < 0 && this.quality>0)
        {
            this.quality--;
        }
    }


}
