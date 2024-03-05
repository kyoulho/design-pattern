package singleton;

public class SingleToneObject {
    /*
       volatile 키워드를 사용하면 해당 변수에 대한 모든 쓰기 연산이 메인 메모리에 즉시 반영되어, 다른 스레드에서 읽을 때 항상 최신 값을 얻을 수 있다.
     */
    private volatile static SingleToneObject instance;

    private SingleToneObject() {
    }

    public void doSomething() {

    }

    public static SingleToneObject getInstance() {
        if (instance == null) {
            synchronized (SingleToneObject.class) {
                if (instance == null) instance = new SingleToneObject();
            }
        }
        return instance;
    }
}
