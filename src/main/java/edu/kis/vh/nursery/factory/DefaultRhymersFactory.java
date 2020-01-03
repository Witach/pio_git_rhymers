package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Klasa jest zgodna z wzorcem projektowym fabryki.
 * Wytwarza ona poszczegulne instancje klas dzidziczących po  DefaultCountingOutRhymer
 */
public class DefaultRhymersFactory implements RhymersFactory {
    /**
     * @return nową instancje klasy DefaultCountingOutRhymer
     */
    // TODO zaimplementuj Enum który opisuje typy Rhymers,
    //  zaimplementuj statyczną metodę która przyjmuje Enum oraz zwraca odpowiedni Rhymer na podstawie pobranej wartości
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return zwraca nową instancje klasy DefaultCountingOutRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return zwraca nową instancje klasy FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * @return zwraca nową instancje klasy HanoiRhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
