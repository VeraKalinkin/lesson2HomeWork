package server;

public interface Repository<T> {
    void save(T text);
    T load();
}
