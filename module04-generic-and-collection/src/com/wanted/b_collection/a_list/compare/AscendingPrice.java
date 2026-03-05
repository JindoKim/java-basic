package com.wanted.b_collection.a_list.compare;

import com.wanted.b_collection.a_list.dto.BookDTO;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class AscendingPrice implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;
        if (o1.getPrice() > o2.getPrice()) {
            result = 1;
        } else if(o2.getPrice() > o1.getPrice()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    @Override
    public Comparator<BookDTO> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<BookDTO> thenComparing(Comparator<? super BookDTO> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<BookDTO> thenComparing(Function<? super BookDTO, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<BookDTO> thenComparing(Function<? super BookDTO, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<BookDTO> thenComparingInt(ToIntFunction<? super BookDTO> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<BookDTO> thenComparingLong(ToLongFunction<? super BookDTO> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<BookDTO> thenComparingDouble(ToDoubleFunction<? super BookDTO> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
