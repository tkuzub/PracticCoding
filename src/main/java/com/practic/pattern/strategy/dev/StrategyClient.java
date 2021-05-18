package com.practic.pattern.strategy.dev;

public class StrategyClient {
    private SortSelect sortSelect;

    public void setSortSelect(SortSelect sortSelect) {
        this.sortSelect = sortSelect;
    }

    public void sortPerform(int[] array) {
        sortSelect.sort(array);
    }
}
