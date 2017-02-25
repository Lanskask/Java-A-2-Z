package ru.smurtazin.Collections.services.generics;

/**
 * Created by a1 on 24.02.17.
 */
public interface Store<T extends Base> {

    void add(T newValue);

    void update(String id, T newValue) throws Exception;

    void delete(String id) throws Exception;
}
