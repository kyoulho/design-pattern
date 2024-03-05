package observer;

public interface Observer {

    // 푸시 방식의 update
    void update(float temp, float humidity, float pressure);

    // 풀 방식의 update
    void update();
}
